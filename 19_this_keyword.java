class Human{
    private String name;  // instance variable 'name'
    private int age;     // instance variable 'age'

    public void setName(String name){  // local variable 'name'
        this.name = name;  // 'this' refers to the current object's instance variable 'name', and not the local method variable 'name'
    }

    public void setAge(int age){  // local variable 'age'
        this.age = age;  // 'this' refers to the current object's instance variable 'age', and not the local method variable 'age'
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class Thiskey{
    public static void main(String args[]){

        Human hum1 = new Human();
        hum1.setName("jake");
        hum1.setAge(23);

        System.out.println(hum1.getName() + "| " + hum1.getAge());
    }
}