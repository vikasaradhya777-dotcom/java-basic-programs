package DAY6;

public class array {
	public static void main(String[] args) {
		int[] a1= {10,20,30};
		int[] a2 = {40,50,60};
		int[] merged =new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++) {
			merged[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			merged[a1.length+i]=a2[i];
	}
		System.out.println("merged");
		for(int i=0;i<merged.length;i++) {
			System.out.print(" "+merged[i]);
		}

}
}