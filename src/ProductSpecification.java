public class ProductSpecification {
    String colour;
    int price;
    String size;

    @Override
    public String toString() {
        return "ProductSpecification{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
