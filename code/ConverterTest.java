/**
 * Test class for Converter
 * This is a JUnit testing class skeleton, not an actually used class.
 * @author ghs
*/

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest
{
	@Test
	/** Conversion from base 36 */
	public void base36f()
	{
		Converter myConv = new Converter(36);
		Assert.assertEquals(myConv.fromString("GUILLAUMEx"), 1305567814);
	}
	
	@Test
	/** Conversion to base 36 */
	public void base36t()
	{
		Converter myConv = new Converter(36);
		Assert.assertEquals(myConv.toString(36), "10");
	}
	
	@Test
	/** Empty string conversion */
	public void emptyString()
	{
		Converter myConv = new Converter(19);
		Assert.assertEquals(myConv.fromString(""), 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	/** Digits check */
	public void digitsCheck()
	{
		Converter myConv = new Converter(36);
		System.out.println(myConv.fromString("Guillaume"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	/** Base check (lower bound) */
	public void baseCheckL()
	{
		Converter myConv = new Converter(1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	/** Base check (upper bound) */
	public void baseCheckH()
	{
		Converter myConv = new Converter(37);
	}
}