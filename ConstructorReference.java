package Java8Features;
interface Messagable
{
	Message getMessage(String msg);
}
class Message
{
	Message(String msg)
	{
		System.out.println("Hello "+msg);
	}
}
public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messagable m = Message::new;
		m.getMessage("Welcome");

	}

}
