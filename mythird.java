package myproject;
import java.util.Scanner;
public class mythird {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入1到15之间的整数");
		int n = input.nextInt();
		int i,j;
		double p;
		for(i=1;i<=n;i++) {
			for(j=1;j<=4*n-3;j++) {
				p=Math.abs(((double)j-2.0*(double)n+1.0)/2.0)+1.0;
				if(j%2==1 && p<=i  ) {
					System.out.print((int)p);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}