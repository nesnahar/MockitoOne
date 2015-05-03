package edu.utah.mockito.one.service;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import edu.utah.mockito.one.ICalculator;
import static org.mockito.Mockito.*;

public class CalculatorServiceTests {
	public CalculatorService calculatorService;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ICalculator icalc = mock(ICalculator.class);
		when(icalc.add(1, 2)).thenReturn(3);
		calculatorService = new CalculatorService();
		calculatorService.setIcalc(icalc);
	}
	@Test
	public void testGetInstance()
	{
		Assert.assertNotNull(calculatorService.getIcalc()) ;
	}

	@Test
	public void testAddInts()
	{
		int x = 1;
		int y = 2;
		Assert.assertEquals(calculatorService.addInts(x, y), 3);
	}

}
