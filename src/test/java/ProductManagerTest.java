import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    public void FewProductFound() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry 1", 500, "Tolkien");
        Book book2 = new Book(2, "Harry 2", 300, "Tolkien");
        Smartphone phone1 = new Smartphone(3, "Galaxy", 20000, "Samsung");

        manager.add(book1);
        manager.add(book2);
        manager.add(phone1);

        Product[] actual = manager.searchBy("Galaxy");
        Product[] expected = {phone1};

        Assertions.assertArrayEquals(expected, actual);
    }

}