package Java8Features;
interface Sayable1
{
	void say();
}
public class MethodReferenceExample {
	
	static void saySomething()
	{
		System.out.println("Hi there? Hope you are doing well...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable1 s = MethodReferenceExample::saySomething;
		s.say();

	}

}
