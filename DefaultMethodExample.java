package Java8Features;
interface ex1
{
	void display();
	default void show()
	{
		System.out.println("Default Method in Interface");
	}
	static void showDemo()
	{
		System.out.println("Static Method in Interface");
	}
}
public class DefaultMethodExample implements ex1{
	public void display()
	{
		System.out.println("Method from interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodExample d = new DefaultMethodExample();
		d.display();
		
		d.show();
		ex1.showDemo();
	}

}
