package ru.netelogy.JavaQA.JavaQAhomework12.repository;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    Item item1 = new Item(1, "Бладшот");
    Item item2 = new Item(2, "Вперёд");
    Item item3 = new Item(3, "Отель \"Белград\"");
    Item item4 = new Item(4, "Джентльмены");
    Item item5 = new Item(5, "Человек-невидимка");
    Item item6 = new Item(6, "Тролли. Мировой тур");
    Item item7 = new Item(7, "Номер один");

    @Test
    public void testAddNull() {
        Repository repository = new Repository();


        Item[] expected = new Item[]{};
        Item[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddOneItem() {
        Repository repository = new Repository();

        repository.add(item1);
        Item[] expected = new Item[]{item1};
        Item[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddTwoItem() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        Item[] expected = new Item[]{item1, item2};
        Item[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddSixItem() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        Item[] expected = new Item[]{item1, item2, item3, item4, item5, item6};
        Item[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void testAddSevenItem() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        repository.add(item7);
        Item[] expected = new Item[]{item1, item2, item3, item4, item5, item6, item7};
        Item[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        repository.add(item7);
        Item[] expected = new Item[]{item7, item6, item5, item4, item3};
        Item[] actual = repository.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithNull() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        repository.add(item7);
        Item[] expected = new Item[]{};
        Item[] actual = repository.findLast(0);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithOneItem() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        repository.add(item7);
        Item[] expected = new Item[]{item7};
        Item[] actual = repository.findLast(1);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithTwoItem() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        repository.add(item7);
        Item[] expected = new Item[]{item7, item6};
        Item[] actual = repository.findLast(2);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithSixItem() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        repository.add(item7);
        Item[] expected = new Item[]{item7, item6, item5, item4, item3, item2};
        Item[] actual = repository.findLast(6);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithSevenItem() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        repository.add(item7);
        Item[] expected = new Item[]{item7, item6, item5, item4, item3, item2, item1};
        Item[] actual = repository.findLast(7);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithEightItem() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        repository.add(item7);
        Item[] expected = new Item[]{item7, item6, item5, item4, item3, item2, item1};
        Item[] actual = repository.findLast(8);
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastWithMinusOneItem() {
        Repository repository = new Repository();
        repository.add(item1);
        repository.add(item2);
        repository.add(item3);
        repository.add(item4);
        repository.add(item5);
        repository.add(item6);
        repository.add(item7);
        Item[] expected = new Item[]{item7, item6, item5, item4, item3, item2, item1};
        Item[] actual = repository.findLast(-1);
        Assertions.assertArrayEquals(expected, actual);
    }
}
