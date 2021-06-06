package Assignment_2;

import java.util.Scanner;

public class Employee extends BeverageShop { // inheritance method

	Scanner scan = new Scanner(System.in);

	private String name;

	protected String id;

	protected String position;
	char gender;
	private double salary, epf;
	private int overtime;

	public Employee(String sn, int y, String p, String l) { // constructor with arguments
		super(sn, y, p, l);

		System.out.println("=========================================================");
		System.out.println("Employee Information Collection");
		setName();
		setEmployeeID();
		setgender();
		setposition();
		setovertime();
		setSalary();
		setepf();

		System.out.println("This employee registered as " + super.ShopName + " employee " + " at " + super.location);
	}

	public Employee(String sn, int y, String p, String l, double salary, double epf, int overtime) {// constructor wit
																									// arguments
		super(sn, y, p, l);
		this.salary = salary;
		this.epf = epf;
		this.overtime = overtime;
	}

	// getter setter method
	public void setName() {
		System.out.print("\nEnter Employee name: ");
		this.name = scan.nextLine();
	}

	public void setgender() {
		System.out.println("Enter Gender [M / F ] :");
		this.gender = scan.next().charAt(0);
	}

	public void setposition() {
		System.out.print("\nEnter Position : ");
		this.position = scan.nextLine();
		scan.nextLine();
	}

	public void setEmployeeID() {
		System.out.print("\nEnter Employee ID : ");
		this.id = scan.nextLine();
		scan.nextLine();
	}

	public void setovertime() {
		System.out.print("\nEnter overtime in a month :");
		this.overtime = scan.nextInt();
	}

	public void setSalary() {
		System.out.print("\nEnter salary per month: RM");
		this.salary = scan.nextDouble();
	}

	public void setepf() {
		System.out.print("\nEnter the epf deduction : RM");
		this.epf = scan.nextDouble();
	}

	public String getName() {
		return this.name;
	}

	public String getEmployeeID() {
		return this.id;
	}

	public int getovertime() {
		return this.overtime;
	}

	public double otpay() {
		return 1.3 * this.overtime;

	}

	public double getepf() {
		return this.epf;
	}

	public double getSalary() {
		return this.salary + otpay() - this.epf;
	}

	// print info method
	public String toString() {
		return "————————————————————————————————" + "\nEmployee Data\n" + "\nEmployee Name  : " + this.getName()
				+ "\nEmployee ID    : " + getEmployeeID() + "\nEpf deduction : " + getepf() + "\novertime    : "
				+ getovertime() + "\nEmployee salary: RM" + getSalary() + "\n————————————————————————————";

	}

}
