package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product11
{
	int id;
	String name;
	float price;
	Product11(int id, String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamFilter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product11> p_list=new ArrayList<Product11>();
		p_list.add(new Product11(1,"HP",20000));
		p_list.add(new Product11(2,"iPad",35000));
		p_list.add(new Product11(3,"Dell",39000));
		p_list.add(new Product11(4,"Lenovo",45000));
		
		p_list.stream()
		.filter(p->p.price>30000)
		.forEach(p->System.out.println(p.name));
		
		double total = p_list.stream()
		.collect(Collectors.summingDouble(p->p.price));
		System.out.println(total);
	}

}
