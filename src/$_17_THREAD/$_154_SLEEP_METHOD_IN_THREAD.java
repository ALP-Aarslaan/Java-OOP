public class $_154_SLEEP_METHOD_IN_THREAD {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        Thread2 t2=new Thread2();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        try{
            for(int i=1;i<=10;i++) {
                if (i % 2 == 0) {
                    Thread1.sleep(5000);
                    System.out.println(i);
                }
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        try{
            for(int i=1;i<=10;i++){
                if(i%2!=0){
                    //Thread2.sleep(5000);
                    System.out.println(i);
                }
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
