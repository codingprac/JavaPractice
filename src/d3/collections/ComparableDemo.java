package d3.collections;

public class ComparableDemo implements Comparable<ComparableDemo>{
	
	int id;
	String name;
	long salary;
	
	public ComparableDemo() {
		super();
	}

	public ComparableDemo(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	//main
	public static void main(String[] args) {
		int[] a = {1};
		new ComparableDemo().increment(a);
		System.out.println(a[a.length-1]);
	}
	
	void increment(int[] a){
		a[a.length - 1]++;
	}

	@Override
	public String toString() {
		return "ComparableDemo [id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}

	@Override
	public int compareTo(ComparableDemo o) {
		
		if(o instanceof ComparableDemo){
			//return this.name.compareTo(o.name);
			return this.id - o.id;
		}
		
		return 0;
	}

}
