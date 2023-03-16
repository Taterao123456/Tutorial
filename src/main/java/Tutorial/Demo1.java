package Tutorial;

public class Demo1 {
	public void abc() {
		System.out.println("abc method 0 arg");
	}

	public void abc(int a) {
		System.out.println("abc method 1 int arg" + a);
	}

	public void abc(String a) {
		System.out.println("abc method 1 String args+a");
	}

	public void abc(int a, String b) {
		System.out.println("abc method with 1 int arg and 1 String args");
	}

	public void abc(String a, int b) {
		System.out.println("abc method woth 1 int and 1 String args");
	}

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.abc(100);
		obj.abc();
		obj.abc("100");
		obj.abc(100, "Selenium");
		obj.abc("testNG", 10000);

	}

}
