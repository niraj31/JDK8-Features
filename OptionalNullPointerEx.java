package Java8Features;
import java.util.*;
public class OptionalNullPointerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]=new String[10];
		str[5]="Niraj";
		
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		if(checkNull.isPresent())
		{
			String lower_case=str[5].toLowerCase();
			System.out.println(lower_case);
		}
		else
		{
			System.out.println("String is empty...");
		}

	}

}
