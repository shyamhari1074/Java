import java.util.Random;
class Generate implements Runnable{
    @Override
    public void run() {
        Random random= new Random();
        while(true){
            int num= random.nextInt(100)+2;
            System.out.println("Thread 1="+num);
            if(num%2==0){
                new Thread(new Evensum(num)).start();

            }
            else{
                new Thread(new Oddsum(num)).start();
            } try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Evensum implements Runnable{
    private int num;

    public Evensum(int num) {
        this.num=num;
    }

    public void run(){
        int sum=0;
        for(int i=2;i<=num;i+=2){

             sum+=i;
        }
        System.out.println("thread 2="+sum);
    }
}
class Oddsum implements Runnable{
    private int num;
    public Oddsum(int num){
        this.num=num;
    }

        public void  run(){
            int sum=0;
            for(int i=1;i<=num;i+=2){

                sum+=i;
            }
            System.out.println("thread3="+sum);
        }
    }

public class interfacee {
    public static void main(String[] args) {
        Thread Generator= new Thread(new Generate());
        Generator.start();
    }
}
