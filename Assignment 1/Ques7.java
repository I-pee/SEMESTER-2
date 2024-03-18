import java.util.Scanner;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements in the array: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the elements of the array: ");
        for(int i=0; i<n;i++)
            arr[i]=sc.nextInt();
        int max=arr[0], min=arr[0];
        for(int i=0; i<n;i++) {
            for (int j = 1; j < n; j++) {
                if (max < arr[j])
                    max = arr[j];
                if (min > arr[j])
                    min = arr[j];
            }
        }
        int c_max=0, c_min=0;
        int max_pos=-1, min_pos=-1;
        for(int i=0; i<n;i++) {
            if(arr[i]==max) {
                c_max++;
                if (max_pos == -1)
                    max_pos = i+1;
            }
            if(arr[i]==min) {
                c_min++;
                min_pos = i+1;
            }
        }
        System.out.println("Maximum element of the array is "+max+" and occurs "+c_max+" times.");
        System.out.println("Minimum element of the array is "+min+" and occurs "+c_min+" times.");
        System.out.println("First occurrence of maximum element is at position "+max_pos);
        System.out.println("Last occurrence of minimum element is at position "+min_pos);

    }
}
