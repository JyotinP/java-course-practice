// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A{
    
    void show(); // no need to mention 'abstract public'
    void config(); // By default, the method will be of 'abstract public'

}

interface X{
    void run();
}

interface Y extends X{  //interface can be extended on another interface

}


class B implements A, Y {  // can implement multiple interfaces in a class
    public void show(){
        System.out.println("in B show");
    }

    public void config(){
        System.out.println("in B config");
    }

    public void run(){
        System.out.println("in B run");
    }
}



class Interface3{
    public static void main(String args[]){

        // A obj1 = new A();  // error: Cannot instantiate the type A

        A obj1 = new B();
        obj1.show();
        obj1.config();
    //  obj1.run();  // object is of type A which dnt have run() method. Error: The method run() is undefined for the type A

        X obj2 = new B(); // to get the run() method, need to create object of class B but of type X (or Y)
        obj2.run();
    }
}
