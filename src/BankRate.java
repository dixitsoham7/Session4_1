
/*this is program used to demonstrate method overriding and method overloading concept of OOPS.
 *both method overriding and method overloading show polymorphism
 *If subclass has same method as declared in parent class it is call as method overriding
 *When class has more than one method with same name but different arguments it is method overloading
 *Example of both is shown below in simpler way
 *@author-Soham Dixit */


public class BankRate {

	public static void main(String args[]) {
		
		System.out.println("This is an example of METHOD OVERRIDING :\n");
		Sbi s = new Sbi();     //making object of 1st subclass
		Axis a = new Axis();  //making object of 2nd subclass
		Hdfc h = new Hdfc();  //making object of 3rd subclass
		
		System.out.println("SBI Rate of Interest : "+s.getRate());  //printing roi by calling method of subclass using its object s.getRate()  roi=rate of interest
		System.out.println("Axis Rate of Interest : "+a.getRate()); //printing roi by calling method of subclass using its object a.getRate()
		System.out.println("Hdfc Rate of Interest : "+h.getRate()); //printing roi by calling method of subclass using its object h.getRate()
		System.out.println("--------------------------------------------------\n");
		System.out.println("This is an example of METHOD OVERLOADING :\n");
		
		
		System.out.println("Addition 1 : "+Add.add(3,4));   //calling add method of Add class which has two arguments
		System.out.println("Addition 2 : "+Add.add(3,4,8));  //calling add method of Add class which has three arguments of type int
		System.out.println("Addition 3 : "+Add.add(32.9,43.5,11.3));    //calling add method of Add class which has three arguments of type double
		System.out.println("--------------------------------------------------\n");
		
	}
	
}

class Add{           //class for Adding numbers which has method add
	static int add (int a, int b)    //method add has two arguments (int,int)
	{
		return a+b;					//returning int value
	}
	
	static int add (int a, int b, int c)    //method add has three arguments (int,int,int)
	{
		return a+b+c;        //returning int value
	}
	static double add (double a, double b, double c)  ////method add has three arguments (double,double,double)
	{
		return a+b+c;     //returning double value
	}
	
	//therefore class has a single method named add which has different arguments. this method is called in main function where values are passed according to argumkents
	
}
class Banks{                 //parent class
	
	int getRate() {       //method to get rate of interest
		return 0;			//returning int value
	}
}

class Sbi extends Banks{   //subclass 1
	int getRate() {		//subclass 1 has same method as that declared in parent class
		return 8;		// returning rate of interest
	}
}

class Axis extends Banks{  //subclass 2
	int getRate() {			//subclass 2 has same method as that declared in parent class
		return 9;			// returning rate of interest
	}
}

class Hdfc extends Banks{  //subclass 3
	int getRate() {			//subclass 3 has same method as that declared in parent class
		return 10;			// returning rate of interest
	}
}