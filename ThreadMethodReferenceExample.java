package Java8Features;

public class ThreadMethodReferenceExample {

	static void threadStatus()
	{
		System.out.println("Thread Running ...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(ThreadMethodReferenceExample::threadStatus);
		t.start();

	}

}
