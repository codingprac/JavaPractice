package d3.euler;

public class Fibonacci2 {

	static long sum;
	static StringBuffer ans = new StringBuffer();

	public static void main(String[] args) {

		long x=0;
		long y=1;
		long temp=0;
		for(long i=0;temp<=4000000;i++){
			temp = x+y;
			x=y;
			y=temp;
			ans = ans.append(temp + ",");
			if(temp%2==0){
				sum =sum + temp;
			}
		}
		//System.out.println(ans);
		System.out.println(sum);
		
		/*double x=0;
		double y=1;
		double temp;
		
		do{
			temp = x+y;
			x=y;
			y=temp;
			ans = ans.append(temp + ",");
			if(temp%2==0){
				sum =sum + temp;
			}
		}while(temp<=4000000);
		//System.out.println(ans);
		System.out.println(sum);
	}*/
		
		
	}

}
