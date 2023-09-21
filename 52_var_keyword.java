// var works from Java 20 onwards. current here is Java 8

class VarK{
    public static void main(String[] args) {
        
        int a = 9;
    //  var b = 8;  //works

        int c;
    //  var d; // doesnt work. need to assign value so that it can infer the data type

        int nums[] = new int[10];
    //  var nums = new int[10];  // works. no need to add [] in the variable


    }
}