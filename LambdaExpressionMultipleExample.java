package Java8Features;
interface Sayable
{
	String message(String msg);
}
public class LambdaExpressionMultipleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s = (msg)->
		{
			String s1 = "I would like to say";
			String s2 = s1+msg;
			return s2;
		};
		
		System.out.println(s.message(", Time is Precious"));

	}

}
