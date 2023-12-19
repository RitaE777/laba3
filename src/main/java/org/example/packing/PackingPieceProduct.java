package org.example.packing;

import org.example.interfaces.ProductInterface;
import org.example.product.PieceProduct;

public class PackingPieceProduct extends PieceProduct implements ProductInterface {
    private ProductPacking packing;
    private int amountOfPieceProduct;
    public PackingPieceProduct(ProductPacking packaging, PieceProduct product, int amount){
        super(product.getNameOfProduct(), product.getDescriptionOfProduct(), product.getWeightProduct());
        this.packing = packaging;
        this.amountOfPieceProduct = amount;
    }

    public int getAmountOfPieceProduct() {
        return amountOfPieceProduct;
    }

    @Override
    public String getName() {
        return super.getNameOfProduct();
    }

    public int getNetto(){
        return amountOfPieceProduct * super.getWeightProduct();
    }
    public int getBrutto(){
        return amountOfPieceProduct * super.getWeightProduct() + packing.getProductPackingWeight();
    }
}
