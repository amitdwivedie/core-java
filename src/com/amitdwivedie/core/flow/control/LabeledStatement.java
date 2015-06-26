package com.amitdwivedie.core.flow.control;

/**
 * @author Amit Dwivedi
 *
 */
public class LabeledStatement {

    public static void main(String[] args) {
        outer:
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("i-" + i +" j-" + j);
                    continue outer;
                }
                System.out.println("i-" + i );
            }
    }
}
