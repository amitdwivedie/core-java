package com.amitdwivedie.core.flow.control;

/**
 * @author Amit Dwivedi
 *
 */
public class Loop {

    public static void main(String[] args) {
        int i = 10;
        while(i < 20){
            /*if(i == 14){// it will go to infinite loop
                System.out.println("continue at " + i);
                continue;
            }*/
            if(i == 15){
                System.out.println("break at " + i);
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
