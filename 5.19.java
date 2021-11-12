package myproject;
import java.util.Scanner;
public class mythird {
	public static void main(String[] args) {
		int i,j;
		double p,num;
		for(i=1;i<=8;i++) {
			for(j=1;j<=4*8-1;j++) {
				p=Math.abs((2.0*8.0+1.0-(double)j)/2.0);
				if(j%2==1 && p<=i-1  ) {
					num=Math.pow(2,i-(int)p-1);
					System.out.printf("%3.0f",num);
				}
				else if(j%2==1){
					System.out.print("   ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}