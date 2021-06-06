package Assignment_2;

public abstract class Description { // superclass as abstract

	String benefit_stimulating, benefit_Refreshing, benefit_nourishing;

	public void printinfo() { // print info method

		this.benefit_stimulating = "Can improve memory, decrease fatigue";
		this.benefit_Refreshing = "Improve your mental functioning";
		this.benefit_nourishing = " Improves Skin Complexion\"";
		System.out.println("===WELCOME TO VANISRI'S NON-ALCHOLIC BEVERAGE SHOP===");
		System.out.println();

		System.out.println("This shop sell 3 types of non-alcholic beverage");
		System.out.println();

		System.out.println("---Benefits of the BEVERAGES ---");
		System.out.println("Stimulating Beverage  :" + this.benefit_stimulating);
		System.out.println("Refreshing Beverage   :" + this.benefit_Refreshing);
		System.out.println("Nourishing Beverage   :" + this.benefit_nourishing);

	}

	void ProductDescription() { // Constructor with one argument

		System.out.println("**************************************************************************");
		System.out.println("\t   Beverages Details & Information ");
		System.out.println("***************************************************************************");

		System.out.println("-------------------------Stimulating Type Beverage----------------------");
		System.out.println();

		System.out.println("ItemName |  Coffee                   |  Tea");
		System.out.println("Price    |  RM 13.00                 |  RM 15.00");
		System.out.println("Brand    |  Nescafé Classic Instant  |  BOH");
		System.out.println("Weight   |  100g                     |  20g");
		System.out.println("Volume   |  240ml                    |          -                            ");
		System.out.println("Shape    |  Can                      |  packet");
		System.out.println();

		System.out.println();

		System.out.println("------------------------------Refreshing Type Beverage----------------------");
		System.out.println();
		System.out.println("ItemName | mineral water            |  syrup    |    orange juice");
		System.out.println("Price    | RM 9.50                  | RM 16.70  |    RM 5.50");
		System.out.println("Brand    | Spritzer Mineral water   | Monin     |    Tropicana");
		System.out.println("Weight   |  100g                    | 100g      |    100g");
		System.out.println("Volume   | 500ml                    | 500ml     |    500ml");
		System.out.println("shape    | Bottle                   |  Bottle   |    paper Bottle");

		System.out.println();

		System.out.println("-----------------------------Nourishing  Type Beverage------------------------");
		System.out.println();
		System.out.println("ItemName : milk ");
		System.out.println("Price    : RM 7.00");
		System.out.println("Brand    : Dutch lady");
		System.out.println("Weight   :  20g");
		System.out.println("Volume   : 200ml");
		System.out.println("Shape    : paper Bottle");
		System.out.println("================================================================================");

	}

}
