import java.sql.SQLOutput;
import java.util.Scanner;

public class test9_10 {
    public static void main(String[] args) {
        System.out.println("输入a,b,c的值：");
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        QuadraticEquation p=new QuadraticEquation(a,b,c);
        if(p.getDiscriminant()>0){
            System.out.println(p.getRoot1());
            System.out.println(p.getRoot2());
        }
        else if(p.getDiscriminant()==0)
            System.out.println(p.getRoot1());
        else
            System.out.println("The equation has no roots.");
    }
}

class QuadraticEquation{
    double a,b,c;
    QuadraticEquation(){
        a=1;
        b=1;
        c=1;
    }
    QuadraticEquation(double newa,double newb,double newc){
        a=newa;
        b=newb;
        c=newc;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }

    public double getRoot1(){
        if(getDiscriminant()>=0)
            return (Math.pow(b*b-4*a*c,0.5)-b)/2*a;
        else
            return 0.0;
    }
    public double getRoot2(){
        if(getDiscriminant()>=0)
            return (-Math.pow(b*b-4*a*c,0.5)-b)/2*a;
        else
            return 0.0;
    }
}
