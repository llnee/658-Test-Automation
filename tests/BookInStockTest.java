import static org.junit.Assert.*;
import org.junit.*;

public class BookInStockTest {

    private BookInStock book;
    private String isbn1, isbn2;
    private double price1, price2;

    @Before
    public void setup() {
        isbn1 = "36-82-7794-192";
        isbn2 = "09-778-90-1929";
        price1 = 2.99;
        price2 = 3.50;
        book = new BookInStock(isbn1, price1);
    }

    @Test
    public void BookInStockEmptyISBN() {
        try {
            book = new BookInStock("", price1);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("expected IAE with empty isbn");
    }

    @Test
    public void BookInStockPriceNeg() {
        try {
            book = new BookInStock(isbn1, -9.00);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("expected IAE with negative price");
    }

    @Test
    public void BookInStockPriceZero() {
        try {
            book = new BookInStock(isbn1, 0.0);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("expected IAE with zero price");
    }

    @Test
    public void getIsbn() { assertEquals("expected isbn \"36-82-7794-192\"", "36-82-7794-192", book.getIsbn());}

    /*@Test
    public void getIsbnNPE() {}*/

    @Test
    public void getPrice() { assertEquals("expected price $2.99", 2.99, book.getPrice(), 0.00);}

    /*@Test
    public void getPriceNPE() {}*/

    @Test
    public void setIsbn() {
        book.setIsbn(isbn2);
        assertEquals("09-778-90-1929", book.isbn);
    }

    @Test
    public void setIsbnIAE() {
        try {
            book.setIsbn("");
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("expected IAE with empty isbn");

    }

    @Test
    public void setPrice() {
        book.setPrice(price2);
        assertEquals(3.50, book.price, 0.00);
    }

    @Test
    public void setPriceNeg() {
        try {
            book.setPrice(-9.00);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("expected IAE with negative price");
    }

    @Test
    public void setPriceZero() {
        try {
            book.setPrice(0.0);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("expected IAE with zero price");
    }

    @Test
    public void priceAsString() {
        assertEquals("expected $2.99 with 2.99 price", "$2.99", book.priceAsString());
    }

    @Test
    public void priceAsStringInt() {
        book = new BookInStock(isbn1, 1);
        assertEquals("expected $1.00 with 1 price", "$1.00", book.priceAsString());
    }
}
