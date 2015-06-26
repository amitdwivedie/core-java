package com.amitdwivedie.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class ComparableExample {

    public static void main(String[] args) {
        BookInfo bookInfo1 = new BookInfo("Java", "kathy");
        BookInfo bookInfo2 = new BookInfo("HTML", "ABC");
        BookInfo bookInfo3 = new BookInfo("Jquery", "DEF");
        BookInfo bookInfo4 = new BookInfo("Sql", "GHI");
        BookInfo bookInfo5 = new BookInfo("XSD", "JKL");
        
        List<BookInfo> bookInfos = new ArrayList<BookInfo>();
        bookInfos.add(bookInfo1);
        bookInfos.add(bookInfo2);
        bookInfos.add(bookInfo3);
        bookInfos.add(bookInfo4);
        bookInfos.add(bookInfo5);
        
        System.out.println("Books Info - " + bookInfos);
        
        Collections.sort(bookInfos);
        System.out.println("Sorted Books Info - " + bookInfos);
    }
}

class BookInfo implements Comparable<BookInfo> {

    private String name;
    private String author;

    public BookInfo(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public BookInfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(BookInfo bookInfo) {
        return this.name.compareTo(bookInfo.getName());
    }

    @Override
    public String toString() {
        return "BookInfo [name=" + name + ", author=" + author + "]";
    }

}
