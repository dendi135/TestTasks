import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Employee em1 = new FixedPaymentEmployee("Denys", 40000);
		Employee em2 = new FixedPaymentEmployee("Roman", 24000);
		Employee em3 = new FixedPaymentEmployee("Evgen", 60000);
		Employee em4 = new HourlyWageEmployee("Oleksandr", 200);
		Employee em5 = new HourlyWageEmployee("Maksym", 450);
		Employee em6 = new HourlyWageEmployee("Andriy", 300);
		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);;
		System.out.println(em4);
		System.out.println(em5);
		System.out.println(em6);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(em1);
		employees.add(em2);
		employees.add(em3);
		employees.add(em4);
		employees.add(em5);
		employees.add(em6);
		
		System.out.println(employees);
		
		Collections.sort(employees, Employee.getNameComparator());
		System.out.println(employees);
		
		employees.sort(new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if (e1.avarageMonthlySalary() == e2.avarageMonthlySalary()) return 0;
				else if (e1.avarageMonthlySalary() > e2.avarageMonthlySalary()) return 1;
				else return -1;
			}
		});
		
		System.out.println(employees);
		
		Iterator<Employee> iter = employees.iterator();
		int i = 0;
		while(i < 5 && iter.hasNext()) {
			System.out.println(iter.next());
			i++;
		}
		
		System.out.println("=========================");
		
		Collections.reverse(employees);
		int j = 0;
		while(j < 3) {
			System.out.println(employees.get(j).getName() + "'s ID: " + employees.get(j).getId());
			j++;
		}
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("1.dat"))) {
			out.writeObject(employees);
			System.out.println("Employees writed to file");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("1.dat"))) {
			employees.addAll((ArrayList<Employee>)in.readObject());
			System.out.println("Employees input to collection");
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(employees);
		
	}

}
