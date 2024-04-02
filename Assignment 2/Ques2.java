import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Complex ob1 =new Complex();
        ob1.setData(2,5);
        ob1.display();
        Complex ob2=new Complex();
        ob2.setData(4,3);
        ob2.display();
        Complex ob3 =new Complex();
         ob3= ob3.add(ob1, ob2);
         ob3.display();


    }
}
class Complex{
    double real;
    double imag;
    void setData(double r, double im){
        real=r;
        imag=im;
    }
    void display(){
        System.out.println(real+"+ i"+imag);
    }
    public Complex add(Complex a,Complex b){
        Complex z=new Complex();
        z.real=a.real+b.real;
        z.imag=a.imag+b.imag;
        return z;
    }
}
