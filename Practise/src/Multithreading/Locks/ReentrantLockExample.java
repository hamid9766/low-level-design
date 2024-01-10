package Multithreading.Locks;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    boolean isAvailable = false;

    public void producer(ReentrantLock reentrantLock){
        try{
            reentrantLock.lock();
            System.out.println("Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception e){

        }
        finally {
            reentrantLock.unlock();
            System.out.println("Lock released by : " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        // Using only one common lock in all thread with different class object
        ReentrantLock lock = new ReentrantLock();

        ReentrantLockExample s1 = new ReentrantLockExample();
        Thread thread1 = new Thread(()-> {
            s1.producer(lock);
        });

        ReentrantLockExample s2 = new ReentrantLockExample();
        Thread thread2 = new Thread(()-> {
            s2.producer(lock);
        });

        ReentrantLockExample s3 = new ReentrantLockExample();
        Thread thread3 = new Thread(()-> {
            s3.producer(lock);
        });

        ReentrantLockExample s4 = new ReentrantLockExample();
        Thread thread4 = new Thread(()-> {
            s4.producer(lock);
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    /* Output Expected - Thread order may vary
        Lock acquired by : Thread-0
        Lock acquired by : Thread-1
        Lock released by : Thread-0
        Lock released by : Thread-1
        Lock acquired by : Thread-2
        Lock released by : Thread-2
        Lock acquired by : Thread-3
        Lock released by : Thread-3
     */

}
