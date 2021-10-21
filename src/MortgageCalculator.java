import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        System.out.println("Principal:");
        Scanner scanner = new Scanner(System.in);
        String principal = scanner.nextLine();
        System.out.println("Annual Interest Rate:");
        String annualInterestRate = scanner.nextLine();
        System.out.println("Period (Years)");
        String periodInYears = scanner.nextLine();
        final double monthlyInterestRate = Double.parseDouble(annualInterestRate)/1200;
        final double principalNumber = Double.parseDouble(principal);
        final double periodInYearsNumber = Double.parseDouble(periodInYears)*12;
        double mortgage =  principalNumber * (monthlyInterestRate*Math.pow((1+monthlyInterestRate),periodInYearsNumber) / (Math.pow((1+monthlyInterestRate),periodInYearsNumber)-1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage:" + currency.format(mortgage));
    }
}
