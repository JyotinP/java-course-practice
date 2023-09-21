
class A extends Thread{  // needs to be extended to the class Thread
    public void run(){   // the methods inside needs to be named 'run()'
        for(int i=0; i<110; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<110; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}


class ThreadPriority{
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);  // priority is from 1 to 10, 1 being the lowest

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {e.printStackTrace();}
        obj2.start();
    }
}