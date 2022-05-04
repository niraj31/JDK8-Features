package Java8Features;
interface Draw
{
	public void draw();
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw d=()->{System.out.println("Using Lambda Expression");};
		d.draw();
	}

}
