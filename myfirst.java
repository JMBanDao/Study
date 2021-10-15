package myproject;
import java.util.Scanner;
public class myfirst {
	public static void main(String[] args) {
		double a = 10000;
		double b,c;
		b=a*Math.pow(1.05, 10);
		c=b+b*1.05+b*1.05*1.05+b*1.05*1.05*1.05;
		System.out.println(c);
	}
}