class A{
    public void show1(){
        System.out.println("In A show");
    }

    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B show");
    }

    public void show(){
        System.out.println("In B show");
    }
}


class UpDownCasting{
    public static void main(String args[]){

        // Upcasting  : It is the typecasting of a child object to a parent object.
        A obj = (A) new B(); // B object but we're casting it as type of A. So we're upcasting to its parent. explicit mention of '(A)' is not required.
        
        // this is now A obj . But if same methods are avail in both, method from B will be executed
        obj.show(); // res: In B show ... 
        
        obj.show1();  // In A show
    //  obj.show2(); // Error: The method show2() is undefined for the type A. If a method of B is not avail in A class, then it'll not be identified.


        // Downcasting : It is the typecasting of a parent object to a child object.
        B obj1 = (B) obj;  // A object(with B class) but we're casting it as type B. So we're downcasting it to it's child.

        // Back to original/normal object creation. This is now same as below:

    // B obj1 = new B();

        obj1.show();  // res: In B show ... // In Downcasting, explicit mention of (B) is required
        obj1.show1(); 
        obj1.show2();

        // below is not possible, (probably) as its child will have more methods than parent
        // B obj2 = (B) new A(); //Runtime Error: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
        // obj2.show();
    }
}