
public class testGetDeclaredMethods extends testA {
	public static void main(String[] args) {
		System.out.println(testA.class.getDeclaredMethods().length);
		System.out.println(testB.class.getDeclaredMethods().length);
		System.out.println(testGetDeclaredMethods.class.getDeclaredMethods().length);
	}
}

