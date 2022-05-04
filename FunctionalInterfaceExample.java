package Java8Features;

interface Drawable
{
	public void draw();
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Drawing");
				
			}
		};
		d.draw();
	}

}
