package DAY4;

public class marks {
	public static void main(String[] args) {
		int[] b= {78,65,89,92,71};
		int highest=b[0];
		for(int i=1;i<b.length;i++) {
		   if(b[i]>highest) {
			   highest=b[i];
			   System.out.println("highest:"+highest);
		   }
		}
		  
	}}


