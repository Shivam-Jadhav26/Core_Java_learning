package B_Method;

class Calculator_M3 {

	int a = 10;
	int b = 20;
	int res;

	int add() {

		res = a + b;

		return res;

	}
}

class use {

	public static void main(String[] args) {

		Calculator_M3 calc = new Calculator_M3();

		int sum = calc.add();
		System.out.println("The sum of " + calc.a + " and " + calc.b + " is: " + sum);

	}
}
