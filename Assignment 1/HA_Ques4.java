import java.util.Scanner;
public class HA_Ques4 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        double [][]c=new double[a.length][a[a.length-1].length];
        if(a.length==b.length){
            for(int i=0; i<a.length;i++){
                if(a[i].length==b[i].length){
                    for(int j=0; j<a[i].length;j++)
                        c[i][j]=a[i][j]+b[i][j];
                }
                else
                    System.out.println("dimensions of arrays does not match.");
            }
        }
        else
            System.out.println("dimensions of arrays does not match.");
        return c;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of rows of A: ");
        int m=sc.nextInt();
        System.out.println("Enter no. of columns of A: ");
        int n = sc.nextInt();
        double A[][]=new double[m][n];

        for(int i=0; i<m;i++) {
            System.out.println("Enter elements of "+(i+1)+" row of A: ");
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextDouble();
        }
        System.out.println("Enter no. of rows of B: ");
        int o=sc.nextInt();
        System.out.println("Enter no. of columns of B: ");
        int p = sc.nextInt();
        double B[][]=new double[o][p];

        for(int i=0; i<o;i++) {
            System.out.println("Enter elements of "+(i+1)+" row of B: ");
            for (int j = 0; j < p; j++)
                B[i][j] = sc.nextDouble();
        }
        double c[][]=addMatrix(A,B);
        System.out.println("Sum of matrix A & B: ");
        for(int i=0; i<c.length;i++){
            for(double j:c[i])
                System.out.print(j+" ");
            System.out.println();
        }
    }

}
