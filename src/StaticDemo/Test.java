package StaticDemo;

public class Test {

	public int add(int a, int b) { // this add method call in class A
		a = 40;
		b = 80;
		return a + b;
	}

	// ----Static method---//
	static int add1(int x, int y) { //this method call in class A
		x = x + 2;
		y = y + 4;
		return x + y;

	}
}
