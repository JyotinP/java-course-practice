import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ArrayL{
    public static void main(String[] args) {
        
        Collection<Integer> num = new ArrayList<Integer>();  // ArrayList extends on Collection
                                                            // <Integer> is not req but recommended, will enforce type & errors will be found in Compile time and not in runtime
        num.add(4);
        num.add(2);
        num.add(8);
        num.add(5);

        System.out.println(num);


        // If index based operations needed, can use List
        List<Integer> num1 = new ArrayList<Integer>();

        num1.add(8);
        num1.add(5);
        num1.add(2);
        num1.add(4);

        System.out.println(num1);
        System.out.println(num1.get(0));
        System.out.println(num1.indexOf(5));

    }
}