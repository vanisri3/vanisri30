package Assignment_2;

public abstract class BeverageShop { // superclass as abstract

	protected String ShopName, phonenumber, location;
	protected int yearestablished;

	public BeverageShop(String sn, int y, String p, String l) {// constructor with argument
		this.ShopName = sn;
		this.yearestablished = y;
		this.phonenumber = p;
		this.location = l;

		printInfo();

	}

	public BeverageShop(String shopName, String location) {
		super();
		ShopName = shopName;
		this.location = location;
	}

	// getter setter method
	protected String getShopName() {
		return ShopName;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public String getLocation() {
		return location;
	}

	public int getYearestablished() {
		return yearestablished;
	}

	public void setShopName(String ShopName) {
		this.ShopName = ShopName;
	}

	public void setPhonenenumber(String phonenenumber) {
		this.phonenumber = phonenenumber;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setYearestablished(int yearestablished) {
		this.yearestablished = yearestablished;
	}

	public void printInfo() { // print info method
		System.out.println("=============== Information of Shop =======================");

		System.out.println("Shop Name :" + getShopName());
		System.out.println("Year Shop Established :" + getYearestablished());
		System.out.println("Phone number of shop : " + getPhonenumber());
		System.out.println("Location :" + getLocation());

		System.out.println("===========================================================");
	}

}
