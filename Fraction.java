
public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int denom)
	{
		numerator = num;
		denominator = denom;
	}
	
	public Fraction add(Fraction otherFraction)
	{
		int resultDenominator = 0;
		int resultNumerator = 0;
		
		if(this.denominator == otherFraction.denominator)
		{
			resultDenominator = this.denominator;
			resultNumerator = this.numerator;
		}
		return new Fraction(resultNumerator, resultDenominator);
	}
	public String toString()
	{
		return "" + numerator + "/" + denominator;
	}
}
