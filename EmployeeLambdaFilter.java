package Java8Features;
import java.util.*;
import java.util.stream.Stream;
class Employee
{
	int empid;
	String name;
	float salary;
	Employee(int empid,String name, float salary)
	{
		super();
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
}
public class EmployeeLambdaFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> l1 = new ArrayList<Employee>();
		
		Employee e = new Employee(10, "Mahesh", 23310f);
		l1.add(e);
		
		l1.add(new Employee(11,"Rajesh",41410f));
		l1.add(new Employee(12,"Jayesh",45410f));
		l1.add(new Employee(13,"Suresh",39410f));
		
		Stream<Employee> filterData = l1.stream().filter(e1->e1.salary>40000);
		
		filterData.forEach(Employee->System.out.println(Employee.name+" "+Employee.salary));
	}

}
