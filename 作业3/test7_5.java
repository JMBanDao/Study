package myproject;
import java.util.Scanner;
public class test7_5 {
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		int count=0,p;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		for(int i=0;i<10;i++) {
			int n = input.nextInt();
			p=0;
			for(int j=0;j<i;j++) {
				if(n==a[j]) {
					p=1;
					break;
				}
			}
			a[i]=n;
			if(p!=1) {
				b[count]=n;
				count++;
			}
		}
		System.out.printf("The number of distinct numbers is %d\n", count);
		System.out.print("The distinct numbers are: ");
		for(int k = 0;k<count-1;k++) {
			System.out.printf("%d ",b[k]);
		}
		System.out.printf("%d",b[count-1]);
	}
}