package pack1;
import java.util.Scanner;

public class practice {
	
	
	
	

	
		
		 public  static Scanner sc = new Scanner(System.in);
		    public  static int chioce,quantity=1;
		    public  static String again;
		    public  static double total=0,pay;
		     public static char item;
		     public static int Star;
		    
		    
		    
	public  static void Starter() {
		    	
		    	System.out.println("\t WEL COME TO OUR RESTAURANT");
		    	System.out.println("       --------------------------------");
			    System.out.println(" A: Starter");
				System.out.println("\t1.  Cheese Poppers          $10.00");
				System.out.println("\t2.  Vegitable Gold Coins    $7.00");
				System.out.println("\t3. Chilli Paneer            $4.00");
				System.out.println("\t4. Steamed Wontons          $10.00");
			    System.out.println("\t5. Momos                    $9.00");
			    System.out.println("\t6 Mexican Bread Rolls       $10.00");
		    	
		    }
		
		    
		    public  static void Main_Courses() {
		    	System.out.println("B: Menu");
				System.out.println("\t1. Chicken and Rice           $10.00");
				System.out.println("\t2. Grilled Fish And Potatoes  $10.00 ");
				System.out.println("\t3. Biryani                    $11.00");
				System.out.println("\t4. Chiken Tikka               $6.00");
			    System.out.println("\t5. Naan                       $3.00");
			    System.out.println("\t6. Chappaty                   $2.00");
			    
		    	
		    }
	public  static void Drinks() {
		    	
		    	System.out.println(" C: Drinks");
				
				System.out.println("\t1. Mineral Water       $2.00");
				System.out.println("\t2. Fresh Fruit Juice   $2.00");
				System.out.println("\t3. Coffee              $2.00");
				System.out.println("\t4. Tea                 $2.00");
			    System.out.println("\t5. Wines               $3.00");
			    
		    }
	public  static void Dessert() {
		
		System.out.println("D: Dessert");
		
		System.out.println("\t1. Fruit And Cream   $5.00");
		System.out.println("\t2. Ice Cream         $3.00");
		System.out.println("\t3. Apple Pie         $3.00");
		System.out.println("\t4. Chocolate Cake    $5.00");
	    System.out.println("\t7. Cancel  ");
		
	}

	// method start === oder start here

	 public static void order() {
		 System.out.println("A to Starter || B to Menu || C to Drinks || D to  Dessert");
		 System.out.println("press you want to order");
		 item=sc.next().charAt(0);
		 switch(item) {
			 case 'A':
			 Starter();
			 System.out.println("press you want to starter");
			 Star =sc.nextInt();
			 
			 //First iteam in starter
			 if(Star ==1) {
				 System.out.println("if your chioce is  Chees Poppers");
				 System.out.println("How many Chees popper you want");
				 quantity= sc.nextInt();
			    	total=total+(quantity*10.00);
			    	System.out.println("if you want to bye again");
			    	System.out.println("press Y for [yes]and N for[No]");
			    	again=sc.next();
			    	if(again.equalsIgnoreCase("Y")) 
			    		order();
			    	else {
			    		 System.out.println("Enter the payment");
			    		 pay=sc.nextDouble();
			    		 if(pay<total)
			    			 System.out.println("no nee more");
			    		 else {
			    			 System.out.println("total"+total);
			    			 total=pay-total;
			    			 System.out.println("Customer return "+total+ "tk");
			    		 }
			    	}
				}
			 //Second Iteam in starter
			 
			 else if(Star ==2) {
				 System.out.println("if your chioce is  Vegitable Gold Coins");
				 System.out.println("How many Vegitable Gold Coins you want");
				 quantity= sc.nextInt();
			    	total=total+(quantity*7.00);
			    	System.out.println("if you want to buy again");
			    	System.out.println("press Y for [yes]and N for[No]");
			    	again=sc.next();
			    	if(again.equalsIgnoreCase("Y")) 
			    		order();
			    	else {
			    		 System.out.println("Enter the payment");
			    		 pay=sc.nextDouble();
			    		 if(pay<total)
			    			 System.out.println("no nee more");
			    		 else {
			    			 System.out.println("total"+total);
			    			 total=pay-total;
			    			 System.out.println("Customer return "+total+ "tk");
			    		 }
			    	}
				}
			 
			 //Third item in starter
			 else if(Star ==3) {
				 System.out.println("if your chioce is  Chilli Paneer ");
				 System.out.println("How many Chilli Paneer  you want");
				 quantity= sc.nextInt();
			    	total=total+(quantity*4.00);
			    	System.out.println("if you want to buy again");
			    	System.out.println("press Y for [yes]and N for[No]");
			    	again=sc.next();
			    	if(again.equalsIgnoreCase("Y")) 
			    		order();
			    	else {
			    		 System.out.println("Enter the payment");
			    		 pay=sc.nextDouble();
			    		 if(pay<total)
			    			 System.out.println("no nee more");
			    		 else {
			    			 System.out.println("total"+total);
			    			 total=pay-total;
			    			 System.out.println("Customer return "+total+ "tk");
			    		 }
			    	}
				}
			 
			 //Four iteam in starter
			 
			 else if(Star ==4) {
				 System.out.println("if your chioce is  Steamed Wontons");
				 System.out.println("How many Steamed Wontons you want");
				 quantity= sc.nextInt();
			    	total=total+(quantity*10.00);
			    	System.out.println("if you want to buy again");
			    	System.out.println("press Y for [yes]and N for[No]");
			    	again=sc.next();
			    	if(again.equalsIgnoreCase("Y")) 
			    		order();
			    	else {
			    		 System.out.println("Enter the payment");
			    		 pay=sc.nextDouble();
			    		 if(pay<total)
			    			 System.out.println("no nee more");
			    		 else {
			    			 System.out.println("total"+total);
			    			 total=pay-total;
			    			 System.out.println("Customer return "+total+ "tk");
			    		 }
			    	}
				}
			 
			 //five iteam in starter
			 
			 else if(Star ==5) {
				 System.out.println("if your chioce is  Momos");
				 System.out.println("How many Momos you want");
				 quantity= sc.nextInt();
			    	total=total+(quantity*9.00);
			    	System.out.println("if you want to buy again");
			    	System.out.println("press Y for [yes]and N for[No]");
			    	again=sc.next();
			    	if(again.equalsIgnoreCase("Y")) 
			    		order();
			    	else {
			    		 System.out.println("Enter the payment");
			    		 pay=sc.nextDouble();
			    		 if(pay<total)
			    			 System.out.println("no nee more");
			    		 else {
			    			 System.out.println("total"+total);
			    			 total=pay-total;
			    			 System.out.println("Customer return "+total+ "tk");
			    		 }
			    	}
				}
			 
			 //six iteam in starter
			 
			 else if(Star ==6) {
				 System.out.println("if your chioce Mexican Bread Rolls");
				 System.out.println("How many Mexican Bread Rolls you want");
				 quantity= sc.nextInt();
			    	total=total+(quantity*10.00);
			    	System.out.println("if you want to buy again");
			    	System.out.println("press Y for [yes]and N for[No]");
			    	again=sc.next();
			    	if(again.equalsIgnoreCase("Y")) 
			    		order();
			    	else {
			    		 System.out.println("Enter the payment");
			    		 pay=sc.nextDouble();
			    		 if(pay<total)
			    			 System.out.println("no need more");
			    		 else {
			    			 System.out.println("total"+total);
			    			 total=pay-total;
			    			 System.out.println("Customer return "+total+ "tk");
			    		 }
			    	}
				}break;  
		//-----------------------------------------------------------------------------
		//------------------------------------------------------------------------------
		//********main menu  start Her*******
			 
			 case 'B':
				 Main_Courses();
				 System.out.println("press you want to starter");
				 Star =sc.nextInt();
				 
				 //First iteam in Menu
				 if(Star ==1) {
					 System.out.println("if your chioce is  Chicken and Rice ");
					 System.out.println("How many Chicken and Rice  you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*10.00);
				    	System.out.println("if you want to bye again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 
				//Second Iteam in menu
				 
				 else if(Star ==2) {
					 System.out.println("if your chioce is  Grilled Fish And Potatoes");
					 System.out.println("How many Grilled Fish And Potatoes you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*10.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 
				 //Third item in menu
				 else if(Star ==3) {
					 System.out.println("if your chioce is  Biryani  ");
					 System.out.println("How many Biryani   you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*11.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 
				 //Four iteam in starter
				 
				 else if(Star ==4) {
					 System.out.println("if your chioce is  Chiken Tikka ");
					 System.out.println("How many Chiken Tikka  you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*6.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 
				 //five iteam in menu
				 
				 else if(Star ==5) {
					 System.out.println("if your chioce is  Naan");
					 System.out.println("How many Naan you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*3.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 
				 //six iteam in menu
				 
				 else if(Star ==6) {
					 System.out.println("if your chioce Chappaty ");
					 System.out.println("How many Chappaty  you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*2.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no need more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}break; 
					
					// Drinks menu start
					
			 case 'C':
				 
				 Drinks();
				 System.out.println("press you want to starter");
				 Star =sc.nextInt();
				 
				 //First iteam in Drinks
				 if(Star ==1) {
					 System.out.println("if your chioce is  Mineral Water");
					 System.out.println("How many Mineral Water you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*2.00);
				    	System.out.println("if you want to bye again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 //Second Iteam in Drinks
				 
				 else if(Star ==2) {
					 System.out.println("if your chioce is  Fresh Fruit Juice");
					 System.out.println("How many Fresh Fruit Juice you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*2.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 
				 //Third item in drinks
				 else if(Star ==3) {
					 System.out.println("if your chioce is Coffee ");
					 System.out.println("How many Coffee  you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*2.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 
				 //Four iteam in drinks
				 
				 else if(Star ==4) {
					 System.out.println("if your chioce is  Tea ");
					 System.out.println("How many Tea  you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*2.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 
				 //five iteam in drinks
				 
				 else if(Star ==5) {
					 System.out.println("if your chioce is  Wines");
					 System.out.println("How many Wines you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*3.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}break;
					
			 case 'D':
				 
				 Dessert();
				 System.out.println("press you want to starter");
				 Star =sc.nextInt();
				 
				 //First iteam in Dessert
				 if(Star ==1) {
					 System.out.println("if your chioce is  Fruit And Cream");
					 System.out.println("How many Fruit And Cream you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*5.00);
				    	System.out.println("if you want to bye again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+total+ "tk");
				    		 }
				    	}
					}
				 //Second Iteam in Dessert
				 
				 else if(Star ==2) {
					 System.out.println("if your chioce is  ice Cream");
					 System.out.println("How many Fresh ice Cream you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*3.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+" "+total+ "tk");
				    		 }
				    	}
					}
				 
				 //Third item in Dessert
				 else if(Star ==3) {
					 System.out.println("if your chioce is Apple Pie ");
					 System.out.println("How many Apple Pie  you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*3.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+" "+total+ "tk");
				    		 }
				    	}
					}
				 
				 //Four iteam in dessert
				 
				 else if(Star ==4) {
					 System.out.println("if your chioce is  Chocolate Cake  ");
					 System.out.println("How many Chocolate Cake   you want");
					 quantity= sc.nextInt();
				    	total=total+(quantity*5.00);
				    	System.out.println("if you want to buy again");
				    	System.out.println("press Y for [yes]and N for[No]");
				    	again=sc.next();
				    	if(again.equalsIgnoreCase("Y")) 
				    		order();
				    	else {
				    		 System.out.println("Enter the payment");
				    		 pay=sc.nextDouble();
				    		 if(pay<total)
				    			 System.out.println("no nee more");
				    		 else {
				    			 System.out.println("total"+total);
				    			 total=pay-total;
				    			 System.out.println("Customer return "+" "+total+ "tk");
				    		 }
				    	}
					}
				 default:   
			            System.out.println("Not order any food");  
				 
				
				

				
				 
			 
	    }// switch braket
			 
		 
		 
		 
	 }//order method  bracket



	public static void main(String[] args) {
		Starter();
		Main_Courses();
		Drinks();
		Dessert();
		order();
		
		
		
		
		
		
	}

		
		
		
		

	}

	


