public class $_155_join_method_in_thread {
    public static void main(String[] args) throws InterruptedException {
        Thread11 t1=new Thread11();
        //t1.join(1000);
        Thread22 t2=new Thread22();
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
class Thread11 extends Thread{
    @Override
    public void run() {
        try{
            for(int i=1;i<=10;i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}

class Thread22 extends Thread{
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


