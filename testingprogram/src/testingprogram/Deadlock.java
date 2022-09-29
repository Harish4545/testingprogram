package testingprogram;


public class Deadlock {
	/* * This method request two locks, first String and then Integer */ 
	public void method1() {
		synchronized (String.class)
		{ 
			System.out.println("Aquired lock on String.class object"); 
			synchronized (Integer.class) 
			{ 
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}
	public void method2() 
	{
		synchronized (String.class) 
		{
			System.out.println("Aquired lock on String.class object"); 
		}
		synchronized (Integer.class) 
		{
			System.out.println("Aquired lock on Integer.class object");
		}
	}
	
	public static void main(String[] args) {
		Deadlock d=new Deadlock();
		d.method1();
		d.method2();
	}
}


