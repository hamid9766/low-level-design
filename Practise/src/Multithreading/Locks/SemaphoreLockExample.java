package Multithreading.Locks;

import java.util.concurrent.Semaphore;

/* Enhances synchronized blocks/methods in Java */

public class SemaphoreLockExample {
    boolean isAvailable = false;
    // set the limit how many thread u want to allow to go inside the critical section at a time
    Semaphore lock = new Semaphore(2);

    public void producer(){
        try{
            lock.acquire();
            System.out.println("Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);

        }catch (Exception e){

        }
        finally {
            lock.release();
            System.out.println("Lock released by : " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        SemaphoreLockExample s = new SemaphoreLockExample();

        Thread t1 = new Thread(()->{
            s.producer();
        });

        Thread t2 = new Thread(()->{
            s.producer();
        });

        Thread t3 = new Thread(()->{
            s.producer();
        });

        Thread t4 = new Thread(()->{
            s.producer();
        });

        Thread t5 = new Thread(()->{
            s.producer();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
