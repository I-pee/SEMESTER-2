import java.util.Scanner;
public class Ques10 {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum=0;
        for (int i=0; i<m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j == columnIndex)
                    sum += m[i][j];
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
        System.out.print("enter column no. whose sum you want: ");
        int col= sc.nextInt();
        double sum=sumColumn(arr,col);
        System.out.println("Sum of elements in column "+col+" is= "+sum);

    }
}
