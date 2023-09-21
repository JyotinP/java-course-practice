// In Laptop enum Class, there are objects with 'name' like Macbook, XPS, etc. It has instance variable 'price'.

enum Laptop{
    Macbook(2000), XPS(1600), Surface, Thinkpad(1800);

    private int price; // instance variable
    
    // (Private) Default Constructor.. no need to pass value for instance variable
    // .. reason for private is bcos we're creating the Objects in the Class itself
    private Laptop(){
        this.price = 200;
    }

    // (Private) Parameterized Constructor.. can pass value for the instance variable
    private Laptop(int price){
        this.price = price;
        System.out.println("in Laptop" + " : " + this.name());  // Constructor gets executed for each of the objects Macbook, XPS, etc.
    }

    public int getPrice(){
        return this.price;
    }
}


class EnumClass{
    public static void main(String args[]){

        for(Laptop v: Laptop.values()){
            System.out.println(v + " : " + v.getPrice()); 
        }
    }
}