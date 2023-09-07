// ABSTRACTION by using ABSTRACT class

package abstraction;

abstract class Cricket // abstract class
{
	abstract public void test(); // abstract method sign
}

class Icc extends Cricket //  sub class  
{
	public void test() // test method is overriding
	{
		System.out.println("INDIAN CRICKET COUNCIL FOLLOWING SOME RILES IN CRICKET"); // method implementation
	}
}
class Stadium // helper class
{
	public static Cricket  pitch() //helper class method
	{
		Cricket cric=(Cricket) new Icc();
		return cric; // return cric object
	}
}
public class AbstractionBYUsingAbstractClass03 
{
	public static void main(String[] args) 
	{
		//Stadium std= new Stadium();
		Cricket cric1 = Stadium.pitch();
	      cric1.test();
	
	}

}
