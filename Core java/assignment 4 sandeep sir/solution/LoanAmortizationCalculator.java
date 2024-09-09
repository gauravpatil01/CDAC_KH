package in.solution;
public class LoanAmortizationCalculator {
    double principleAmount;
    double anualIntrestRate;
    double loanTerm;

    // constroctor for initilize feilds
    public LoanAmortizationCalculator(double principleAmount, double anualIntrestRate, double loanTerm) {
        this.principleAmount = principleAmount;
        this.anualIntrestRate = anualIntrestRate;
        this.loanTerm = loanTerm;
        // double monthlyPayement;
    }

    public double getPrincipleAmount() {
        return principleAmount;
    }

    public void setPrincipleAmount(double principleAmount) {
        this.principleAmount = principleAmount;
    }

    public double getAnualIntrestRate() {
        return anualIntrestRate;
    }

    public void setAnualIntrestRate(double anualIntrestRate) {
        this.anualIntrestRate = anualIntrestRate;
    }

    public double getLoanTerm() {
        return loanTerm;
    }

    public Double monthlyPayementCalculation() {
        double monthlyInterestRate = anualIntrestRate / 12 / 100;
        double numberOfMonths = loanTerm * 12;

        return principleAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    public double totalPayment() {
        return monthlyPayementCalculation() * (loanTerm * 12);
    }

    public String toString() {
        return "principle : $ " + principleAmount +
                "\nAnual Intrest Rate  " + anualIntrestRate +
                "\nLoan Term  " + loanTerm +
                "\nMonthly payment  " + monthlyPayementCalculation() +
                "\nTotal Payment  " + totalPayment();

    }

}
// monthlyPayment = principal * (monthlyInterestRate * (1 +
// monthlyInterestRate)^(numberOfMonths))
// / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
// Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths
// = loanTerm * 12
