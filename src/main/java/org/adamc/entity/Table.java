package org.adamc.entity;

import org.adamc.interfaces.Element;

public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void add(Element element) {
        // add smth
    }

    @Override
    public void remove(Element element) {
        // remove smth
    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Table: " + this.title);
    }
}
