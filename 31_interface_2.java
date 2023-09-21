interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("coding in laptop..");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("coding in desktop..");
    }
}

class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}


class Interface2{
    public static void main(String args[]){

        Computer lap1 = new Laptop();
        Computer desk1 = new Desktop();

        Developer dev1 = new Developer();
        dev1.devApp(lap1);  // res: coding in laptop..
        dev1.devApp(desk1);  // res: coding in desktop..

    }
}
