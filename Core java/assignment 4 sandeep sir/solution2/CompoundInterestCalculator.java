package in.solution2;

public class CompoundInterestCalculator {
	float initalInvestment;
	float annualInterestRate;
	float comnpoundInterestRate;
	float duration;
	float futureValue;
	float totalIntrest;

	public CompoundInterestCalculator(float initalInvestment, float annualInterestRate, float comnpoundInterestRate,
			float duration) {
		this.initalInvestment = initalInvestment;
		this.annualInterestRate = annualInterestRate;
		this.comnpoundInterestRate = comnpoundInterestRate;
		this.duration = duration;

	}

	public float getInitalInvestment() {
		return initalInvestment;
	}

	public void setInitalInvestment(float initalInvestment) {
		this.initalInvestment = initalInvestment;
	}

	public float getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public float getComnpoundInterestRate() {
		return comnpoundInterestRate;
	}

	public void setComnpoundInterestRate(float comnpoundInterestRate) {
		this.comnpoundInterestRate = comnpoundInterestRate;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public float futureValue() {

		float rate = annualInterestRate / 100;
		return initalInvestment
				* (float) Math.pow((1 + rate / comnpoundInterestRate), comnpoundInterestRate * duration);
	}

	public float totalIntrest() {
		return futureValue() - initalInvestment;
	}

	public String toString() {
		return "your initial investment : " + initalInvestment +
				"\n your annualInterestRate :  " + annualInterestRate
				+ "\n duration  : " + duration + 
				"\nfutureValue :" + futureValue() +
				"\n totalIntrest : " + totalIntrest();

	}

}
