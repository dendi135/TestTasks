package AnotherTask;

class Customer extends Rental{
	private String name;

	// Other fields, constructors, get, set, etc.
	//
	public Customer(String name, int kind, int days) {
		super(kind, days);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// Other methods.
	
	public static void main(String[] args) {
		Customer c = new Customer("Vasya", 5, 20);
		System.out.println(c.getName() + " " + c.amountFor());
	}
}
