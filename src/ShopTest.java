
import java.util.ArrayList;
import java.util.List;

public class ShopTest {
    public static void main(String[] args) {
        Product jeansProduct = new Product();
        jeansProduct.type= "jeans";
        jeansProduct.brandCode= "JP001";
        jeansProduct.productCost=2499;

        ProductSpecification normalJeans = new ProductSpecification();
        normalJeans.size = "32";
        normalJeans.colour="Black";
        normalJeans.price=3000;

        jeansProduct.productSpecification=normalJeans;




        Product shirt = new Product();
        ProductSpecification cottonShirt = new ProductSpecification();
        cottonShirt.size = "32";
        cottonShirt.colour="white";
        cottonShirt.price=2000;
        shirt.type="jeans";
        shirt.brandCode="JP001";
        shirt.productCost=1999;
        shirt.productSpecification=cottonShirt;


        Product tShirt = new Product();
        ProductSpecification roundNickTShirt = new ProductSpecification();
        roundNickTShirt.size = "32";
        roundNickTShirt.colour="white";
        roundNickTShirt.price=2000;
        tShirt.type="jeans";
        tShirt.brandCode="JP001";
        tShirt.productCost=1999;
        tShirt.brand="puma";
        tShirt.productSpecification=cottonShirt;

        Product cap = new Product();

        Shop shop = new Shop();
        List<Product> productList= new ArrayList<>();
        productList.add(tShirt);
        productList.add(shirt);
        productList.add(jeansProduct);

        shop.productList=productList;

        shop.selectionProcess(shirt);
         shop.selectionProcess(cap);


    }


}
