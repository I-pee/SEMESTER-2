import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product ob[]=new Product[5];
        for (int i=0; i<5;i++){
            System.out.println("enter product id: ");
            int pid=sc.nextInt();
            System.out.print("enter price: ");
            double p=sc.nextDouble();
            System.out.print("enter quantity: ");
            int q=sc.nextInt();
            ob[i]=new Product(pid,p,q);
            Product.totalPrice+=p*q;
        }
        System.out.println("PId\tPrice\tQuantity");
        for (int i=0;i<5;i++)
            ob[i].display();
        System.out.println("Total Price= "+Product.totalPrice);


    }
}
class Product{
    int prodId;
    double price;
    int quantity;
    static double totalPrice;
    Product(int pid,double pr,int qty){
        prodId=pid;
        price=pr;
        quantity=qty;
    }
    void display(){
        System.out.println(prodId+"\t"+price+"\t"+quantity);
    }
}