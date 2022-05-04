package Java8Features;
import java.util.*;
import java.util.stream.Collectors;
class Product1
{
	int id;
	String name;
	float price;
	Product1(int id, String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product1> p_list=new ArrayList<Product1>();
		p_list.add(new Product1(1,"HP",20000));
		p_list.add(new Product1(2,"iPad",35000));
		p_list.add(new Product1(3,"Dell",39000));
		p_list.add(new Product1(4,"Lenovo",45000));
		
		List<Float> p_list2= p_list.stream()
		.filter(p->p.price>30000)
		.map(p->p.price)
		.collect(Collectors.toList());
		
		System.out.println(p_list2);
	}

}
