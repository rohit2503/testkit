package javareload;

 interface My{
	 void fun();
}

 interface My2 extends My{
}
public class MyInterface implements My, My2 {

	public void fun(){
		
	}
}
