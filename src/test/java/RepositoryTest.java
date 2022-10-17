import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    @Test
    public void removeID() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry 1", 500, "Tolkien");
        Book book2 = new Book(2, "Harry 2", 300, "Tolkien");
        Smartphone phone1 = new Smartphone(3, "Galaxy", 20000, "Samsung");

        repo.add(book1);
        repo.add(book2);
        repo.add(phone1);

        repo.remove(2);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, phone1};

        Assertions.assertArrayEquals(expected, actual);
    }
}