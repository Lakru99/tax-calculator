import java.util.*;
class Example{
	public final static void clearConsole(){
		try {   
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
			}else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}catch (final Exception e) {
			e.printStackTrace();
		}
	}
	
	public static double rentTaxCalc(){
		Scanner input=new Scanner(System.in);
		System.out.println(" --------------------------------------------------------");
		System.out.println("|                      Rent Tax                          |");
		System.out.println(" --------------------------------------------------------");
		System.out.println(" ");
		        
		        
		System.out.print("Enter payment amount : ");
		int inputPaymentAmount  = input.nextInt();
		double payRentTax = 0;
		if (inputPaymentAmount>0){
			if(inputPaymentAmount>100000){
				payRentTax = (inputPaymentAmount-100000) * 10/100;
				System.out.println("You have to pay Rent Tax : " + String.format("%.2f", payRentTax));
			}else{
				System.out.println("You don't have to pay Rent Tax ");
			}
		}else{
			System.out.println("Invalid Input...");
		}
		
		System.out.println(" Do you want to enter the correct value again (Y/N) : ");
		char choice = input.next().charAt(0);
		if (choice == 'Y' || choice == 'y'){
			clearConsole();
			rentTaxCalc();
		} else {
			clearConsole();
			main(null);
		}
				
		return payRentTax;
	}
	
	public static double bankInterestCalc(){
				Scanner input=new Scanner(System.in);
				System.out.println(" --------------------------------------------------------");
		        System.out.println("|               Bank Interest Tax                        |");
		        System.out.println(" --------------------------------------------------------");
		        System.out.println(" ");
		   
				System.out.print("Enter your bank interest per year : ");
				int inputBankInterest  = input.nextInt();
				
				double bankInterestTax = inputBankInterest * 5/100;
				
				
				System.out.println("You  have to pay bank interest tax per year " + String.format("%.2f", bankInterestTax));
				
				System.out.println(" Do you want to enter the correct value again (Y/N) : ");
				char choice1 = input.next().charAt(0);
				if (choice1 == 'Y' || choice1 == 'y'){
					clearConsole();
					bankInterestCalc();
				} else {
					clearConsole();
					main(null);
				}
		return bankInterestTax;
	}
	
	public static double dividendTaxCalc(){
		   Scanner input=new Scanner(System.in);
		   System.out.println(" --------------------------------------------------------");
		   System.out.println("|                  Dividend Tax                          |");
		   System.out.println(" --------------------------------------------------------");
		   System.out.println(" ");
		
		   System.out.print("Enter your Total Dividend Per Year : ");
	     	int inputDividendValue  = input.nextInt();
				
			double dividendTax = 0 ;
				
			if (inputDividendValue>0){
				if(inputDividendValue>100000){
					dividendTax = (inputDividendValue-100000) * 0.14;
					System.out.println("You have to pay Dividend Tax Per Year : " + String.format("%.2f", dividendTax));
				}else{
					System.out.println("You don't have to pay Dividend Tax Year");
				}
			}else{
				System.out.println("Invalid Input...");
			}
			System.out.println(" Do you want to enter the correct value again (Y/N) : ");
				char choice1 = input.next().charAt(0);
				if (choice1 == 'Y' || choice1 == 'y'){
					clearConsole();
					bankInterestCalc();
				} else {
					clearConsole();
					main(null);
			}
			return dividendTax;
	}
	
	
	public static double payableTaxCalc(){
		Scanner input=new Scanner(System.in);
		System.out.println(" --------------------------------------------------------");
		System.out.println("|                  Payable Tax                           |");
		System.out.println(" --------------------------------------------------------");
		System.out.println(" ");
		System.out.print("Enter your employee payment per month : ");
		int salary = input.nextInt();
		double tax;
			if (salary<=100000){
				tax = 0;
			}else if (salary<=141667){
				tax = (salary - 100000)*0.06;
			}else if (salary<=183333){
				tax = (salary - 141667)*0.12;
				tax+=41667*0.06;
			}else if (salary<=225000){
				tax = (salary - 183333)*0.18;
				tax+=41667*0.06*3;
			}else if (salary<=266667){
				tax = (salary - 225000)*0.24;
				tax+=41667*0.06*6;
			}else if (salary<=308333){
				tax = (salary - 266667)*0.3;
				tax+=41667*0.06*10;
			}else {
				tax = (salary - 308333)*0.36;
				tax+=41667*0.06*15;
			}
			
		System.out.println("You have to pay payable tax per month : " + tax);
		System.out.println(" Do you want to enter the correct value again (Y/N) : ");
				char choice1 = input.next().charAt(0);
				if (choice1 == 'Y' || choice1 == 'y'){
					clearConsole();
					bankInterestCalc();
				} else {
					clearConsole();
					main(null);
			}
		return 	tax;
	}
	
	
	public static double incomeTaxCalc(){
			Scanner input=new Scanner(System.in);
			System.out.println(" --------------------------------------------------------");
			System.out.println("|                     Income Tax                         |");
			System.out.println(" --------------------------------------------------------");
			System.out.println(" ");
			System.out.print("Enter your total income per year : ");
			int incomePerYear = input.nextInt();
			double tax;
			if (incomePerYear<=1200000){
				tax = 0;
			}else if (incomePerYear<=1700000){
				tax = (incomePerYear - 1200000)*0.06;
			}else if (incomePerYear<=2200000){
				tax = (incomePerYear - 1700000)*0.12;
				tax+=500000*0.06;
			}else if (incomePerYear<=2700000){
				tax = (incomePerYear - 2200000)*0.18;
				tax+=500000*0.06*3;
			}else if (incomePerYear<=3200000){
				tax = (incomePerYear - 2700000)*0.24;
				tax+=500000*0.06*6;
			}else if (incomePerYear<=3700000){
				tax = (incomePerYear - 3200000)*0.3;
				tax+=500000*0.06*10;
			}else {
				tax = (incomePerYear - 3700000)*0.36;
				tax+=500000*0.06*15;
			}
			
			System.out.println("You have to pay Income Tax per year : " + tax);
			System.out.println(" Do you want to enter the correct value again (Y/N) : ");
				char choice1 = input.next().charAt(0);
				if (choice1 == 'Y' || choice1 == 'y'){
					clearConsole();
					bankInterestCalc();
				} else {
					clearConsole();
					main(null);
			}
	
			return tax;
	}
	
	
	public static double socialSeurityCalc(){
			Scanner input=new Scanner(System.in);
			System.out.println(" --------------------------------------------------------");
			System.out.println("|     Social Security Contribution Levy (SSCL) Tax       |");
			System.out.println(" --------------------------------------------------------");
			System.out.println(" ");
			System.out.print("Enter value of Good or Service : ");
			int inputvalue = input.nextInt();
			
			double saleTax = 0.025;
			
			double saleTaxFinal = inputvalue * saleTax;
			
			double valueAfterSaleTax = inputvalue + saleTaxFinal;
			
			
			double vat = 0.15;
			
			double valueAfterVat = valueAfterSaleTax * vat;
			
			double totalTaxValue = valueAfterVat + saleTaxFinal;
			
			System.out.println("You have to pay SSCL Tax : " + String.format("%.2f", totalTaxValue));
			System.out.println(" Do you want to enter the correct value again (Y/N) : ");
				char choice1 = input.next().charAt(0);
				if (choice1 == 'Y' || choice1 == 'y'){
					clearConsole();
					bankInterestCalc();
				} else {
					clearConsole();
					main(null);
			}
			
			return totalTaxValue;
			
	}
	
	
	
	public static double monthlyInstallmentCalc(){
			Scanner input=new Scanner(System.in);
			System.out.println(" --------------------------------------------------------");
			System.out.println("|             Calculate Monthly Installment              |");
			System.out.println(" --------------------------------------------------------");
			System.out.println(" ");
			System.out.print("Enter lease amount : ");
			int inputLeaseAmount = input.nextInt();
			
			System.out.print("Enter annual interest rate : ");
			int inputAnnualInterestRate = input.nextInt();
			
			System.out.print("Enter number of years : ");
			int inputYears = input.nextInt();
			
			double i = inputAnnualInterestRate/(100.0*12);
			int n = inputYears*12;
			double result = 0.0;
			
			if (inputYears<=5)
			{
				if(inputLeaseAmount>0){
					 result = inputLeaseAmount * i/(1 - (1 / Math.pow((1 + i), n)));
					 System.out.println("Your monthly installemnt : "+String.format("%.2f", result));
					 System.out.println(" Do you want to enter the correct value again (Y/N) : ");
					char choice1 = input.next().charAt(0);
					if (choice1 == 'Y' || choice1 == 'y'){
						clearConsole();
						monthlyInstallmentCalc();
					} else {
						clearConsole();
						main(null);
					}
				
				}else{
					System.out.print("Please enter valid Lease Amount");
				}
			}else{
				System.out.print("Maximum number of year is 5");
			}
			return result;	
	}
	
	
	public static double searchLeasingCategory(){
		Scanner input=new Scanner(System.in);
		System.out.println(" --------------------------------------------------------");
		System.out.println("|               Search Leasing Category                  |");
		System.out.println(" --------------------------------------------------------");
		System.out.println(" ");
		System.out.print("Enter lease amount : ");
		int inputLeaseAmount = input.nextInt();
		
		System.out.print("Enter annual interest rate : ");
		int inputAnnualInterestRate = input.nextInt();
		double result = 0.0;
		int n = 36;
		double i = inputAnnualInterestRate/(100.0*12);
		
		for (int j = 3; j < 6; j++)
		{
			 result = inputLeaseAmount * i/(1 - (1 / Math.pow((1 + i), n)));
			 System.out.println("Your monthly installemnt for  "+ j + " year leasing plan - " +String.format("%.2f", result));
			 n = n +12;
		}
		
		System.out.println(" Do you want to enter the correct value again (Y/N) : ");
		char choice1 = input.next().charAt(0);
		if (choice1 == 'Y' || choice1 == 'y'){
			clearConsole();
			bankInterestCalc();
		} else {
			clearConsole();
			main(null);
		}
		return result;	
	}
	
	public static double findLeasingAmount(){
		Scanner input=new Scanner(System.in);
		System.out.println(" --------------------------------------------------------");
		System.out.println("|               Find the Leasing Amount                  |");
		System.out.println(" --------------------------------------------------------");
		System.out.println(" ");
		System.out.print("Enter the monthly lease payment amount you can afford : ");
		int inputMonthlyLeaseAmount = input.nextInt();
		
		System.out.print("Enter number of years : ");
		int inputYear = input.nextInt();
		
		
		System.out.print("Enter annual interest rate : ");
		int inputAnnualInterestRate = input.nextInt();
	
		double result = 0.0;
		int n = 36;
		double i = inputAnnualInterestRate/(100.0*12);
		
		double getLeaseAmount = (inputMonthlyLeaseAmount * (1 - (1 / Math.pow((1 + i), n))) ) / i  ;
		System.out.println("Your monthly installemnt for " +String.format("%.2f", getLeaseAmount));
		
		System.out.println(" Do you want to enter the correct value again (Y/N) : ");
		char choice1 = input.next().charAt(0);
		if (choice1 == 'Y' || choice1 == 'y'){
			clearConsole();
			bankInterestCalc();
		} else {
			clearConsole();
			main(null);
		}
		
		return getLeaseAmount;	
	}
	
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println(" --------------------------------------------------------");
		System.out.println("|                TAX Calculator                          |");
		System.out.println(" --------------------------------------------------------");
		System.out.println(" ");
		
		System.out.println("==========================================================");
		System.out.println(" ");
		
		System.out.println("[1] Withholding Tax");
		System.out.println("[2] Payble Tax");
		System.out.println("[3] Income Tax");
		System.out.println("[4] Social Security Contribution Levy (SSCL) Tax");
		System.out.println("[5] Leasing Payment");
		System.out.println("[6] Exit");
		
		
		System.out.print("Enter option to continue : ");
        int option_1  = input.nextInt();
        
        clearConsole();
        
        switch(option_1) {
		  case 1:
			System.out.println(" --------------------------------------------------------");
			System.out.println("|                Withholding Tax                         |");
			System.out.println(" --------------------------------------------------------");
			System.out.println(" ");
					
			System.out.println("[1] Rent Tax");
			System.out.println("[2] Bank Interest Tax");
			System.out.println("[3] Divinded Tax");
			System.out.println("[4] Exit");
			
			
			System.out.print("Enter option to continue : ");
			int option_1_1  = input.nextInt();
			
			clearConsole();
			
			switch(option_1_1) {
			  case 1:
				rentTaxCalc();

			break;
				
			case 2:
				bankInterestCalc();
			break;
			
			case 3:
				dividendTaxCalc();
				
				
			break;
			case 4:
				clearConsole();
				main(null);
						
			default:
				System.out.print("Please enter valid option");
				
				main(null);
			}
        
			break;
			case 2:
				payableTaxCalc();
			break;
			
			case 3:
				incomeTaxCalc();
			break;
			
			
			case 4:
				socialSeurityCalc();
			break;
			
			case 5:
				System.out.println(" --------------------------------------------------------");
				System.out.println("|                 Leasing Payment                        |");
				System.out.println(" --------------------------------------------------------");
				System.out.println(" ");
						
				System.out.println("[1] Calculate Monthly Installment");
				System.out.println("[2] Search Leasing Category");
				System.out.println("[3] Find the Leasing Amount");
				System.out.println("[4] Exit");
				
				
				System.out.print("Enter option to continue : ");
				int option_5_1  = input.nextInt();
				
				clearConsole();
				
				switch (option_5_1){
					case 1:
						monthlyInstallmentCalc();
						break;
						
					case 2:
						searchLeasingCategory();
						break;
						
					case 3:
						findLeasingAmount();
						
					case 4:
						break;
						
					default:
						System.out.println("Invalid Option");
				}
				
			break;
			
			case 6:
				break;
			
			default:
				System.out.println("Invalid Option");
		}
	}
}
