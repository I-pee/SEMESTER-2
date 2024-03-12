import java.util.Scanner;
public class Ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. greater than 2: ");
        int n=sc.nextInt();
        int c=0;
        if (n>2){
            int k=n;
            while(k>2){
                k/=2;
                c++;
            }

        }
        System.out.println(n+" can be repeatedly divided by 2, to get a no. less than 2: "+c+" Times.");

    }

}
