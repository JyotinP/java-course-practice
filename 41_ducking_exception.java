// Checked Exceptions: These are exceptions in methods that are checked at compile time.
// .. and they either have to be handled in the method itself or it can be ducked (with 'throws' keyword) to the other methods or objects where it gets called. 
// .. But it must be handled at the main as thats the last point before JRE.


// 1. It can be handled in the method itself like below: 

// class A{
//     public void show(){
//         try{
//             Class.forName("Demo");
//         }
//         catch(ClassNotFoundException e){
//             System.out.println("Not able to find class " + e);
//         }
//     }
// }

// 2. Or, it can be ducked to whoever calls the method

class A{
    public void show() throws ClassNotFoundException {
        Class.forName("Demo");  // if not handled or ducked with 'throws', Error: Unhandled exception type ClassNotFoundException
    }
}

class DuckingException{
    public static void main(String[] args) {
        A obj1 = new A();

        try {
            obj1.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // shows full hierarchy of methods which gets called
        }
    }
}