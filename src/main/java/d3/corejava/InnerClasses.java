package d3.corejava;

public class InnerClasses {

	int a;
	String name;
	
	InnerClasses(int a, String name){
		this.a = a;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		InnerClasses ics = new InnerClasses(10,"Deep"); 
		ics.new InnerClass().printValues();
	}

	
	class InnerClass{
		
		int c = 15;
		
		public void printValues(){
			System.out.println(a+name);
			
		}
		
	}
}
