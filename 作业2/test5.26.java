package myproject;
public class test5_25 {
	public static void main(String[] args) {
		int i,j,k;
		double e,p;
		for(i=10000;i<=100000;i+=10000) {
			e=1.0;
			p=1.0;
			for(j=1;j<=i;j++) {
				p/=j;
				e+=p;
			}
			System.out.println(e);
		}
	}
}
