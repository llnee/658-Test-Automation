import java.util.Objects;

public class BookInStock {

    String isbn;
    double price;

    public BookInStock(String isbn, double price) {
        // if ISBN empty "", throw IAE
        // if price <= 0, throw IAE
        if (Objects.equals(isbn, "")) throw new IllegalArgumentException();
        if (price <= 0.0) throw new IllegalArgumentException();

        this.isbn = isbn;
        this.price = price;
    }

    public String getIsbn() { return isbn;}

    public double getPrice() { return price;}

    public void setIsbn(String isbn) {
        if (Objects.equals(isbn, "")) throw new IllegalArgumentException();
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        if (price <= 0.0) throw new IllegalArgumentException();
        this.price = price;
    }

    public String priceAsString() {
        return String.format("$%.2f", price);
    }
}
