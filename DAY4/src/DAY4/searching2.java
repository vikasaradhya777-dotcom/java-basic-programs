package DAY4;
public class searching2 {
public static void main(String[] args) {
	int n=100000;
	int[] students = new int[n];
	int target=10000000;
	for (int i =0;i<n;i++) {
		students[i]=i+1;
	}
	for(int i=0;i<n;i++) {
	
		
		if(students[i]==target) {
			System.out.println("elementfound"+students[i]);
		}
		else {
			System.out.println("element not found");
		}
		
	}}}

	

