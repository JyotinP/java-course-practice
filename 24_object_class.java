
class Laptop{
    String model;
    int price;

    public String toString(){
        return model + " | " + price;
    }
}


class ObjectClass{
    public static void main(String args[]){
        Laptop lap1 = new Laptop();
        lap1.model = "Lenovo";
        lap1.price = 2400;

    // Default toString():
    //   return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
        // System.out.println(lap1.toString()); // res: Laptop@2f92e0f4
        // System.out.println(lap1);  // res: Laptop@2f92e0f4

    // user defined Defined toString():
        System.out.println(lap1.toString()); // res: Lenovo | 2400
        System.out.println(lap1);  // res: Lenovo | 2400

    }

}