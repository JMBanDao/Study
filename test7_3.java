package myproject;
import java.util.Scanner;
public class test7_3 {
	public static void main(String[] args) {
		int[] a = new int[101];
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		while(true) {
			n =input.nextInt();
			if(n==0)
				break;
			a[n]++;
		}
		for(int i=1;i<=100;i++) {
			if(a[i]!=0) {
				if(a[i]==1)
					System.out.printf("%d occurs %d time\n", i,a[i]);
				else
					System.out.printf("%d occurs %d times\n", i,a[i]);
			}
		}
	}
}