package myproject;
import java.util.Scanner;
public class mythird {
	public static void main(String[] args) {
		int i,j,p;
		double pi;
		for(i=10000;i<=100000;i+=10000) {
			pi=0;
			p=1;
			for(j=1;j<=2*i-1;j+=2) {
				pi+=p/(double)j;
				p=-p;
			}
			System.out.println(4.0*pi);
		}
	}
}