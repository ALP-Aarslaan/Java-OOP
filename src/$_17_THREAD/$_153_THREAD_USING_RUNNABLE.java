public class $_153_THREAD_USING_RUNNABLE {
    public static void main(String[] args) {
        thread1 thread =new thread1();
        Thread t1=new Thread(thread);
        System.out.println(t1.getName());
        t1.setName("Jonayed");
        System.out.println(t1.getName());
        t1.setPriority(Thread.MAX_PRIORITY);//Thread.MIN_PRIORITY
        System.out.println(t1.getPriority());
        t1.start();
    }
}
class thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running");
    }
}