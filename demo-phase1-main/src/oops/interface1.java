package oops;

interface Exam
{
	void percentage();
}

class Sisipho implements Exam
{

	@Override
	public void percentage() {
		System.out.println("98%");
		
	}
	
}

class Papi implements Exam 
{

	@Override
	public void percentage() {
		System.out.println("97%");
		
	}
	
}


public class interface1 {

	public static void main(String[] args) {
		
		Sisipho s = new Sisipho();
		s.percentage();
		
		Papi p = new Papi();
		p.percentage();

	}

}
