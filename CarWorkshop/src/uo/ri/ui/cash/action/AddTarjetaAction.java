/*******************************************************************************
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
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/
package uo.ri.ui.cash.action;

import alb.util.console.Console;
import alb.util.menu.Action;
import uo.ri.business.CashService;
import uo.ri.common.BusinessException;
import uo.ri.conf.ServicesFactory;

/**
 * This class is the one that is called in the menu when an option that does not
 * lead you to another menu takes you. Just for the menu of the cash register.
 * In this case, the action of the class is to add a new credit card to a client
 * defined by its id. The information it gets is also de type of card, the
 * number and the validity date, which has to be in the format specified.
 * 
 * @author uo250878
 *
 */
public class AddTarjetaAction implements Action {

	@Override
	public void execute() throws BusinessException {

		// Pedir datos
		Long id = Console.readLong( "Id cliente" );
		String tipo = Console.readString( "Tipo" );
		String numero = Console.readString( "Número" );
		String fecha = Console.readString( "Fecha validez (yyyy-mm-dd)" );

		CashService cash = ServicesFactory.getCashService();
		cash.createPMCard( id, tipo, numero, fecha );

		// Mostrar resultado
		Console.println( "Nuevo tarjeta añadida a " + id );
	}

}