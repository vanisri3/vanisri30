package Assignment_2;

public class Marketing {

	String voucher;
	int discount;
	String freegift;
	double price;

	public Marketing() { // constructor with no argument

		System.out.println(" Vanisri Non-Alcholic Beverage Shop");
	}

	public Marketing(double pc, String v, int dis) { // constructor with 3 arguments
		price = 40;
		discount = 3;
		voucher = "refreshing beverage RM15";

		print(price, voucher, discount);

	}

	public Marketing(double pc, String v, int dis, String fg) { // constructor with 4 argumets

		price = 60;
		voucher = "Stimulate beverage 10";
		discount = 5;
		freegift = "water bottle";

		print(price, voucher, discount, freegift);
	}

	public String getVoucher() {
		return voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getFreegift() {
		return freegift;
	}

	public void setFreegift(String freegift) {
		this.freegift = freegift;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void print(double price, String voucher, int discount) { // print method with 3 parameters
		System.out.println("==========================================================");
		System.out.println("We are coming with new offers NOW !!!");
		System.out.println("%%%%% Special Offer %%%%%");
		System.out.println();
		System.out.println("Buy more than RM" + String.format("%.2f", price));
		System.out.println("Got discount :" + discount + "%");
		System.out.println("Free voucher :" + getVoucher());

	}

	public void print(double price, String voucher, int discount, String freegift) {// print method with 4 parameters
		System.out.println("Buy more more than :RM" + String.format("%.2f", price));
		System.out.println("Got discount :" + discount + "%");
		System.out.println("Free voucher :" + voucher);
		System.out.println("Free gift :" + freegift);

	}

	public void print() { // print method with no paramters
		System.out.println("For more information can contact us via");
		System.out.println("INSTAGRAM : @vaniNonAlcholicBeverage");
		System.out.println("FACEBOOK  : VANI's Non Alcholic Bverage Shop");
		System.out.println("Do get your discount , free voucher and free gift NOW !!!");
		System.out.println("===================================================================");
	}

}
