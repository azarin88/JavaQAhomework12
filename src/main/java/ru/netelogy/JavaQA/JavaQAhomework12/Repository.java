package ru.netelogy.JavaQA.JavaQAhomework12;



public class Repository {
    private Item[] items = new Item[0];

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
        Item[] lastItems = new Item[5];
        for (int i = 0; i < lastItems.length; i++) {
            lastItems[i] = items[items.length - i - 1];
        }
        return lastItems;
    }

    public Item[] findLast(int lastItem) {
        if (lastItem >= 0 && lastItem < items.length) {
            Item[] lastItems = new Item[lastItem];
            for (int i = 0; i < lastItems.length; i++) {
                lastItems[i] = items[items.length - i - 1];
            }
            return lastItems;
        } else {
            Item[] lastItems = new Item[items.length];
            for (int i = 0; i < items.length; i++) {
                lastItems[i] = items[items.length - i - 1];
            }
            return lastItems;
        }
    }
}
