package B_Method;

class calculator_M1 {

    int a = 10;
    int b = 20;
    int res;

    void add() {
        res = a + b;
        System.out.println(res);
    }
}

class use {

    public static void main(String[] args) {

        calculator_M1 calc = new calculator_M1();
        calc.add();

    }
}
