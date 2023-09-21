class MyCustomException extends Exception{
    public MyCustomException(String str){
        super(str);
    }
}


class CustomException{
    public static void main(String[] args) {
        
        int i = 0;
        int res = 0;

        try{
            res = 18/i;
        }
        catch(ArithmeticException e){
            System.out.println("can't do that..giving default value");
            System.out.println("Error details: " + e);
            res = 18/1;
        }        
        catch(Exception e){
            System.out.println("Something went wrong: " + e);
        }
        
        System.out.println(res);
        
        // Throw
        int j = 20;
        int res1 = 0;
        
        try{
            res1 = 18/j;
            if (res1 == 0){  // no java defined exception will occur for 18/20 = 0 calculation
                throw new MyCustomException("this is my custom exception, output can't be zero");  // 'throw' will forcefully throw an error if above condition is fulfilled
            }
        }
        catch(MyCustomException e){
            System.out.println("sry can't do that..giving default value");
            System.out.println("Error details: " + e);
            e.printStackTrace(); // will show full hierarchy
            res1 = 18/1;
        }
        
        System.out.println(res1);

    }
}