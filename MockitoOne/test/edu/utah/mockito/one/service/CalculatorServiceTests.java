package edu.utah.mockito.one.service;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import edu.utah.mockito.one.Iface;
import static org.mockito.Mockito.*;

public class CalculatorServiceTests {
	public SomeService SomeService;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Iface iface = mock(SomeInterface.class);
		when(iface.add(1, 2)).thenReturn(3);
		SomeService = new SomeService();
		SomeService.setIface(iface);
	}
	@Test
	public void testGetInstance()
	{
		Assert.assertNotNull(SomeService.getIcalc()) ;
	}

	@Test
	public void testSomeMethod()
	{
		int x = 1;
		int y = 2;
		Assert.assertEquals(SomeService.someMethod(x, y), 3);
	}

}
