package Java8Features;

import java.util.function.BiFunction;

class Arithmetic
{
	static int add(int a,int b)
	{
		return a+b;
	}
}
public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer>sum=Arithmetic::add;
		int result=sum.apply(10, 20);
		System.out.println(result);
	}

}
