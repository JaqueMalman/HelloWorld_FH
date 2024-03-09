/**
 * TODO description
 */
public class HelloWorld {
	
	protected void print(String name) {
		System.out.print(name + " hello");
	}
	
	public static void main(String[] args) {
		String name = "Fulano";
		new HelloWorld().print(name);
	}
}