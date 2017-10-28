package d3.euler;

public class PrimeFactors3 {

	static StringBuffer ans = new StringBuffer();
	static boolean flag=true;
	public static void main(String[] args) {
		
		long n = 600851475143L;
		//int n = 13195;
	/*for(long i=2;i<n;i++){
			if(n%i==0){
				for(long j=2;j<i;j++){
					if(i%j==0){
						flag=false;
						break;
					}
				}
			if(flag)
			ans = ans.append(i + ",");
			}	
		}
		System.out.println(ans);
*/
		for(long i=2;i<n;i++){
			if(n%i==0){
				while(n%i==0){
					n=n/i;
				}
				ans = ans.append(i + ",");
			}
		}
		
		System.out.println(ans);
	}

}
