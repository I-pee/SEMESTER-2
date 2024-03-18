import java.util.Scanner;
public class Ques9 {
    public static double sumMajorDiagonal(double[][] m){
        double sum=0;
        for(int i=0; i<m.length;i++){
            for (int j=0;j<m[i].length;j++){
                if(i==j)
                    sum+=m[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no. of rows: ");
        int m= sc.nextInt();
        System.out.print("enter no. of columns: ");
        int n=sc.nextInt();
        double arr[][]=new double [m][n];
        for(int i=0;i<m;i++){
            System.out.println("enter "+(i+1)+" row elements: ");
            for (int j=0; j<n;j++)
                arr[i][j] = sc.nextDouble();
        }
        double sum=sumMajorDiagonal(arr);
        System.out.println("Sum of elements in the major diagonal is= "+sum);
    }

}
