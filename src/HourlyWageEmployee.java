
public class HourlyWageEmployee extends Employee{
	
	private int hourlyRate;
	
	public HourlyWageEmployee(String name, int hourlyRate) {
		super(name);
		this.hourlyRate = hourlyRate;
	}
	
	public double avarageMonthlySalary() {
		double salary = 20.8 * 8 * hourlyRate;
		return salary;
	}
	
	@Override
	public String toString() {
		return "ID: " + getId() + " Name: " + getName() + " Monthly salary: " + avarageMonthlySalary();
	}

}
