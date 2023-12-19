package org.example.product;

import org.example.interfaces.Filter;
import org.example.interfaces.ProductInterface;

public class ProductService {

    public static int countByFilter(GoodsBatch batch, Filter filter) {
        int countByFilter = 0;
        ProductInterface[] arrayOfProducts = batch.getProducts();
        for (ProductInterface product : arrayOfProducts) {
            if (filter.apply(product.getName())) {
                    countByFilter++;
            }
        }
        return countByFilter;
    }


}
