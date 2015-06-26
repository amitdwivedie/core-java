package com.amitdwivedie.core.formatting;

/**
 * Construction of formatting string
 * 
 *  %[arg_index$][flags][width][.precision]conversion char
 *  arg_index => argument followed by $
 *  flags => "-" left justify this argument ,
 *           "+" include a sign(+ or _ ) with this argument,
 *           "0" Pad this argument with zeros,
 *           "," Use locale specific grouping separator,
 *           "(" Enclose negative number with parentheses
 *  width => value indicates the minimum number to print
 *  precision => in case of decimal precision indicates the number of digits to print
 *  conversion => The type of argument which will be formatting
 *      b boolean
 *      c char
 *      d integer
 *      f floating point
 *      s string
 * 
 * @author Amit Dwivedi
 *
 */
public class FormattingExample {

    public static void main(String[] args) {
        System.out.printf("%2$d + %1$d", 123, 456);
    }
}
