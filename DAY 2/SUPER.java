package day2;
class par
{
   int a =10;
		   int b =20;
}
public class SUPER extends par {
	
	int a=20;
	int b =30;
	
	void add(int a , int b)
	{
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUPER jj = new SUPER();
		jj.add(2, 3);
	}

}
