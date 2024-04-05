public class Product {
    String type;
    double productCost;
    String brandCode;
    String brand;
    ProductSpecification productSpecification;

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", productCost=" + productCost +
                ", brandCode='" + brandCode + '\'' +
                ", brand='" + brand + '\'' +
//", productSpecification=" + productSpecification +
                '}';
    }
}
