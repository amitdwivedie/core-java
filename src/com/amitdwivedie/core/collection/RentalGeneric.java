package com.amitdwivedie.core.collection;

import java.util.List;

/**
 * @author Amit Dwivedi
 *
 * @param <T>
 */
public class RentalGeneric<T> {

    private List<T> rentalPool;
    private int maxNum;

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public RentalGeneric() {

    }

    public RentalGeneric(List<T> rentalPool, int maxNum) {
        this.rentalPool = rentalPool;
        this.maxNum = maxNum;
    }

    public T getRental() {
        return rentalPool.get(0);
    }

    public void returnRental(T returnThing) {
        rentalPool.add(returnThing);
    }

}
