class Wrapper{

    public static void main(String args[]){

        int num = 7;
        Integer num1 = num; // auto-boxing .. primitive data type(int) to Class Object(Integer)
        System.out.println(num1);
        
        int num2 = num1; // auto-unboxing .. Class Object(Integer) to primitive data type(int)
        System.out.println(num2);
    }

}