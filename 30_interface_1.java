interface A{

    int age = 21;  // Fyi. variables in Interface are Final & Static
    String area = "final_area";  // Final & Static
    
    abstract public void show(); // no need to mention 'abstract public'
    void config(); // By default, the method will be of 'abstract public'

}

// In implements class, need to define/implement ALL methods of the interface class
class B implements A{
    public void show(){
        System.out.println("in B show");
    }

    public void config(){
        System.out.println("in B config");
    }
}


class Interface1{
    public static void main(String args[]){

        // A obj1 = new A();  // error: Cannot instantiate the type A

        A obj1 = new B();
        obj1.show();
        obj1.config();
        
    }
}