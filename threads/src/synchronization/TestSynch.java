package synchronization;

public class TestSynch{
    public static void main(String...args) throws Exception{
        StringBuffer strBuf = new StringBuffer("A");
        Thread t1 = new Thread(new PutOutLetters(strBuf));
        Thread t2 = new Thread(new PutOutLetters(strBuf));
        Thread t3 = new Thread(new PutOutLetters(strBuf));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        
        System.out.println();
    }
}

class PutOutLetters implements Runnable{
    private final StringBuffer strBuffer;
    public PutOutLetters(StringBuffer strBuffer){
        this.strBuffer = strBuffer;
    }
    public void run(){        
        for(int i=0;i<100;i++){
            synchronized(this.strBuffer){
                System.out.print(strBuffer);
                char toIncr = this.strBuffer.charAt(0);                
                this.strBuffer.setCharAt(0,++toIncr);
            }
        }        
    }
}
