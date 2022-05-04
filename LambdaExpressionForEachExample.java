package Java8Features;
import java.util.*;
public class LambdaExpressionForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Mahesh");
		al.add("Suresh");
		al.add("Jayesh");
		al.add("Rajesh");
		
		al.forEach((n)->
		System.out.println(n));

	}

}
