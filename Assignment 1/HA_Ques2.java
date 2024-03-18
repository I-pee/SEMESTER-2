import java.util.Scanner;
public class HA_Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of lines: ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("enter your lines: ");
        sc.nextLine();
        for (int i=0; i<n;i++)
            arr[i]=sc.nextLine();
        System.out.println(arr.length);
        for(String i:arr)
            System.out.println(i);
        System.out.println("The lines in reverse order: ");
        for(int i=arr.length-1;i>=0;i--)
            System.out.println(arr[i]);

    }
}
