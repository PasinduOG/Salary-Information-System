import java.util.Scanner;

class SalaryInformation {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|                       SALARY INFORMATION SYSTEM                       |");
		System.out.println("-------------------------------------------------------------------------\n");
		
		// Available Options
		System.out.println("\t[1] Calculate Income Tax");
		System.out.println("\t[2] Calculate Annual Bonus");
		System.out.println("\t[3] Calculate Loan Amount\n");
		
		// Option selector
		System.out.print("Enter an option to continue > ");
		int option=scanner.nextInt();
		
		// Employee name and salary variables
		double employeeSalary;
		
		// Use switch to select an option by number
		switch(option) {
			// Option 01
			case 1 :
			System.out.println("\n\n\n-------------------------------------------------------------------------");
			System.out.println("|                         Calculate Income Tax                          |");
			System.out.println("-------------------------------------------------------------------------\n");
			
			System.out.print("Enter Employee name   - ");
			scanner.next();
			
			System.out.print("Enter Employee salary - ");
			employeeSalary = scanner.nextDouble();
			double tax = 0.0;
			
			// Income tax logic
			if(employeeSalary<=100000){
				tax = 0;
				System.out.println("\nYou have to pay Income Tax per month: "+(int)tax);
			} else if (employeeSalary>100000 && employeeSalary<=141667){
				tax=(41667*0.06)-(141667-employeeSalary)*0.06;
				System.out.println("\nYou have to pay Income Tax per month: "+(int)tax);
			} else if (employeeSalary>=141667 && employeeSalary<=183333){
				tax=(41667*0.18)-(183333-employeeSalary)*0.12;
				System.out.println("\nYou have to pay Income Tax per month: "+(int)tax);
			} else if (employeeSalary>=183333 && employeeSalary<=225000){
				tax=(41667*0.36)-(225000-employeeSalary)*0.18;
				System.out.println("\nYou have to pay Income Tax per month: "+(int)tax);
			} else if (employeeSalary>=225000 && employeeSalary<=266667){
				tax=(41667*0.6)-(266667-employeeSalary)*0.24;
				System.out.println("\nYou have to pay Income Tax per month: "+(int)tax);
			} else if (employeeSalary>=266667 && employeeSalary<=308333){
				tax=(41667*0.9)-(308333-employeeSalary)*0.30;
				System.out.println("\nYou have to pay Income Tax per month: "+(int)tax);
			} else {
				tax=41667*0.9-(308333-employeeSalary)*0.36;
				System.out.println("\nYou have to pay Income Tax per month: "+(int)tax);
			}
			break;
			
			// Option 2
			case 2 :
			System.out.println("\n\n\n-------------------------------------------------------------------------");
			System.out.println("|                        Calculate Annual Bonus                         |");
			System.out.println("-------------------------------------------------------------------------\n");
			
			System.out.print("Enter Employee name   - ");
			scanner.next();
			
			System.out.print("Enter Employee salary - ");
			employeeSalary=scanner.nextInt();
			double bonus=0.0;
			
			// Annual Bonus calculation logic
			if (employeeSalary<100000) {
				bonus=5000;
				System.out.println("\nAnnual Bonus\t- "+bonus);
			} else if (employeeSalary>=100000 && employeeSalary<200000) {
				bonus=employeeSalary*0.1;
				System.out.println("\nAnnual Bonus\t- "+bonus);
			} else if (employeeSalary>=200000 && employeeSalary<300000) {
				bonus=employeeSalary*0.15;
				System.out.println("\nAnnual Bonus\t- "+bonus);
			} else if (employeeSalary>=300000 && employeeSalary<400000) {
				bonus=employeeSalary*0.2;
				System.out.println("\nAnnual Bonus\t- "+bonus);
			} else {
				bonus=employeeSalary*0.35;
				System.out.println("\nAnnual Bonus\t- "+bonus);
			}
			break;
			
			// Option 3
			case 3 :
			System.out.println("\n\n\n-------------------------------------------------------------------------");
			System.out.println("|                         Calculate Loan Amount                         |");
			System.out.println("-------------------------------------------------------------------------\n");
			
			System.out.print("Enter Employee name   - ");
			scanner.next();
			
			System.out.print("Enter Employee salary - ");
			employeeSalary=scanner.nextInt();
			
			System.out.print("Enter number of year  - ");
			int years=scanner.nextInt();
			
			if (employeeSalary>=50000 && years<=5) {
				int n=years*12;
				double r=0.15;
				double monthlyInstallment=employeeSalary*0.6;
				
				double loanAmount=monthlyInstallment*(1-(1/Math.pow(1+(r/12),n)))/(r/12);
				System.out.println("\nYou can get Loan Amount: "+Math.round(loanAmount/1000)*1000);
			} else {
				System.out.println("\tYou can not get a loan because your salary lessthan Rs.50 000...");
			}
			break;
			
			// If wrong option selected
			default :
			System.out.println("\nWrong choice, please try again later");
		}
	}
}
