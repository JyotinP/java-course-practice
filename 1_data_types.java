class Data_types {

    public static void main(String a[]){
        byte nbyte = 127; // 1 byte..-128 to 127
        short nshort = 32767; // 2 bytes .. -32,768 to 32,767
        int nint = 2147483647; // 4 bytes.. -2,147,483,648 to 2,147,483,647
        long nlong = 9223372036854775807L; // 8 bytes.. -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float nfloat = 1.233f; // 4 bytes .. need to add suffix
        double ndouble = 1.233; // 8 bytes .. is the default in java, no suffix needed
        char nchar = 'k'; // 2 bytes.. single quotes..only accepts single charac(including numeric) UNICODE, which is more than ASCII
        boolean nbool = true; // 1 bit
        // literals
        int num1 = 0b1010; // 1010 binary to decimal -> 10
        int num2 = 0xA; //  0xA hexadecimal to decimal -> 10 ..to represent large no. with fewer digits
        double num3 = 56; // auto convert to 56.0 double
        double num4 = 12e10; // epsilon
        char char1 = 'a';
        char1++; // this increments the ASCII val of 'a' i.e. 65 to 66 which is 'b'
        System.out.println(nbyte);
        System.out.println(nshort);
        System.out.println(nint);
        System.out.println(nlong);
        System.out.println(nfloat);
        System.out.println(ndouble);
        System.out.println(nchar);
        System.out.println(nbool);
        // literals
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(char1);
    }

}