package project;

public abstract class Empregado {
	private String name;
	private String address;
	private int ID;
	private String paymentMethod;
	private boolean syndicate;
	private double syndicateTax;
	private int syndicateID;
	private double syndicateService;
	private double salary;

	public abstract void totalSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public boolean isSyndicate() {
		return syndicate;
	}

	public void setSyndicate(boolean syndicate) {
		this.syndicate = syndicate;
	}

	public double getSyndicateTax() {
		return syndicateTax;
	}

	public void setSyndicateTax(double syndicateTax) {
		this.syndicateTax = syndicateTax;
	}

	public int getSyndicateID() {
		return syndicateID;
	}

	public void setSyndicateID(int syndicateID) {
		this.syndicateID = syndicateID;
	}

	public double getSyndicateService() {
		return syndicateService;
	}

	public void setSyndicateService(double syndicateService) {
		this.syndicateService = syndicateService;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	}