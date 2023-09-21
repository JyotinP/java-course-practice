class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends B{
    public void show(){
        System.out.println("in C show");
    }
}

class DynaMethodDispatch{
    
    public static void main(String args[]){

        A obj = new A();
        obj.show();

        // Runtime Polymorphism.. same object (here 'obj') behaves in different way (executes diff class's methods) 
        // Method Overriding is an e.g of Dynamic Method Dispatch..
        //.. it is resolved at Run Time, rather than Compile Time

        obj = new B();  // object B could be created of it's parent's type i.e. A ..But the methods called should be available in it's parent as well
        obj.show();

        obj = new C();  
        obj.show();

    }
}