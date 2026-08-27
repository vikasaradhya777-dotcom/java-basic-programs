package DAY7;


	

	public class EXAMPLE1 {
		static void count(int n) {
			if(n==0) {
				return;
			}
			System.out.println("calling count(" + n+")");
			count(n-1);
			System.out.println("returninh from count (" + n +")");
		}
		public static void main(String[] args) {
			
		{
			count(5);
		}

	}

}
