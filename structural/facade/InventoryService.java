package structural.facade;

import java.util.Map;

public class InventoryService {
    
    Map<String, Integer> PRODUCT_VS_QTY = Map.of(
        "Milk", 10,
        "Curd", 10,
        "Ghee", 10,
        "Butter", 10
    );

    public int getAvailableQty(String productName){
        return PRODUCT_VS_QTY.getOrDefault(productName, 0);
    }
}
