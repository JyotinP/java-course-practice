// Annotations are used to provide supplemental information about a program.
// When it program is not according to the Annotations, it provide compile warning/error. Thus used to catch bugs

class A{
    public void showDataThisClass(){
        System.out.println("in A");
    }
}

// Override is an Annotation, when uncommented, itll help us find why class A method is getting executed instead of B with Method Overriding.
class B extends A{
    // @Override    
    public void showDataThissClass(){
        System.out.println("in B");
    }
}

class Annotations{
    public static void main(String args[]){
        B obj1 = new B();
        obj1.showDataThisClass(); // res: in A  ..we expected B due to Method Overriding
    }
}