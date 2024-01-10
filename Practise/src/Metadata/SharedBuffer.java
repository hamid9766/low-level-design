package Metadata;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private Queue<Integer> q;
    private int capacity;

    SharedBuffer(int capacity){
        this.capacity = capacity;
        q = new LinkedList<>();
    }

    public void produce(int val){
        synchronized (q){
            while(q.size() == capacity){
                try{
                    System.out.println("Queue is full waiting for Consumer thread....");
                    q.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            q.add(val);
            System.out.println("Item Produced " + val);
            q.notifyAll();
        }
    }

    public int consume(){
        synchronized (q){
            while(q.isEmpty()){
                try{
                    System.out.println("Queue is empty waiting for Producer thread....");
                    q.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            int i = q.poll();
            System.out.println("Item Consumed " + i);
            q.notifyAll();
            return i;
        }
    }

    public static void main(String[] args) {
        // Queue Capacity size is 4
        SharedBuffer sharedBuffer = new SharedBuffer(4);

        // Producer thread will fill the queue till the size of queue after that it will wait for consumer thread
        Thread producerThread = new Thread(()->{
            for(int i = 0; i <=6; i++){
                sharedBuffer.produce(i);
            }
        });

        // Consumer thread will remove the element till the queue becomes empty after that it will wait for producer
        // thread
        Thread consumerThread = new Thread(()->{
            for(int i = 0; i <=6; i++){
                sharedBuffer.consume();
            }
        });

        producerThread.start();
        consumerThread.start();


        /*
            Expected Output
            Item Produced 0
            Item Produced 1
            Item Produced 2
            Item Produced 3
            Queue is full waiting for Consumer thread....
            Item Consumed 0
            Item Consumed 1
            Item Consumed 2
            Item Consumed 3
            Queue is empty waiting for Producer thread....
            Item Produced 4
            Item Produced 5
            Item Produced 6
            Item Consumed 4
            Item Consumed 5
            Item Consumed 6
        */


    }
}
