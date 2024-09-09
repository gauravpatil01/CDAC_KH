package in.solution4;

public class DiscountCalculator {
	private float originalPrice;
	private float discountPercentage;

	public DiscountCalculator(float originalPrice, float discountPercentage) {
		this.originalPrice = originalPrice;
		this.discountPercentage = discountPercentage;
	}

	public float getOriginalPrice() {
		return originalPrice;
	}

	public void setoriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage() {
		this.discountPercentage = discountPercentage;
	}
	public float discountedAmounted() {
		float discountedAmount=originalPrice * (discountPercentage / 100);
		return discountedAmount;
	}
	
	public float finalPrice() {
		float finalPrice = originalPrice - discountedAmounted();
		return finalPrice;
	}
	public String toString() {
		return "original price : " + originalPrice+
				"\ndiscountPercentage : "+discountPercentage +
				"\ndiscountedAmounted : " + discountedAmounted() +
				"\nfinalPrice : "+ finalPrice();
				
				
	
	
	}
}
