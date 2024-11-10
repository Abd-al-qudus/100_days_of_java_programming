/**
 * multithreading - running multiple threads at the same
 * time. threads implement Runnable and the thread class
 * has a constructor which takes runnable objects. It
 * simplifies the problem of a child class inheriting
 * from thread and another super class which is not
 * supported. multithreading can be achieved by extending
 * thread or implementing runnable. thread states can be
 * new, runnable, running, waiting and dead states 
 * @author: engineerphoenix
 */



// using thread extension
class A extends Thread {
    public void run(){
        for(int i = 0; i < 50; i++) System.out.println("Thread 1");
    }
}


class B extends Thread {
    public void run(){
        for(int i = 0; i < 50; i++) System.out.println("Thread 2");
    }
}

//using runnable
class C implements Runnable {
    public void run(){
        for(int i = 0; i < 50; i++) System.out.println("Thread 3");
    }
}


class D implements Runnable {
    public void run(){
        for(int i = 0; i < 50; i++) System.out.println("Thread 4");
    }
}


//implementing thread safety for memory sharing
class Counter {
    private static final Object LOCK = new Object();
    public int count;

    //thread safety and mutation
    // public synchronized void increment(){
    //     count++;
    // }

    //method synchronizing creates a java lock
    //on the whole object, so, method based
    //synchronization is bad, it is better to
    //lock a new object or just the object
    //calling  single lock object in multiple
    //threads leads to deadlock: calling a thread
    // lock in another thread: eg; calling lock 1
    // in thread 2 and lock 2 in thread 1 simultaneously
    // same lock can be used for simultaneous locking
    // not an already acquired lock on a thread
    public void increment(){
        synchronized(LOCK){
            count++;
        }
    }
}



public class MultiThreading {
    public static void main(String... args) throws InterruptedException{
        A a = new A();
        B b = new B();        
        C c = new C();
        D d = new D();

        //using interface of runnable
        Runnable r1 = () -> {
            for(int i = 0; i < 100; i++) System.out.println("Thread Lambda 1");
        };
        
        Runnable r2 = () -> {
            for(int i = 0; i < 100; i++) System.out.println("Thread Lambda 2");
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread tc = new Thread(c);
        Thread td = new Thread(d);

        a.start();
        b.start();
        tc.start();
        td.start();
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        Counter counter = new Counter();
        Runnable r3 = () -> {
            // try {
            //     counter.wait(); 
            // } catch(InterruptedException e) {
            //     e.printStackTrace(); //calling object wait for threads
            // }
            for(int i = 0; i < 100000; i++) counter.increment();
        };
        Runnable r4 = () -> {
            // counter.notifyAll();//tell other threads to start
            for(int i = 0; i < 100000; i++) counter.increment();
        };

        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);

        //this is like setting python GIL, though mutation is the basis
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        System.out.println(counter.count);
    }
}
