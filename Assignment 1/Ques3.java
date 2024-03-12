import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n=sc.nextInt();
        int sum=0;
        int prod=1;
        int k=n;
        while(k>0){
            int a=k%10;
            sum+=a;
            prod*=a;
            k=k/10;
        }
        System.out.println("Sum of digits= "+sum);
        System.out.println("Product of digits= "+prod);
        if(sum==prod)
            System.out.println("So "+n+" is a Spy Number");
        else
            System.out.println(n+ " is not a Spy Number");
    }
}
