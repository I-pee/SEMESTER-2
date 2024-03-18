public class Ques4 {
    public static void main(String[] args) {
        char arr[]={'c','a','r','b','o','n'};
        for (int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                for (int k=0; k<3; k++) {
                    if (i!=j && j!=k && i!=k)
                        System.out.println("" + arr[i] + arr[j]+arr[k]);
                }
            }
        }
    }
}
