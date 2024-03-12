import java.util.Scanner;
public class Ques5 {
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int a=n%10;
            sum+=a;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a no. : ");
        int n=sc.nextInt();
        int sum=sumOfDigits(n);
        while(sum>=10){
            sum=sumOfDigits(sum);
        }
        System.out.println("Sum of digits of "+n+"= "+sum);
    }
}
