class Mobile{
    String brand;
    int price;
    static String name;


    // Static Block only executes once when Class is loaded. not every time an Object is loaded
    static{
        name = "default_phone";
        System.out.println("static block executed..");
    }

    // Constructor executes every time an Object is loaded
    Mobile(){
        brand = "";
        price = 200;
        System.out.println("constructor executed..");
    }
}


class StatBlock{
    public static void main(String args[]){

        Mobile mob1 = new Mobile();
        mob1.brand = "Apple";
        
        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
    }
}