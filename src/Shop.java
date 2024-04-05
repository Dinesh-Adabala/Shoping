import java.util.List;

public class Shop {
    double amount;
    public List<Product>productList;

    public Product selectionProcess(Product product){
        if (productList.contains(product)){
            amount= product.productCost;
            System.out.println("product found" + product);
        }else {
            System.out.println("product not found");
        }
        return product;
    }
}
