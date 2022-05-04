package Java8Features;
import java.util.*;
import java.util.stream.Stream;
class Product
{
	int id;
	String name;
	float price;
	Product(int id, String name, float price)
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class LambdaFilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<Product>();
		
		Product p1 = new Product(10, "AC", 38810f);
		list.add(p1);
		
		list.add(new Product(11,"TV",26712f));
		list.add(new Product(12,"Refrigerator",15752f));
		list.add(new Product(13,"Cooler",9031f));
		
		Stream<Product> filterData = list.stream().filter(p->p.price>10000);
		filterData.forEach(Product->System.out.println(Product.name+" "+Product.price));

	}

}
