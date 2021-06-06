package Assignment_2;

import java.util.Scanner;

public class Inventory {

	String beveragetype;
	String name;
	double beverageprice;
	int beveragestock, quantity;
	String datestockin;

	Scanner scan = new Scanner(System.in);

	public Inventory() {

		System.out.println(" \t\t\t\t\tInventory Management");
		System.out.println(
				"=================================================================================================");
		System.out.println("Name Of Beverage| Type of Beverage | Beverage Price| Inventory Stock | date stock in  |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("Stimulating\t     Coffee              13.00\t       200\t          12/2/2021");
		System.out.println("Stimulating\t     Tea                 15.00\t       150\t          10/2/2021");
		System.out.println("Refreshing\t      water               9.50\t        50\t           2/2/2021");
		System.out.println("Refreshing\t      syrup               16.70\t       200\t          21/2/2021");
		System.out.println("Refreshing\t      juice               5.50\t        300\t          21/2/2021");
		System.out.println("Nourishing\t      milk                7.00\t        200\t          5/3/2021");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		System.out.println("========================================================================================");
		System.out.println("Inventory information");
		setbeveragetype();
		setname();
		setbeverageprice();
		setdatestockin();
		System.out.println("————————————————————————————————————————————————————————————————————————————————————————");

		System.out.println("New item sucessfully added to the list");
		System.out.println("---------------------------------------");

	}

	// getter setter method
	private void setdatestockin() {
		System.out.println("Enter beverage stock in date :");
		this.datestockin = scan.nextLine();
		scan.nextLine();

	}

	private void setbeverageprice() {
		System.out.println("Enter beverage price :RM");
		this.beverageprice = scan.nextDouble();
	}

	private void setname() {
		System.out.println("Enter beverage name:");
		this.name = scan.nextLine();
	}

	private void setbeveragetype() {
		System.out.println("Enter beverage type:");
		this.beveragetype = scan.nextLine();

	}

	public String getbeveragename() {
		return this.name;
	}

	public String getbeveragetype() {
		return this.beveragetype;
	}

	public double getbeverageprice() {
		return this.beverageprice;
	}

	public String getdatestockin() {
		return this.datestockin;
	}

	// print info method
	public String toString() {
		return "————————————————————————————————" + "\nInventory stock Information \n" + "\nName  : "
				+ getbeveragename() + "\nBeverage type   : " + getbeveragetype() + "\nBeverage price: "
				+ getbeverageprice() + "\nDate stock in : " + getdatestockin() + "\n————————————————————————————";

	}

}
