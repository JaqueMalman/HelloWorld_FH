/**
 * TODO description
 */
public   class  HelloWorld {
	
	
	 private void  print__wrappee__Hello  (String name) {
		System.out.print(name + " hello");
	}

	
	
	 private void  print__wrappee__Beautiful  (String name) {
		print__wrappee__Hello(name);
		System.out.print(" beautifil");
	}

	
	
	protected void print(String name) {
		print__wrappee__Beautiful(name);
		System.out.print(" world");
	}

	
	
	public static void main(String[] args) {
		String name = "Fulano";
		new HelloWorld().print(name);
	}


}
