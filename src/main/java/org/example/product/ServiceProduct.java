package org.example.product;

import org.example.interfaces.Filter;
import org.example.interfaces.ProductInterface;

public class ServiceProduct {
    public static int countByFilter(GoodsBatch batch, Filter filter){
        int count = 0;
        for(ProductInterface item: batch.getProducts()){
            if(filter.apply(item.getName())){
                count++;
            }
        }
        return count;
    }
}
