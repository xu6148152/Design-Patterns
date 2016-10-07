package com.example.printers;

import com.example.Printer;

/**
 * Specialised Implementation of {@link Printer} for a HP Printer, in
 * this case the message to be printed is appended to "HP Printer : "
 *
 * @see Printer
 */
public class HpPrinter implements Printer {

    /**
     * {@inheritDoc}
     */
    @Override public void print(String message) {
        System.out.print("HP Printer : " + message);
    }
}