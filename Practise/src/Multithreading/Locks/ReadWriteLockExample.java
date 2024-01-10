package Multithreading.Locks;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


/*
    Facilitates concurrent reading and exclusive writing. Ideal when the data structure is mostly read,
    enabling multiple threads to read simultaneously while ensuring exclusive access during write operations
 */
public class ReadWriteLockExample {
    boolean isAvailable = false;

    public void producer(ReadWriteLock readWriteLock){
        try{
            readWriteLock.readLock().lock();
            System.out.println("Read Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        }catch (Exception e){

        }
        finally {
            readWriteLock.readLock().unlock();
            System.out.println("Read Lock released by : " + Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock readWriteLock){
        try{
            readWriteLock.writeLock().lock();
            System.out.println("Write Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(5000);
        }catch (Exception e){

        }
        finally {
            readWriteLock.writeLock().unlock();
            System.out.println("Write Lock released by : " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        ReadWriteLockExample rw1 = new ReadWriteLockExample();

        Thread thread1 = new Thread(()-> {
            rw1.producer(readWriteLock);
        });

        Thread thread2 = new Thread(()-> {
            rw1.producer(readWriteLock);
        });

        ReadWriteLockExample rw2 = new ReadWriteLockExample();
        Thread thread3 = new Thread(()-> {
            rw2.consumer(readWriteLock);
        });

        thread1.start();
        thread2.start();
        thread3.start();

        /*

            Expected Output
            Read Lock acquired by : Thread-0
            Read Lock acquired by : Thread-1
            Write Lock acquired by : Thread-2
            Read Lock released by : Thread-1
            Read Lock released by : Thread-0
            Write Lock released by : Thread-2

         */
    }
}
