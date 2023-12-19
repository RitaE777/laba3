package org.example;

import org.example.filter.ContainStringFilter;
import org.example.interfaces.Filter;
import org.example.interfaces.ProductInterface;
import org.example.packing.PackingPieceProduct;
import org.example.packing.PackingWeightProduct;
import org.example.packing.ProductPacking;
import org.example.product.GoodsBatch;
import org.example.product.PieceProduct;
import org.example.product.ServiceProduct;
import org.example.product.WeightProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProductServiceTest {
    private GoodsBatch batch;
    private Filter filter;
    @BeforeEach
    void setUp() {
        ProductPacking smth = new ProductPacking("smth", 1);
        WeightProduct product1 = new WeightProduct("smth", "smth");
        WeightProduct product2 = new WeightProduct("smth", "smth");
        PackingWeightProduct packingProduct1 = new PackingWeightProduct(product1, 3, smth);
        PackingWeightProduct packingProduct2 = new PackingWeightProduct(product2, 6, smth);
        PieceProduct product3 = new PieceProduct("smth","smth", 3);
        PieceProduct product4 = new PieceProduct("smth","smth", 1);
        PackingPieceProduct packingProduct3 = new PackingPieceProduct(smth, product3, 4);
        PackingPieceProduct packingProduct4 = new PackingPieceProduct(smth, product4, 4);
        ProductInterface[] test = new ProductInterface[]{packingProduct1, packingProduct2, packingProduct3, packingProduct4};
        batch = new GoodsBatch("test", test);
        filter = new ContainStringFilter("smth");
    }
    @Test
    public void testCountByFilter() {
        assertEquals(4, ServiceProduct.countByFilter(batch, filter));

    }


}