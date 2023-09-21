// StringBuffer: is a class in Java that represents a mutable sequence of characters. 
// .. It provides an alternative to the immutable String class, allowing you to modify the contents of a string without creating a new object every time.

class Strings{
    public static void main(String args[]){

        String name = new String("jul"); // String is a Class not a primitive type
        System.out.println(name);

        String name1 = "aug";   // .. but it can be directly called just as a primitive type
        System.out.println(name1);

        // Strings are immutable. Theyre stored in String Constant Pool. All vals are unique in this constant pool.
        
        String s1 = "aur";
        String s2 = "aur";

        System.out.println(s1 == s2);  // res: true
        System.out.println(s1.hashCode());  // res: 96958
        System.out.println(s2.hashCode());  // res: 96958 .. reference of s2 in Stack set to same string variable 'aur' in Heap which was previously created for s1

        s1 = "emp" + s1; 
        System.out.println(s1.hashCode()); // res: -1299325706 .. reference of s1 in Stack changed to a new string var 'emp aur' in Heap. Unused var goes to Garbage Collection


        // String Buffer //
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  // 16
        StringBuffer sb1 = new StringBuffer("halo");
        System.out.println(sb1.capacity());  // 20
        System.out.println(sb1.append("Gutenvrrvevvedvevevefefefefefefefcvedvevevevev")); 
        System.out.println(sb1.capacity());  //50

    }
}