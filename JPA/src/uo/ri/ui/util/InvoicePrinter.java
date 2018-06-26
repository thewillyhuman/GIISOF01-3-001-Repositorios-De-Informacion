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
import uo.ri.business.dto.InvoiceDto;

/**
 * The Class InvoicePrinter.
 *
 * @author Guillermo Facundo Colunga
 * @version 201806081225
 */
public class InvoicePrinter implements Printer {

    /** The invoice. */
    private InvoiceDto invoice;

    /**
     * Instantiates a new invoice printer.
     *
     * @param invoice
     *            the invoice
     */
    public InvoicePrinter(InvoiceDto invoice) {
	this.invoice = invoice;
    }

    /*
     * (non-Javadoc)
     * 
     * @see uo.ri.ui.util.Printer#print()
     */
    @Override
    public void print() {
	double importeConIVa = invoice.total;
	double iva = invoice.taxes;
	double importeSinIva = importeConIVa / (1 + iva / 100);

	Console.printf("Factura nº: %d\n", invoice.number);
	Console.printf("\tFecha: %1$td/%1$tm/%1$tY\n", invoice.date);
	Console.printf("\tTotal: %.2f €\n", importeSinIva);
	Console.printf("\tIva: %.1f %% \n", invoice.taxes);
	Console.printf("\tTotal con IVA: %.2f €\n", invoice.total);
	Console.printf("\tEstado: %s\n", invoice.status);
    }

}
