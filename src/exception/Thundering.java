package exception;

public class Thundering {
	public static void main(String[] args) {
		String str = "lili";
		System.out.println("The age of " + str + " is: ");
		int age = Integer.parseInt("20L");
		System.out.print(age);
	}
}
