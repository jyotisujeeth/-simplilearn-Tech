package oops;

class t1
{
	int i;
	
	void seti(int i)
	{
		this.i=i;
	}
	
	void show()
	{
		System.out.println(i);
	}
}


public class this1 {

	public static void main(String[] args) {
		
		t1 obj= new t1();
		obj.seti(10);
		obj.show();

	}

}
