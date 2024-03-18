import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no. of rows: ");
        int m= sc.nextInt();
        System.out.print("enter no. of columns: ");
        int n=sc.nextInt();
        int arr[][]=new int [m][n];
        int sum=0;
        for(int i=0;i<m;i++){
            System.out.println("enter "+(i+1)+" row elements: ");
            for (int j=0; j<n;j++)
                arr[i][j] = sc.nextInt();
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of elements of the 2-D array= "+sum);
    }
}
