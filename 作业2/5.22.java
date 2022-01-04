package myproject;
import java.util.Scanner;
public class mythird {
	public static void main(String[] args) {
		int i;
		double rate=0.04875,mp,tp;
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		int amount = input.nextInt();
		System.out.print("Number of Years: ");
		int year = input.nextInt();
		System.out.printf("%-18s","Interest Rate");
		System.out.printf("%-18s","Monthly Payment");
		System.out.printf("%-18s\n","Total Payment");
		for(i=0;i<=24;i++) {
			rate=rate+0.00125;
			mp=amount*rate/(1-1/Math.pow(1+rate, year*12));
			tp=mp*year*12;
			System.out.printf("%6.3f%%%11s",rate*100,"");
			System.out.printf("%-18.2f",mp);
			System.out.printf("%-18.2f\n",tp);
		}
	}
}