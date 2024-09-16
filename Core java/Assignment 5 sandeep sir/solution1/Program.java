package in.solution1;

class InstanceCounter {
	private static int count;

	public InstanceCounter() {
		InstanceCounter.count = count + 1;
	}

	public static int getvalue() {

		return count;
	}
}

public class Program {
	public static void main(String[] args) {
		System.out.println("you have total instance " + InstanceCounter.getvalue());

		InstanceCounter obj1 = new InstanceCounter();
		InstanceCounter obj2 = new InstanceCounter();
		InstanceCounter obj3 = new InstanceCounter();
		InstanceCounter obj4 = new InstanceCounter();
		System.out.println("you have total instance " + InstanceCounter.getvalue());

	}
}