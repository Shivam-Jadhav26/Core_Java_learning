package B_Method;

class Calculator_M4 {

	int res;

	int add(int a, int b) {
		res = a + b;
		return res;
	}
}

class use {

	public static void main(String[] args) {

		Calculator_M4 calc = new Calculator_M4();

		int x = 10, y = 20;

		int sum = calc.add(x, y);

		System.out.println(sum);

	}
}
