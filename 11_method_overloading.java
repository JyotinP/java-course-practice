// Method Overloading: Same method name but with different no. of required input params

class Calculator {
    public int add(int n1, int n2, int n3){
        return n1+ n2+ n3;
    }

    public int add(int n1, int n2){
        return n1 + n2;
    }

}

class MethodOver {
    public static void main(String args[]){
        Calculator calc = new Calculator();

        int res1 = calc.add(1,2,3);
        System.out.println(res1);

        int res2 = calc.add(1,2);
        System.out.println(res2);
    }
}