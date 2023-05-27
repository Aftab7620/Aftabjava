class Parent
{
	void show()
	{
		System.out.println("Parent's show()");
	}
}
//This program is about Function overloading
// Inherited class
class Child extends Parent
{
	// This method overrides show() of Parent
	void show()
	{
		System.out.println("Child's show()");
	}
}

// Driver class
class FuncOver
{
	public static void main(String args[])
	{
		Parent obj1 = new Parent();
		obj1.show();
		Parent obj2 = new Child();
		obj2.show();
	}
}
