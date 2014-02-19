/**
 * A convenient class for converting natural numbers between different bases.
 * This is a JUnit tested class skeleton, not an actually used class.
 * @author jae, ghs
*/
public class Converter
{
	private String _charset;
	private int _base;
	
	/**
	 * Initializes the class using the default charset (uppercase).
	 * @param	base	Base (from 2 to 36).
	 * @throws	IllegalArgumentException	If base is out of the valid range.
	*/
	public Converter(int base)
	{
		if (base>1 && base<=36)
		{
			_charset = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0, base);
			_base = base;
		}
		else
			throw new IllegalArgumentException(); //Java 1.7!
	}
	
	/**
	 * Initializes the class using a custom charset.
	 * @param	charset	Character set (digits ordered by value).
	*/
	public Converter(String charset)
	{
		_charset = charset;
		_base = charset.length();
	}
	
	/**
	 * Converts a string to a natural number.
	 * @param	s	String representing a number.
	 * @return	The natural number represented by s.
	 * @throws	IllegalArgumentException	If an invalid digit is present.
	*/
	public int fromString(String s)
	{
		int count = 0;
		int len = s.length();
		for (int i=0; i<len; i++)
		{
			int weight = (int)Math.pow(_base, len-i-1);
			int value = _charset.indexOf(s.charAt(i));
			if (value == -1)
				//Non-existing digit!
				throw new IllegalArgumentException(); //Java 1.7!
			count += value * weight;
		}
		return count;
	}
	
	/**
	 * Converts a natural number to a string.
	 * @param	n	Natural number to convert.
	 * @return	A string representing n.
	*/
	public String toString(int n)
	{
		String res = "";
		while (n > 0)
		{
			res = _charset.charAt(n % _base) + res;
			n /= _base;
		}
		return res;
	}
}