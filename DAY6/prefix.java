package DAY6;

public class prefix {
	public static void main(String[] args) {
		int[] e= {100,200,150,300,250};
		
		int[] prefixSum = new int[e.length] ;
		prefixSum[0]=e[0];
		for(int i =1;i<e.length;i++) {
			prefixSum[i]=prefixSum[i-1]+e[i];
			
			
		}
		int sum=prefixSum[3]-prefixSum[0];
		System.out.println(sum);
	}

}
