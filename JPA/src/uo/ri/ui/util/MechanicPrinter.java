/* 
 * MIT License
 * 
 * Copyright (c) 2018 Guillermo Facundo Colunga
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package uo.ri.ui.util;

import alb.util.console.Console;
import uo.ri.business.dto.MechanicDto;

/**
 * MechanicPrinter.java
 *
 * @author Guillermo Facundo Colunga
 * @version 201806032143
 * @since 201806032143
 * @formatter Oviedo Computing Community
 */
public class MechanicPrinter implements Printer {
	
	/** The mechanic. */
	private MechanicDto mechanic;
	
	/**
	 * Instantiates a new mechanic printer.
	 *
	 * @param mechanic the mechanic
	 */
	public MechanicPrinter(MechanicDto mechanic) {
		this.mechanic = mechanic;
	}

	/* (non-Javadoc)
	 * @see uo.ri.ui.util.Printer#print()
	 */
	@Override
	public void print() {
		Console.printf( "\t%d %-10.10s %-25.25s %-25.25s\n", mechanic.id, mechanic.dni,
				mechanic.name, mechanic.surname );
	}

}
