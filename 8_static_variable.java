class Mobile {
    String brand;  // Instance Variable .. basically a class variable without a static modifier
    int price;    //  ... are tied to a particular object instance of the class, can have different vals across diff objects
    static String type;  // Class (Static) Variable .. not tied to any particular object of the class, can have only one value across diff objects

    public void show(){
        System.out.println(brand  + "|" + price + "|" + type);
    }

}

class StaticV {
    public static void main(String args[]){
        Mobile mob_obj1 = new Mobile();

        mob_obj1.brand = "Apple";
        mob_obj1.price = 1000;
        Mobile.type = "SmartPhone"; // static variables should be called by their class name, not object name

        Mobile mob_obj2 = new Mobile();
        mob_obj2.brand = "Samsung";
        mob_obj2.price = 1200;
        Mobile.type = "SmartPhone"; 

        Mobile.type = "Android"; // this'll update the class variable name 'type'. It'll affect all objects of those class

        mob_obj1.show(); // Apple|1000|Android
        mob_obj2.show(); // Samsung|1200|Android

    }

}