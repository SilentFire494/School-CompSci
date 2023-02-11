
public class Rational 
{
	private int numerator;
	private int demoninator;
	
	public Rational(int numerator, int demoninator)
	{
		if (numerator < 0 && demoninator < 0)
		{
			numerator = numerator * -1;
			demoninator = demoninator * -1;
		}
		this.numerator = numerator;
		this.demoninator = demoninator;
	}

	public Rational()
	{
		this(0, 1);
	}

	public Rational(int numerator)
	{
		this(numerator, 1);
	}

	public int getNumerator()
	{
		return numerator;
	}

	public int getDemoninator()
	{
		return demoninator;
	}

	public Rational multiply(Rational other)
	{
		return new Rational(this.numerator * other.numerator, this.demoninator * other.demoninator);
	}

	public Rational divide(Rational other)
	{
		return new Rational(this.numerator * other.demoninator, this.demoninator * other.numerator);
	}

	public boolean equals(Rational other)
	{
		if (this.numerator < 0 && other.numerator >= 0)
			return false;
		if (this.numerator >= 0 && other.numerator < 0)
			return false;
		return (this.numerator == other.numerator && this.demoninator == other.demoninator);
	}

	@Override public String toString()
	{
		if (numerator == 0)
			return "0";

		if (numerator == demoninator)
			return "1";

		return numerator + "/" + demoninator;
	}

	public Rational reciprocal()
	{
		return new Rational(demoninator, numerator);
	}

	public boolean isNegetive()
	{
		return (numerator < 0);
	}

	public boolean isZero()
	{
		return (numerator == 0);
	}
}
