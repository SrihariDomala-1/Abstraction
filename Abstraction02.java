// ABSTRACT BY USING =>interface<=
package abstraction;

interface Animal
{
	void forest();// method implementation is hidden


}
class Lion implements Animal
{
	public void forest()
	{
		// we can write n no.of implements here
		System.out.println(" implementation is  out put");
	}
}

class Tiger  // helper class
{
	public static  Animal roar()
	{
		Animal animal=(Animal) new Lion(); // during upcasting
		return animal; // returning animal object
	}
}
public class Abstraction02 
{
	public static void main(String[] args) 
	{
		Animal animal= Tiger.roar();
		animal.forest();
		
	}

}
