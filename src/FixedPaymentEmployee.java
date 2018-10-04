
public class FixedPaymentEmployee extends Employee{

	private int monthlyPayment;
	
	public FixedPaymentEmployee(String name, int monthlyPayment) {
		super(name);
		this.monthlyPayment = monthlyPayment;
	}
	
	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	public double avarageMonthlySalary() {
		return monthlyPayment;
	}
	
	@Override
	public String toString() {
		return "ID: " + getId() + " Name: " + getName() + " Monthly salary: " + avarageMonthlySalary();
	}

}
