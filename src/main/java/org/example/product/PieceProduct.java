package org.example.product;

import java.util.Objects;

public class PieceProduct extends Product {
    private int weightProduct;
    public PieceProduct(String name, String description, int weightProduct){
        super(name,description);
        this.weightProduct = weightProduct;
    }

    public int getWeightProduct() {
        return weightProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PieceProduct that = (PieceProduct) o;
        return weightProduct == that.weightProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weightProduct);
    }

    @Override
    public String toString() {
        return "PieceProduct{" +
                "weightProduct=" + weightProduct +
                '}';
    }
}
