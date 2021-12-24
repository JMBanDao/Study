import java.util.Date;
public class test9_3 {
    public static void main(String[] args){
        Date date=new Date(10000);
        for(int i=0;i<8;i++){
            System.out.println(date.toString());
            date.setTime(date.getTime()*10);
        }
    }
}