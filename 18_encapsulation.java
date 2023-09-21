class Human{
    private String name;
    private int age;

    public void setName(String n){  // n is local variable
        name = n;                   // name is instance variable
    }

    public void setAge(int a){  // a is local variable
        age = a;                // age is instance variable
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class Encapsulation{
    public static void main(String args[]){

        Human hum1 = new Human();
        // hum1.name = "Jake" // Private vars cant be accessed directly. res: "The field Human.name is not visible"

        hum1.setName("Jake");
        hum1.setAge(20);
        System.out.println(hum1.getName());
        System.out.println(hum1.getAge());
    }
}