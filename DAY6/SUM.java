package DAY6;

public class SUM {
public static void main(String[] args) {
		int[] number= {10,20,30,40,50};
		int target=70;
		int left=0;
		int right=number.length-1;
		while(left<right) {
			int sum=number[left]+number[right];
			if(sum==target) {
				System.out.println("number"+number[left]+"and" + number[right]);
				break;
			}
			else if(sum<target) {
				left++;
				
			}else {
				right--;
			}
		}
		
}
}
