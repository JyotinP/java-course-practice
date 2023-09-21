class Calc {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int sub(int num1, int num2){
        return num1 - num2;
    }

}

class AdvCalc extends Calc{

    public int multi(int num1, int num2){
        return num1 * num2;
    }

    public int div(int num1, int num2){
        return num1/num2;
    }

}

class VeryAdvCalc extends AdvCalc{
    public double power(int num1, int num2){
        return Math.pow(num1, num2);
    }
}



class Inheritance{
    public static void main(String args[]){

        Calc calc1 = new Calc();
        int res1 = calc1.add(2, 4);
        int res2 = calc1.sub(4, 2);
        System.out.println(res1 + " | " + res2);

        AdvCalc advcalc1 = new AdvCalc();
        int res3 = advcalc1.multi(6, 3);
        int res4 = advcalc1.div(15, 3);
        System.out.println(res3 + " | " + res4);
        // After Inheritance 
        int res5 = advcalc1.add(3, 6);
        System.out.println(res5);

        VeryAdvCalc vacalc1 = new VeryAdvCalc();
        int res6 = vacalc1.add(2, 4);
        int res7 = vacalc1.sub(4, 2);
        int res8 = vacalc1.multi(6, 3);
        int res9 = vacalc1.div(15, 3);
        double res10 = vacalc1.power(4, 2);
        System.out.println(res6 + " | " + res7 + " | " +  res8 + " | " +  res9 + " | " +  res10);
    }
}