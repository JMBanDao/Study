import java.util.Random;
public class test9_4 {
    public static void main(String[] args){
        Random r=new Random(1000);
        for(int i=0;i<100;i++){
            System.out.println(r.nextInt(100));
        }
    }
}
