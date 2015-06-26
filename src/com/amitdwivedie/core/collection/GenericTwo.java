package com.amitdwivedie.core.collection;

/**
 * @author Amit Dwivedi
 *
 * @param <T>
 * @param <X>
 */
public class GenericTwo<T, X> {

    T one;
    X two;

    public GenericTwo(T one, X two) {
        this.one = one;
        this.two = two;
    }

    public T getT() {
        return one;
    }

    public X getX() {
        return two;
    }
    
    public static void main(String[] args) {
        GenericTwo<Integer, String> genericTwo = new GenericTwo<Integer, String>(1, "one");
        System.out.println(genericTwo.getT());
        System.out.println(genericTwo.getX());
    }
}
