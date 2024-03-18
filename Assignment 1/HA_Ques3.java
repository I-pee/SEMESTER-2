import java.util.Scanner;
public class HA_Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements in array A & B: ");
        int m=sc.nextInt();
        System.out.println("Enter elements of A: ");
        int A[]=new int[m];
        for(int i=0; i<m;i++)
            A[i]=sc.nextInt();
        int B[]=new int[m];
        int []C=new int[m];
        System.out.println("Enter elements of B:");
        for(int i=0; i<m;i++) {
            B[i] = sc.nextInt();
            C[i] = A[i] * B[i];
        }
        System.out.println("Dot product of A & B: ");
        for(int i:C)
            System.out.print(i+" ");
    }
}
