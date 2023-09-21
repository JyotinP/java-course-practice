import java.util.Scanner;


class InputScanner{
    public static void main(String[] args) {
        System.out.println("enter a number");

        // read the input from the user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);

        sc.close();
    }   

}