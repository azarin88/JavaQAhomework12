package ru.netelogy.JavaQA.JavaQAhomework12.repository;


public class Repository {
    private Item[] items = new Item[0];
    private int lastItem = 5;

    public Repository() {
    }

    public Repository(int lastItem) {

        this.lastItem = lastItem;
    }

    public void add(Item item) {
        Item[] newItems = new Item[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        newItems[items.length] = item;
        items = newItems;
    }

    public Item[] findAll() {
        return items;
    }

    public Item[] findLast() {
        int lastItem;
        if (this.lastItem <= items.length && this.lastItem >= 0) {
            lastItem = this.lastItem;
        } else {
            lastItem = items.length;
        }
        Item[] lastItems = new Item[lastItem];
        for (int i = 0; i < lastItems.length; i++) {
            lastItems[i] = items[items.length - i - 1];
        }
        return lastItems;
    }
}