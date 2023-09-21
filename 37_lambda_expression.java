// From Java 8, we can use lambda expression for Functional Interface

@FunctionalInterface
interface A{
    void show(int i);
}

interface B{
    int add(int i, int j);
}



class LambdaFunctInterface{
    public static void main(String args[]){

        A obj1 = (int i) -> {
                System.out.println("in anon inner class show: " + i);
        };

        obj1.show(4);

        // shorter
        A obj2 = (int i) -> System.out.println("in anon inner class show: " + i);
        obj2.show(6);

        // Even shorter
        A obj3 = i -> System.out.println("in anon inner class show: " + i);
        obj3.show(8);

        // B
        B obj4 = (i, j) -> i + j;
        int res = obj4.add(8, 2);
        System.out.println(res);

    }
}