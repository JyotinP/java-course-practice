// Multitasking: Multiple tasks or softwares can be run on OS at the same time
// Task: A single task/software can have multiple process to run at the same time. This done using threads.
// Threads: Threads are the smallest unit that can be executed, and can be executed parallely.
//.. A single CPU core can execute upto 2 threads per core. if a CPU is dual core (i.e., 2 cores) it can execute 4 threads at the same time. 
// Scheduler schedules the the sequence in which for e.g. 200 threads can be executed in the OS one after other (4 at a time if dual core CPU)



class A extends Thread{  // needs to be extended to the class Thread
    public void run(){   // the methods inside needs to be named 'run()'
        for(int i=0; i<210; i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<210; i++){
            System.out.println("Hello");
        }
    }
}


class Threads{
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();  // execution is initiated using '.start()'
        obj2.start();
    }
}