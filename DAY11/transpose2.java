package DAY11;

public class transpose2 {
public static void main(String[] args) {
	int[][]matrix= {{1,2,3},{4,5,6},{7,8,9}};
	for(int j=0;j<3;j++) {
		for(int i=0;i<3;i++) {
			System.out.print(matrix[i][j]+"");
		}
		System.out.println();
	}
	
}}
