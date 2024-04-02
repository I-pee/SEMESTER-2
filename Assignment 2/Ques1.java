import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        PERSOON ob1=new PERSOON();
        ob1.name="Rohan";
        ob1.age=20;
        PERSOON ob2=new PERSOON();
        ob2.getData();
        System.out.println("\nDetails of Student 1: ");
        ob1.displayData();
        System.out.println("Details of Student 2: ");
        ob2.displayData();

    }
}
class PERSOON{
    int age;
    String name;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first name: ");
        name=sc.next();
        System.out.print("enter age: ");
        age=sc.nextInt();
    }
    void displayData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}