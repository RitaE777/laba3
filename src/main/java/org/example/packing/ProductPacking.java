package org.example.packing;

import java.util.Objects;

public class ProductPacking {
    private String name;
    private int weight;

    public ProductPacking(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getProductPackingWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPacking that = (ProductPacking) o;
        return weight == that.weight && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "ProductPacking{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
