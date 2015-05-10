package locks;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.TimeUnit;

public class TestConditions{
    public static void main(String...args){
        Customer customer = new Customer();
        Waiter waiter1 = new Waiter(customer);
        Waiter waiter2 = new Waiter(customer);
        Waiter waiter3 = new Waiter(customer);
        Thread t1 = new Thread(waiter1,"waiter1");
        Thread t2 = new Thread(waiter2,"waiter2");
        Thread t3 = new Thread(waiter3,"waiter3");
        Thread t4 = new Thread(customer,"John");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch(InterruptedException e){
            
        }
        
        System.out.println("main ends");
        
    }
}

class Waiter implements Runnable{
    private final Customer customer;
    public Waiter(Customer customer){
        this.customer = customer;
    }
    static Lock waiterLock = new ReentrantLock();
    static Condition watchOutCustomer = waiterLock.newCondition();
    public void run(){
        waiterLock.lock();
        System.out.printf("%s: Lets see if any customer calls me!\n",Thread.currentThread().getName());
        try{
            watchOutCustomer.await(3,TimeUnit.SECONDS);
            if(this.customer.iAmServed){
                System.out.printf("%s: Ov nobody oke Ill go back to kitchen?\n",Thread.currentThread().getName());
            }else{                
                System.out.printf("%s: How can I help you?\n",Thread.currentThread().getName());
                this.customer.orderLock.lock();
                try{
                    this.customer.waitForOrder.await();                    
                    System.out.printf("%s: Got it sir in a minute\n",Thread.currentThread().getName());
                }
                catch(InterruptedException e){
                    System.out.printf("Interrupted during order call wait %s\n",Thread.currentThread().getName());
                }
                finally{
                    this.customer.orderLock.unlock();
                }
            }
        }
        catch(InterruptedException e){
            System.out.printf("Interrupted during customer call wait %s\n",Thread.currentThread().getName());
        }
        finally{
            waiterLock.unlock();
        }
        
    }    
}

class Customer implements Runnable{
    boolean iAmServed = false;
    Lock orderLock = new ReentrantLock();
    Condition waitForOrder = orderLock.newCondition();
    public void run(){
        Waiter.waiterLock.lock();
        try{
            System.out.printf("%s:Hey waiter!\n",Thread.currentThread().getName());
            Waiter.watchOutCustomer.signal();
        }
        finally{
            Waiter.waiterLock.unlock();
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
        }
        iAmServed = true;
        System.out.printf("%s: Bring me a cofee please! Thanks.\n",Thread.currentThread().getName());
        orderLock.lock();
        try{
            waitForOrder.signal();
        }
        finally{
            orderLock.unlock();
        }
    }
    
}
