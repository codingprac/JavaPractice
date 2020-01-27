package d3.euler;

public class Multiples1 {

	static int sum;
	double maxInt = 2147483648L;
	public static void main(String[] args) {
		
		System.out.println("Size of int is : "+Integer.SIZE/8+" bytes - "+Integer.MAX_VALUE);
		System.out.println("Size of char is : "+Character.SIZE/8+" bytes - "+Character.MAX_VALUE);
		System.out.println("Size of long is : "+Long.SIZE/8+" bytes - "+Long.MAX_VALUE);
		System.out.println("Size of double is : "+Double.SIZE/8+" bytes - "+Double.MAX_VALUE);
		
		
		for(int i=0;i<1000;i++){
			if(i%3==0 || i%5==0){
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
