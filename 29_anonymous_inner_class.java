class A{
    public void show(){
        System.out.println("in A show");
    }
}

abstract class B{
    abstract public void show();
}


class AnonInnerClass{
    public static void main(String args[]){

        // This is an inner class inside class 'AnonInnerClass'. Its without a name so its called Anonymous Inner Class. 
        // Useful in overriding methods without creating a separate extending subclass
        A obj1 = new A(){

            public void show(){
                System.out.println("in new show");
            }

        };

        obj1.show();  // this is an object of not A, but rather Anonymous Inner Class(kind of a Subclass), whose Superclass(parent class) is (probably) A.


        // Abstract and Anonymous Inner Class
        // Useful in implementing methods for an Abstract methods without separate subclass
        B obj2 = new B(){
            public void show(){
                System.out.println("in Anon Inner Class extending from Abstract Superclass B");
            }
        };

        obj2.show();
    }
}