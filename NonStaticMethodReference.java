package Java8Features;
interface Sayable2
{
	void say();
}
public class NonStaticMethodReference {
	
	void sayMonething()
	{
		System.out.println("Hi there...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethodReference s = new NonStaticMethodReference();
		
		Sayable1 s1 = new NonStaticMethodReference()::sayMonething;
		s1.say();

	}

}
