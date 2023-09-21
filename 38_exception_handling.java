class ExceptionHandling{
    public static void main(String[] args) {
        int i = 0;
        int res = 0;
        
        try{
        res = 18/i;
        }
        catch(Exception e){
            System.out.println("Something went wrong..");
            System.out.println("More Details: " + e);
        }
        
        System.out.println(res);

        System.out.println("Hello");

    }
}