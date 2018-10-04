import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Serializable{

	private static int id = 0;
	private String name;
	
	private static NameComparator nameComparator = new NameComparator();
	
	public Employee(String name) {
		this.name = name;
		int id = this.id;
	}

	public static int getId() {
		return id++;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double avarageMonthlySalary() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "ID: " + getId() + " Name: " + getName();
	}
	
	public static NameComparator getNameComparator() {
		return nameComparator;
	}
	
	static class NameComparator implements Comparator<Employee> {
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	}
		
}
