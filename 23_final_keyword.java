// Final Class: will not allow other classes to extend this class
// Final Method: will not allow child classes to override this method
// Final Variable: will not allow reassigning the value of this variable


// Final Class: 
final class CalcPvtLtd{  // this will not allow other classes to extend this class
    public void show(){
    System.out.println("not for reuse");
    }
}

// normal class with a Final Method
class Calc{

    // Final Method: 
    final public void show(){  // this will not allow child classes to override this method
        System.out.println("By JP");
    }

    public void add(int num1, int num2){
        System.out.println(num1 + num2);
    }
}

// Final Class cannot be extended by other class

// class AdvCalc extends CalcPvtLtd{  // error: The type AdvCalc cannot subclass the final class CalcPvtLtd
//     public void show(){
//         System.out.println("By JP");
//     }

//     public void add(int num1, int num2){
//         System.out.println(num1 + num2);
//     }
// }

// Final Method
class AdvCalcc extends Calc{

    // public void show(){  // error: Cannot override the final method from Calc
    //     System.out.println("By John in AdvCalcc");
    // }

}


class Final{
    public static void main(String args[]){

        // Final Variable:

        final double pie = 3.14; // this will not allow reassigning of the value
        System.out.println(pie);
        // pie = 45.55; //error: The final local variable pie cannot be assigned

        AdvCalcc calc1 = new AdvCalcc();
        calc1.show();  // without Final method in Calc-> "By John in AdvCalcc". With Final it'll not allow
        calc1.add(2, 4);


    }
}