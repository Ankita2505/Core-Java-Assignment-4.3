package customer;
/*
 * program to demonstrate the use of final keyword with class, with the method, 
 * with the constructor, and with a variable.
 */
class Bank //Base Class
{
	int bank_id;
	void insert(int a)
	{
		bank_id=a;
	}
	final void display()//If we make any method as final, we cannot override it.
	{
		System.out.println("Bank id= "+bank_id);
	}
}
final class Customer extends Bank //If we make any class as final, we cannot extend it.
{
	final int acc_no=1; //If a variable declared as final, we cannot change the value of final variable(It will be constant
	final float balance;// blank or uninitialized final variable.
	Customer()
	{
	    balance=2000; // we can initialize blank or uninitialized final variable only in constructor
	    System.out.println("Acc no.= "+acc_no+" Balance= "+balance);
	}
	public static void main(String args[])// Start of Main Class
	{
		Customer c=new Customer();// Creating Object of Child Class customer
		c.insert(3201); //Calling Base Class method through Child Class Object
		c.display();//Calling Base Class method through Child Class Object
	}//Close of Main Class
}