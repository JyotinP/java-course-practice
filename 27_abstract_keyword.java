// Abstract Class
abstract class Car{

    abstract public void drive();  // Abstract method must be of Abstract Class. 
                                  // Abstract methods must defined in the downstream extended Class in order to have an Object created of it.
    public void playMusic(){
        System.out.println("playing music...");
    }
}


// Concrete (Normal) Class
class WagonR extends Car{  // without drive method- Error: The type WagonR must implement the inherited abstract method Car.drive()

    public void drive(){
        System.out.println("driving car...");
    }
}


class Abstract{
    public static void main(String args[]){
    // Car car1 = new Car();  //Cannot create object of an Abstract class. error: instantiate the type Car

        WagonR wag1 = new WagonR();
        wag1.drive();
        wag1.playMusic();
    }
}