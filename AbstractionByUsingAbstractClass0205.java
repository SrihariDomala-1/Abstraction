//  to acheive Abstraction  by using  abstract class

package abstraction;

abstract class Mobile
{
	abstract public void call();
	{
		System.out.println("  now a days mobile is important ");
	}
	
}
class OnePlus extends Mobile
{
	public void call()
	{
		System.out.println(" oneplus is my  mobile name");
	}
}

class Apple
{
	public    static Mobile  costly()
	{
		Mobile mbl1=(Mobile) new OnePlus();
	    return mbl1; // orv returned
	}

	
}
public class AbstractionByUsingAbstractClass0205
{
	public static void main(String[] args) 
	{
	    Apple apl=new Apple(); // non static helper class so 
		Mobile mbl=apl.costly();
		mbl.call();
		
	} 
	

}
