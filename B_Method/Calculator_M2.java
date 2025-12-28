package B_Method;

class Calculator_M2 {
	int res;

	void add(int x, int y) {

		res = x + y;
		System.out.println(res);

	}
}

class use {

	public static void main(String[] args) {
		Calculator_M2 calc = new Calculator_M2();
		int a = 10;
		int b = 20;

		calc.add(a, b);

	}
}
