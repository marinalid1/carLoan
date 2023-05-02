// Program calculates monthly payment on car loan, tutorial by codeCademy.

public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int intresetRate = 5;
    int downPayment = 2000;
	
    if (loanLength <= 0 || intresetRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * intresetRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
	}
}