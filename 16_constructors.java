class Human{
    String name;
    int age;

    //// Right click Source Actions -> Generate Constructors: 

    // public Human(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }


    // Constructor needs to have same name as the Class. it's a default method which initiates at the time of object creation

    public Human(){   // Default Constructor
        name = "Default_Name";
        age = 18;
    }

    // Constructor Overload (Similar to Method Overload)

    public Human(String n, int a){   // Parameterized Constructor
        name = n;
        age = a;
    }

}

class Constructors{
    public static void main(String args[]){

        Human h1 = new Human();  // Default Constructor gets executed
        System.out.println(h1.name + "| " + h1.age);

        h1.name = "James";
        h1.age = 24;
        System.out.println(h1.name + "| " + h1.age);

        Human h2 = new Human("Mark", 67);   // Parameterized Constructor gets executed
        System.out.println(h2.name + "| " + h2.age);

    }

}