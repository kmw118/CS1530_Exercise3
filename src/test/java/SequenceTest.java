import org.junit.Test;
import static org.junit.Assert.*;

import walker.Sequences;

public class SequenceTest
{
	@Test
	public void testTriangle0()
	{
		assertEquals(Sequences.tri(0), 0);
	}
	
	@Test
	public void testTriangle1()
	{
		assertEquals(Sequences.tri(1), 1);
		
	}
	
	@Test
	public void testTriangle2()
	{
		assertEquals(Sequences.tri(9), 45);
	}
	
	@Test
	public void testLazy0()
	{
		assertEquals(Sequences.lazy(0), 1);
	}
	
	@Test
	public void testLazy1()
	{
		assertEquals(Sequences.lazy(1), 2);
	}
	
	@Test
	public void testLazy2()
	{
		assertEquals(Sequences.lazy(15), 121);
	}
}