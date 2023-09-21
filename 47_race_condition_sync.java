
class Counter{
    int count;

    public synchronized void increment(){  // with synchronized, increment() will be called by only one method at a time
        count++;
    }
}

class RaceCond{
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        // converted into anonymous funtional interface with lambda expr
        Runnable obj1 = () -> {
            for(int i=0; i<10000; i++){
                c.increment();
                // System.out.println("obj1:" + c.count);
            }
        };

        Runnable obj2 = () -> {
            for(int i=0; i<10000; i++){
                c.increment();
                // System.out.println("obj2:" + c.count);
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();  // wait for the t1 and t2 to complete the process and join back
        t2.join();  // once joined, only then print the res with following code

        System.out.println(c.count);  // without 'synchronized' res: 11338, 12866, etc. After, res always correct: 20000

    }
}