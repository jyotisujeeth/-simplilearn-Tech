package oops;

interface father8
{
	public void m1();
}

interface mother8 
{
	public void m2();
	
}

class son8 implements father8,mother8
{

	@Override
	public void m2() {
		System.out.println("mother class method");
		
	}

	@Override
	public void m1() {
		System.out.println("father class method ");
		
	}
	
}




public class multipleinheritance {

	public static void main(String[] args) {
		son8 obj = new son8();
		obj.m1();
		obj.m2();

	}

}
