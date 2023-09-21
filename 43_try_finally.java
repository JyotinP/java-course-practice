// Finnally: the finally block executes whether exception rise or not and whether exception handled or not.
//.. is generally used to put important codes such as clean up code e.g. closing the file or closing the connection.


import java.util.Scanner;

class TryFinally{
    public static void main(String[] args) {
        
        int i = 0;
        int res = 0;
        int num;

        try{
            res = 18/i;
        }
        catch(Exception e){
            System.out.println("can't do that..giving default value");
            System.out.println("Error details: " + e);
            res = 18/1;
        }
        finally{
            System.out.println("Calculation was either successful or at least an attempt was made");
        }

        System.out.println("result: " + res);

        // Finally doesnt need a catch block

        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);

        try{
        num = sc.nextInt();
        }
        finally{
        sc.close();
        System.out.println("Resources closed");
        }

        System.out.println("entered number was: "+ num);


    }
}