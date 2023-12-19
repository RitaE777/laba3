package org.example.product;
import org.example.interfaces.ProductInterface;

import java.util.Arrays;
import java.util.Objects;

public class GoodsBatch {
    private String description;
    private ProductInterface[] products;

    public GoodsBatch(String description, ProductInterface[] products) {
        this.description = description;
        this.products = products;
    }

    public int getBrutto(){
        int sum = 0;
        for(int i = 0; i < products.length; i++){
            sum += products[i].getBrutto();
        }
        return sum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductInterface[] getProducts() {
        return products;
    }

    public void setProducts(ProductInterface[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsBatch that = (GoodsBatch) o;
        return Objects.equals(description, that.description) && Arrays.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return "GoodsBatch{" +
                "description='" + description + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
