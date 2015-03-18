package javareload;

class Base {
	
	
	 void show() {
		
		System.out.println("Hello shoow in Base");
		
	}
	 protected void fun() {
			
		System.out.println("Hello shoow in Base");
		
	}
}

class Child3{
	
	protected void show() {
		
		System.out.println("Hello in Chhhhhhild33333 show");
	}
	
public static void main(String[] args) {
	Base c = new Base();
	c.show();
	
	}
}

class Child1 extends Base{
	
	protected void show() {
		
		System.out.println("Hello in Chhhhhhild111111 show");
	}
	
public static void main(String[] args) {
		
	Base c = new Child1();
	c.show();
	}
}

class Child2 extends Child{
	
	protected void show() {
		
		System.out.println("Hello in Chhhhhhild22222 show");
	}
}