package myproject;
import java.util.Scanner;
public class test7_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] a = new double[10];
		for(int i = 0;i<10;i++) {
			double n = input.nextDouble();
			a[i]=n;
		}
		MSort(a);
		for(int j = 0;j<10;j++)
			System.out.printf("%.0f ",a[j]);
	}
	public static void MSort(double[] a) {
		for(int i = 0;i<a.length-1;i++) {
			for(int j = a.length-1;j>i;j--) {
				if(a[j]<a[j-1]) {
					double temp = a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
}

