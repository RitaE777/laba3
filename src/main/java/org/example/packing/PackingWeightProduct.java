package org.example.packing;

import org.example.interfaces.ProductInterface;
import org.example.product.Product;
import org.example.product.WeightProduct;

import java.util.Objects;

public class PackingWeightProduct extends WeightProduct implements ProductInterface {
    private ProductPacking packing;
    private int weight;

    public PackingWeightProduct(Product product, int weight, ProductPacking packing) {
        super(product.getNameOfProduct(), product.getDescriptionOfProduct());
        this.weight = weight;
        this.packing = packing;
    }
    public int getBrutto(){
        return weight + packing.getProductPackingWeight();
    }

    @Override
    public String getName() {
        return super.getNameOfProduct();
    }

    public int getNetto(){
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackingWeightProduct product = (PackingWeightProduct) o;
        return weight == product.weight && Objects.equals(packing, product.packing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), packing, weight);
    }

    @Override
    public String toString() {
        return "PackingWeightProduct{" +
                "packing=" + packing +
                ", weight=" + weight +
                '}';
    }
}
