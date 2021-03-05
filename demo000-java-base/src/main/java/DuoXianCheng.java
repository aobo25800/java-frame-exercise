import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DuoXianCheng {
    private static final Lock lock = new ReentrantLock(true);
    public static void main(String[] ar){
        for (int i = 0; i < 10; i ++) {
            new Thread(() -> {
                try {
                    func();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i) + "\t").start();
        }
    }

    public static void func() throws InterruptedException {

        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "运行");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
