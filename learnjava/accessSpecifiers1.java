package learnjava;

public class accessSpecifiers1 {

	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier();
		obj.display();
	}
}

class priaccessspecifier
{
	private void display() {
		System.out.println("You are using private access specifier");
	}
}
