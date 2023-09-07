// ABSTRACTION Says:- hide unnecessary details and provide only necessary details.
// JAVA  TECHNICAL says:-Hide methodIMPLEMENTATION details  and  provide Access only methodSignature

// real time example :- Car is a best example Abstraction . we can start a car by pressing a  button or turning the key 
// but we don't need  to know how it works.
// by using ABSTRACT CLASSES and INTERFACES

package abstraction;

interface Car
{
	void drive(); // hiding method implementation
}


class Start implements Car
{
	public void drive()
	{
		System.out.println(" car is started");
	}
}

 class Race
 {
	 public static Car racingCar() // the method static method
	 {
		 Car car=(Car)new Start();
		 return car;
	 }
 }

public class Abstraction1 
{
	public static void main(String[] args) 
	{
		 Car car=Race.racingCar();
		 car.drive(); // racing car() is static so we are using class name.method name
	}

}
