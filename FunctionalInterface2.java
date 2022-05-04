package Java8Features;
interface Drawable1
{
	public void square();
}
public class FunctionalInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable1 d = new Drawable1() {
			
			@Override
			public void square() {
				System.out.println("Square is drawing");
				
			}
		};
		d.square();
	}

}
