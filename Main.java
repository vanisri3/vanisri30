package Assignment_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("===WELCOME TO THE BEVERAGE SHOP SYSTEM===");
		System.out.println("Kindly Select your choice :" + "\n1) Admin page" + "\n2) Customer Order Page");
		int choice = scan.nextInt();

		if (choice == 1) {
			Inventory i = new Inventory();
			i.toString();
			System.out.println();

			Sales s = new Sales("Vani's Beverage Shop", 2018, "01123455461", "NO 322, JALAN MAHSURI KEDAH");

		} else if (choice == 2) {

			Marketing m = new Marketing();
			System.out.println();
			Marketing mt = new Marketing(40, "refreshing beverage RM15", 3);
			System.out.println("*******************************************************");
			Marketing mt2 = new Marketing(60, "Stimulate beverage RM10", 5, "Water Bottle");
			System.out.println("*******************************************************");
			m.print();
			System.out.println();

			Customer c = new Customer();
		//	c.printinfo();
			
			c.printreceipt();

		}

	}

}
