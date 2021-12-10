package myproject;

public class test5_27 {
	public static void main(String[] args) {
		int i,count=0,p=0;
		for(i=101;i<=2100;i++) {
			if(i%4==0 && i%100!=0 || i%400==0) {
				count++;
				p++;
				if(p==10) {
					System.out.println(i);
					p=0;
				}
				else
					System.out.printf("%d ",i);
			}
		}
		System.out.println();
		System.out.print(count);
	}
}
