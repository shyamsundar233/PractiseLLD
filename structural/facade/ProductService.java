package structural.facade;

import java.util.Map;

public class ProductService {
    Map<String, Integer> PRODUCT_VS_PRICE = Map.of(
        "Milk", 30,
        "Curd", 20,
        "Ghee", 40,
        "Butter", 25
    );

    public int getPrice(String productName){
        return PRODUCT_VS_PRICE.getOrDefault(productName, 0);
    }
}
