package com.example.printers;

import com.example.Printer;

/**
 * Specialised Implementation of {@link Printer} for a Epson Printer, in
 * this case the message to be printed is appended to "Epson Printer : "
 *
 * @see Printer
 */
public class EpsonPrinter implements Printer {

  /**
   * {@inheritDoc}
   */
  @Override
  public void print(String message) {
    System.out.print("Epson Printer : " + message);
  }

}