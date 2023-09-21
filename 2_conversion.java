class Conversion {

    public static void main(String args[]){
        byte b = 125;
        int a = b; // CONVERSION(IMPLICIT)..assigning byte type val to int type will transform automatically(implicitly)
    //  byte k = a; // assigning int type val to byte val will NOT work.."error: incompatible types: possible lossy conversion from int to byte"
        int a1 = 257;
        byte k1 = (byte) a1; // CASTING(EXPLICIT).. need to specify explicitly to transform the data type
        int a2 = 2000;
        byte k2 = (byte) a2;
        float f = 5.6f;
        int i = (int) f;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(k1); // res: 1 ..remainder of 257/256 -> 1
        System.out.println(a2);
        System.out.println(k2); // res: -48 ..remainder of 2000/256 -> 208 .. (208 - 256) -> -48
        System.out.println(f);
        System.out.println(i); // res: 5
    }

}