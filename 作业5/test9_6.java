import java.util.Date;
import java.util.Random;
public class test9_6 {
    public static void main(String[] args) {
        Random r=new Random();
        StopWatch watch =new StopWatch();
        int[] a=new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i]=r.nextInt();
        }
        watch.start();
        for (int i = 0; i < 99999; i++) {
            int min=a[i];
            int p=i;
            for (int j = i+1; j < 100000; j++) {
                if(a[j]<min){
                    min=a[j];
                    p=j;
                }
            }
            int temp=a[i];
            a[i]=a[p];
            a[p]=temp;
        }
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}

class StopWatch{
    Date startTime,endTime;
    StopWatch(){
        startTime = new Date();
    }
    public void start(){
        startTime = new Date();
    }
    public void stop(){
        endTime=new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime()-startTime.getTime();
    }
}
