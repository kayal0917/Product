import java.util.Scanner;

import com.chainsys.project.Product;

public class UserProduct {

	public static void main(String[] args) {

		user();
	}

	public static int warrenty = 5;
	static String coupon = "SFDFDS122";

	public static void user() {
		Scanner sc = new Scanner(System.in);

		System.out.println("          WELCOME TO Ash Mobiles");

		System.out.println("Are you a Regular customer(yes/no)");
		String r = sc.next();
		String r1 = "yes", r2 = "no";

		if (r.equals(r1)) {
			m2();

		} else if (r.equals(r2)) {
			NoUserProduct n = new NoUserProduct();
			n.detailss();
			m2();

		}

	}

	public static void m2() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number to choose a product:");
		System.out.println("1. MOBILE");
		System.out.println("2. LAPTOP");
		int choice = scan.nextInt();
		char ch = 'y';
		if (choice == 1 || choice == 2) {
			switch (choice) {
			case 1:
				System.out.println("\n1.oneplus\n2.samsung\n3.vivo\n4.realme\n");
				int MOBILE = scan.nextInt();

				switch (MOBILE) {
				case 1:
					System.out.println("Mobile Name : OnePlus Nord CE4\n128GB 8GB RAM Gsm Unlocked Phone Qualcomm Snapdragon 7 Gen 3 50MP");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y') {
						int ONEPLUSPrice = 45999;
						System.out.println("enter the quantity");
						int ONEPLUSqty = scan.nextInt();
						priceCalculation(ONEPLUSPrice, ONEPLUSqty);
						if (ch == 'y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();

							if (payment.equals("cod")) {
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					}
					if (ch == 'n')
						System.out.println("Thank you");
					break;

				case 2:
					System.out.println("Mobile Name : samsung \n Galaxy Z Flip3 5G(SM-F711BZEEMEA\n8 GB RAM, 128 GB | 256 GB Storage\nDynamic AMOLED 2X Main Display");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y') {
						int SAMSUNGPrice = 84999;
						System.out.println("enter the quantity");
						int SAMSUNGqty = scan.nextInt();
						priceCalculation(SAMSUNGPrice, SAMSUNGqty);
						if (ch == 'y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();

							if (payment.equals("cod")) {
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");

						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");

				case 3:
					System.out.println("Mobile Name : Vivo S18e\nQualcomm Snapdragon 7 Gen 3\n120 Hz refresh rate 6.67-inch touchscreen ");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y') {
						int VIVOPrice = 40000;
						System.out.println("enter the quantity");
						int VIVOqty = scan.nextInt();
						priceCalculation(VIVOPrice, VIVOqty);
						priceCalculation(VIVOPrice, VIVOqty);
						if (ch == 'y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();

							if (payment.equals("cod")) {
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");

				case 4:
					System.out.println("Mobile Name : realme \n Ram : 6GB \n Storage : 64GB");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y') {
						int REALMEPrice = 20;
						System.out.println("enter the quantity");
						int REALMEqty = scan.nextInt();
						priceCalculation(REALMEPrice, REALMEqty);
						if (ch == 'y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();

							if (payment.equals("cod")) {
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N') {
						System.out.println("Thank you");

					}
					break;
				}
				break;
			case 2:
				System.out.println("\n1.lenovo\n2.hp\n3.dell\n4.asus\n6.aser");
				int LAPTOP = scan.nextInt();

				switch (LAPTOP) {
				case 1:
					System.out.println(
							"laptop Name : lenovo \n IdeaPad 5i 2-in-1 Intel, 35.56cms - Core Windows 11 Home 64 Single Language\n 256 GB SSD M.2 2242 PCIe Gen4 TLC \n Yahh You Got Warrenty"
									+ warrenty + " Years");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						int lenovoPrice = 73074;

						System.out.println("enter the quantity");
						int lenovoqty = scan.nextInt();
						priceCalculation(lenovoPrice, lenovoqty);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();

							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");

				case 2:

					System.out.println(
							"laptop Name : HP Laptop 39.6 cm 15s-fq5327TU \nWindows 11 Home Single Language 39.6 cm (15.6) \n8 GB DDR4 RAM 512 GB SSD Hard drive \nTrue Vision 720p HD camera"
									+ "warrenty" + " Years");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						int hpPrice = 56908;
						System.out.println("enter the quantity");
						int hpqty = scan.nextInt();
						priceCalculation(hpPrice, hpqty);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();

							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");

								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N') {
						System.out.println("Thank you");
					}
				case 3:
					System.out.println(
							"laptop Name :Dell Inspiron 16 Plus\ni7-13700H \nRTX 4050 L, 16GB of RAM, and a 1TB SSD"
									+ "warrenty+\" Years");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						int dellPrice = 25000;
						System.out.println("enter the quantity");
						int dellqty = scan.nextInt();
						priceCalculation(dellPrice, dellqty);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();

							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");

								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");

				case 4:
					System.out.println(
							"laptop Name : ASUS Zenbook DUO (2024) UX8406 \nPDDR5x RAM and 2 TB SSD\nIntel® Core™ Ultra 9 processor with NPU"
									+ "warrenty" + " Years");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						int asusPrice = 159990;
						System.out.println("enter the quantity");
						int asusqty = scan.nextInt();
						priceCalculation(asusPrice, asusqty);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();

							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");

								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");
				case 5:
					System.out.println(
							"laptop Name : Acer Aspire 3 14 Intel Core i3 N305\n 512 GB, PCIe Gen3, 8 Gb/s up to 4 lanes, NVMe\nA314-36M"
									+ "warrenty" + " Years");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {

						int aserPrice = 45999;
						System.out.println("enter the quantity");
						int aserqty = scan.nextInt();
						priceCalculation(aserPrice, aserqty);
						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();

							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");

								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {

							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N') {
						System.out.println("Thank you");

						break;
					}
				}
			}
		} else {
			System.out.println("Invalid data");
		}
	}

//						System.out.println("Enter your payment details (cod/online):");
//						String details=scan.next();
//						String name =scan.next();
//						
//						if(details.equals("cod")) {
//							System.out.println("");

//		
	public static void priceCalculation(int price, int quantity) {
		int totalPrice;

		totalPrice = price * quantity;

		double discount = totalPrice * 0.15;
		System.out.println("original price : " + totalPrice + " Discounted price : " + (totalPrice - discount));

	}
}
