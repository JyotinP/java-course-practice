// Functional Interface is an interface that contains ONLY one abstract method.
// We can use Functional Interface in Anonymous Inner class.

@FunctionalInterface
interface A{
    void show();
    // void show1();  // due to annotation, Error: Invalid '@FunctionalInterface' annotation; A is not a functional interface
}


class FunctInterface{
    public static void main(String args[]){

        A obj1 = new A() {

            public void show(){
                System.out.println("in anon inner class show");
            }

        };

        obj1.show();
    }
}