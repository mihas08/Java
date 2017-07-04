package com.oop;

import java.util.ArrayList;
import java.util.List;

public final class Book {

    private List<BookPage> pages;

    public Book() {
        this.pages = new ArrayList<BookPage>();
        pages.add(new BookPage("Заглавна страница", 1));
    }

    public Book(int pagesCount) {
        this();
        for (int i = 1; i < pagesCount; i++) {
            int page = i + 1;
            String data = "Това е старница " + String.valueOf(page);
            pages.add(new BookPage(data, page));
        }
    }

    public List<BookPage> getPages() {
        return this.pages;
    }

    public void addPage(BookPage page) {
        if (!pages.contains(page)) {
            pages.add(page);
        } else {
            changePage(page);
        }
    }

    public void changePage(BookPage page) {
        if (pages.contains(page)) {
            int index = pages.indexOf(page);
            pages.get(index).swapPage(page);
        }
    }

    public void removePage(int pageNumber) {

        int index = -1;
        for (BookPage bookPage : pages) {
            if (bookPage.getPageNumber() == pageNumber) {
                index = pages.indexOf(bookPage);
                break;
            }
        }
        if (index != -1) {
            pages.remove(index);
        }
    }

    public void swapTwoPages(BookPage first, BookPage second) {
        if (pages.contains(first) && pages.contains(second)) {
            first.swapPage(second);
        }
    }

    public void printBook() {
        for (BookPage bookPage : pages) {
            System.out.println(bookPage.toString());
        }
    }
}