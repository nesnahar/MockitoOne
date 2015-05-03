package edu.utah.mockito.one.service;

import edu.utah.mockito.one.ICalculator;

/**
 * @author rahansen
 *
 */
public class CalculatorService {
	/**
	 * 
	 */
	public ICalculator icalc;
	
	/**
	 * @return
	 */
	public final ICalculator getIcalc() 
	{
		return icalc;
	}

	/**
	 * @param icalc
	 */
	public final void setIcalc(final ICalculator icalc) 
	{
		this.icalc = icalc;
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	public final int addInts(final int x, final int y)
	{
		return icalc.add(x, y);
	}

}
