import java.util.Scanner;

import com.chainsys.project.Product;

public class UserProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("          WELCOME TO jk Mobiles");

		System.out.println("Are you a Regular customer(yes/no)");
		String r = scan.next();
		String r1 = "yes", r2 = "no";
		if (r.equals(r1)) {
			System.out.println("welcome");
			System.out.println("Enter a number to choose a product:");
			System.out.println("1. MOBILE");
			System.out.println("2. LAPTOP");
//			System.out.println("3. Fruits");
			int choice = scan.nextInt();
			char ch='y';
			switch (choice) {
			case 1:
				System.out.println("\noneplus\nsamsung\nvivo\nrealme\n");
				String MOBILE = scan.next();

				switch (MOBILE) {
				case "oneplus":
					System.out.println("Mobile Name : OnePlus \n Ram : 8GB \n Storage : 128GB");
					System.out.println("If you want to buy press Y/N");
					ch=scan.next().toLowerCase().charAt(0);
					if(ch=='y') {
						int ONEPLUSPrice = 24999;
						System.out.println("enter the quantity");
						int ONEPLUSqty = scan.nextInt();
						priceCalculation(ONEPLUSPrice, ONEPLUSqty);
						if (ch == 'y') {	
							System.out.println("Enter your payment details (cash on delivery/pay online):");
							
					    System.out.println("Your order has been placed successfully! Thank you for shopping with us.");
					} else {
					    System.out.println("Thank You for Contacting us.");
					}
						break;
					}
					else {
						System.out.println("Thank You Contacting us");
					}

				case "samsung":
					System.out.println("Mobile Name : samsung \n Ram : 6GB \n Storage : 64GB");
					System.out.println("If you want to buy press Y/N");
					ch=scan.next().toLowerCase().charAt(0);
					if(ch=='y') {
					int SAMSUNGPrice = 26999;
					System.out.println("enter the quantity");
					int SAMSUNGqty = scan.nextInt();
					priceCalculation(SAMSUNGPrice, SAMSUNGqty);
					if (ch == 'y') {	
						System.out.println("Enter your payment details (cash on delivery/pay online):");
				    System.out.println("Your order has been placed successfully! Thank you for shopping with us.");
				} else {
				    System.out.println("Thank You for Contacting us.");
				}
					break;
					}
					
				case "vivo":
					System.out.println("Mobile Name : vivo \n Ram : 8GB \n Storage : 128GB");
					System.out.println("If you want to buy press Y/N");
					ch=scan.next().toLowerCase().charAt(0);
					if(ch =='y') {
					int VIVOPrice = 40000;
					System.out.println("enter the quantity");
					int VIVOqty = scan.nextInt();
					priceCalculation(VIVOPrice, VIVOqty);
					priceCalculation(VIVOPrice, VIVOqty);
					if (ch == 'y') {	
						System.out.println("Enter your payment details (cash on delivery/pay online):");
				    System.out.println("Your order has been placed successfully! Thank you for shopping with us.");
				} else {
				    System.out.println("Thank You for Contacting us.");
				}
					break;
					}
					
				case "realme":
					System.out.println("Mobile Name : realme \n Ram : 6GB \n Storage : 64GB");
					System.out.println("If you want to buy press Y/N");
					ch=scan.next().toLowerCase().charAt(0);
					if(ch =='y') {
					int REALMEPrice = 20;
					System.out.println("enter the quantity");
					int REALMEqty = scan.nextInt();
					priceCalculation(REALMEPrice, REALMEqty);
					if (ch == 'y') {	
						System.out.println("Enter your payment details (cash on delivery/pay online):");
				    System.out.println("Your order has been placed successfully! Thank you for shopping with us.");
				} else {
				    System.out.println("Thank You for Contacting us.");
				}
					break;
					}
					
					
				}

				break;
			case 2:
				System.out.println("\nlenovo\nhp\ndell\nasus\naser");
				String LAPTOP  = scan.next();
				
				switch (LAPTOP) {
				case "lenovo":
					System.out.println("Mobile Name : realme \n Ram : 6GB \n Storage : 64GB");
					System.out.println("If you want to buy press Y/N");
					ch=scan.next().toLowerCase().charAt(0);
					if(ch =='y') {
					int lenovoPrice = 40000;
					System.out.println("enter the quantity");
					int lenovoqty = scan.nextInt();
					priceCalculation(lenovoPrice, lenovoqty);
					if (ch== 'y') {	
						System.out.println("Enter your payment details (cash on delivery/pay online):");
				    System.out.println("Your order has been placed successfully! Thank you for shopping with us.");
				} else {
				    System.out.println("Thank You for Contacting us.");
				}
					break;
					}
					
				case "hp":

					System.out.println("Mobile Name : realme \n Ram : 6GB \n Storage : 64GB");
					System.out.println("If you want to buy press Y/N");
					ch=scan.next().toLowerCase().charAt(0);
					if(ch =='y') {
					int hpPrice = 32000;
					System.out.println("enter the quantity");
					int hpqty = scan.nextInt();
					priceCalculation(hpPrice, hpqty);
					if (ch == 'y') {	
						System.out.println("Enter your payment details (cash on delivery/pay online):");
				    System.out.println("Your order has been placed successfully! Thank you for shopping with us.");
				} else {
				    System.out.println("Thank You for Contacting us.");
				}
					break;
					}
					
				case "dell":
					System.out.println("Mobile Name : realme \n Ram : 6GB \n Storage : 64GB");
					System.out.println("If you want to buy press Y/N");
					ch=scan.next().toLowerCase().charAt(0);
					if(ch =='y') {
					int dellPrice = 25000;
					System.out.println("enter the quantity");
					int dellqty = scan.nextInt();
					priceCalculation(dellPrice, dellqty);
					if (ch == 'y') {	
						System.out.println("Enter your payment details (cash on delivery/pay online):");
				    System.out.println("Your order has been placed successfully! Thank you for shopping with us.");
				} else {
				    System.out.println("Thank You for Contacting us.");
				}
					break;
					}
					
				case "asus":
					System.out.println("Mobile Name : realme \n Ram : 6GB \n Storage : 64GB");
					System.out.println("If you want to buy press Y/N");
					ch=scan.next().toLowerCase().charAt(0);
					if(ch =='y') {
					int asusPrice = 10000;
					System.out.println("enter the quantity");
					int asusqty = scan.nextInt();
					priceCalculation(asusPrice, asusqty);
					if (ch == 'y') {	
						System.out.println("Enter your payment details (cash on delivery/pay online):");
				    System.out.println("Your order has been placed successfully! Thank you for shopping with us.");
				} else {
				    System.out.println("Thank You for Contacting us.");
				}
					break;
					}
					else {
						System.out.println("Thank You Contacting us");
					}
				case "aser":
					System.out.println("Mobile Name : realme \n Ram : 6GB \n Storage : 64GB");
					System.out.println("If you want to buy press Y/N");
					ch=scan.next().toLowerCase().charAt(0);
					if(ch =='y') {
					int aserPrice = 15000;
					System.out.println("enter the quantity");
					int aserqty = scan.nextInt();
					priceCalculation(aserPrice, aserqty);
					if (ch == 'y') {	
						System.out.println("Enter your payment details (cash on delivery/pay online):");
				    System.out.println("Your order has been placed successfully! Thank you for shopping with us.");
				} else {
				    System.out.println("Thank You for Contacting us.");
				}
					break;
					}
					
					break;
				}
			}
			
		}	
//			case 3:
//				System.out.println("\n1.Orange\n2.Apple\n3.Mango\n4.kiwi\n5.plum");
//				String Fruits  = scan.next();
//				
//				switch (Fruits) {
//
//
//			case "Orange":
//				int OrangePrice = 60;
//				System.out.println("enter the quantity");
//				int Orangeqty = scan.nextInt();
//				priceCalculation(OrangePrice, Orangeqty);
//
//			case "Apple":
//				int ApplePrice = 200;
//				System.out.println("enter the quantity");
//				int Appleqty = scan.nextInt();
//				priceCalculation(ApplePrice, Appleqty);
//			case "Mango":
//				int MangoPrice = 20;
//				System.out.println("enter the quantity");
//				int Mangoqty = scan.nextInt();
//				priceCalculation(MangoPrice, Mangoqty);
//			case "Kiwi":
//				int KiwiPrice = 100;
//				System.out.println("enter the quantity");
//				int Kiwiqty = scan.nextInt();
//				priceCalculation(KiwiPrice, Kiwiqty);
//			case "Plum":
//				int PlumPrice = 100;
//				System.out.println("enter the quantity");
//				int Plumqty = scan.nextInt();
//				priceCalculation(PlumPrice, Plumqty);
//				break;
//				
//				
//				
//				
//				}
//				}
//			}
//		else {
//			System.out.println("create new account or can't access");
//			System.out.println("create new account");
//			String Username = "kayal17";
//			String Password = "123@";
//			String Username2 = "Ash17";
//			String Password2 = "4562@";
//			String Username3 = "Angel17";
//			String Password3 = "789@";
//			Scanner scanner = new Scanner(System.in);
//			System.out.print("Enter your username: ");
//			String username = scanner.nextLine();
//			System.out.print("Enter your password: ");
//			String password = scanner.nextLine();
//			if (username.equals(Username) && password.equals(Password)) {
//				System.out.println("Welcome");
//			} else {
//				System.out.println("Please try again.");
//			}
//			System.out.println("Enter the product details: ");
//			System.out.print("Product ID: ");
//			int id = scan.nextInt();
//			System.out.print("Product Name: ");
//			String productName = scan.next();
//			System.out.print("Quantity: ");
//			int quantity = scan.nextInt();
//			System.out.print("Price (per unit): ");
//			int price = scan.nextInt();
//			int totalPrice;
//			int overAllPrice;
//			totalPrice = price * quantity;
//			overAllPrice = totalPrice + totalPrice;
//			System.out.println("Total Amount (Rs.) " + overAllPrice);
//			int discount = overAllPrice * 50 / 100;
//			System.out.println(" Discount (Rs.) " + discount);
		}
			
		
	
	
	
	public static void priceCalculation(int price, int quantity) {
		int totalPrice;

		totalPrice = price * quantity;

		double discount = totalPrice * 0.15 ;
		System.out.println("original price : " + totalPrice + " Discounted price : " + (totalPrice -discount));
		
	
	}
}
