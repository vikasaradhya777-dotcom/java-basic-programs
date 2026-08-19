package DAY3;

public class EXCEPTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");

		try {
			System.out.println(10 / 2);
			int[] a = { 10, 20, 30 };
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);

		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Array handle");

		} catch (ArithmeticException e) {
			System.out.println(" arthi handle");
		} catch (Exception e) {
			System.out.println(" exception handle");
		}
		System.out.println("Hello sir");
	}
	}

