
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
		this.simplify();
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
		if (demoninator == 1)
			return "" + numerator;
		return numerator + "/" + demoninator;
	}

	public Rational reciprocal()
	{
		return new Rational(this.demoninator, this.numerator);
	}

	public boolean isNegetive()
	{
		return (numerator < 0);
	}

	public boolean isZero()
	{
		return (numerator == 0);
	}

	public int gcd(Rational other)
	{
		int gcd = 1;
		for (int i = 1; i <= this.numerator && i <= other.numerator; i++)
		{
			if (this.numerator % i == 0 && other.numerator % i == 0)
				gcd = i;
		}
		return gcd;
	}

	private Rational simplify()
	{
		for (int i = 2; i <= this.numerator; i++)
		{
			if (this.numerator % i == 0 && this.demoninator % i == 0)
			{
				this.numerator = this.numerator / i;
				this.demoninator = this.demoninator / i;
				i = 1;
			}
		}
		return this;
	}

	public Rational add(Rational other)
	{
		int newNumerator = this.numerator * other.demoninator + other.numerator * this.demoninator;
		int newDemoninator = this.demoninator * other.demoninator;
		return new Rational(newNumerator, newDemoninator);
	}

	public Rational subtract(Rational other)
	{
		int newNumerator = this.numerator * other.demoninator - other.numerator * this.demoninator;
		int newDemoninator = this.demoninator * other.demoninator;
		return new Rational(newNumerator, newDemoninator);
	}
}