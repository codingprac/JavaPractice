package d3.corejava;


public class Test123 {
	public static void main(String[] args) {
		Test1 f = new Test1();
		Test1.Bar b = f.new Bar();
		
	}
}

class Test1 {
	class Bar {
		{System.out.println("Hello");}
	}
}
