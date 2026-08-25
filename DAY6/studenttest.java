package DAY6;

public class studenttest {
	public static void main(String[] args) {
		int[] e= {100,69,96,78,75,98};
		int[]p = new int[e.length] ;
		p[0]=e[0];
		for(int i =1;i<e.length-1;i++) {
			p[i]=p[i-1]+e[i];
		}
		int sum=p[4]+p[0];
		System.out.println("marks of studen:"+sum);
	}

}


