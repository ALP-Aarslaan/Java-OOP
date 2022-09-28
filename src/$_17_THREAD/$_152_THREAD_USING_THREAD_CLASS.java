package $_17_THREAD;

public class $_152_THREAD_USING_THREAD_CLASS {
    public static void main(String[] args) {
        thread t1=new thread();
        t1.start();
        thread t2=new thread();
        t2.start();
    }
}
class thread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}