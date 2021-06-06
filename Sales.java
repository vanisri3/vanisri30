package Assignment_2;

import java.util.Scanner;

public class Sales extends Employee implements Payment {

	Scanner scan = new Scanner(System.in);

	double inventory_purchase, incidental_charges, total_sale;
	double spending, profit, profitt;

	public Sales(String sn, int y, String p, String l) {
		super(sn, y, p, l);

		System.out.println("=================================");
		System.out.println("Sales information");
		setinventory_purchase();
		setincidental_charges();
		settotalsale();

		System.out.println("\n============================================================"
				+ "\nTotal inventory spending :RM" + String.format("%.2f", getinventory_purchase())
				+ "\nTotal incidental charges :RM" + String.format("%.2f", getincidental_charges()) + "\nTotal sale :RM"
				+ String.format("%.2f", gettotal_sale()) + "\nTotal profit :RM" + String.format("%.2f", getprofit())
				+ "\nBonus for employee in a year :RM" + String.format("%.2f", this.getpayment(1000))
				+ "\n==============================================================");

	}

	// getter setter method
	void setinventory_purchase() {
		System.out.println("Total spending on invontory_purchase :");
		this.inventory_purchase = scan.nextDouble();
	}

	public void setincidental_charges() {
		System.out.println("Incidental charges that you pay  :");
		this.incidental_charges = scan.nextDouble();

	}

	public void settotalsale() {
		System.out.println("Total sales of the month:");
		this.total_sale = scan.nextDouble();

	}

	// getter method

	public double getinventory_purchase() {
		return this.inventory_purchase;
	}

	public double getincidental_charges() {
		return this.incidental_charges;
	}

	public double gettotal_sale() {
		return this.total_sale;
	}

	public double getprofit() {
		spending = this.incidental_charges + this.inventory_purchase;
		profitt = this.total_sale - spending;
		return profitt;

	}

	public double getpayment(double bonus) { // interface getpayment
		return 500;
	}

	public String toString() { // print info
		return "\n============================================================" + "\nTotal inventory spending :RM"
				+ String.format("%.2f", getinventory_purchase()) + "\nTotal incidental charges :RM"
				+ String.format("%.2f", getincidental_charges()) + "\nTotal sale :RM"
				+ String.format("%.2f", gettotal_sale()) + "\nTotal profit :RM" + String.format("%.2f", getprofit())
				+ "\n==============================================================";

	}

}
