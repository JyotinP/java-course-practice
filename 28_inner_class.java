class A{
    public void show(){
        System.out.println("in A show");
    }

    class B{
        public void config(){
            System.out.println("in B config");
        }
    }

    static class C{
        public void config(){
            System.out.println("in C config");
        }
    }
}


class InnerClass{
    public static void main(String args[]){
        A obj1 = new A();
        obj1.show();

        A.B obj2 = obj1.new B();  // Object of inner class B is created from Object of A (for non static class)

        A.C obj3 = new A.C();  // Object of Static inner class C can be directly created

    }
}