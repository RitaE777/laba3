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
    private Filter filter2;
    private GoodsBatch batch;
    private Filter filter;
    @BeforeEach
    void setUp() {
        ProductPacking packing = new ProductPacking("packing", 1);
        WeightProduct product1 = new WeightProduct("product1", "description of product1");
        WeightProduct product2 = new WeightProduct("product2", "description of product1");
        PackingWeightProduct packingProduct1 = new PackingWeightProduct(product1, 3, packing);
        PackingWeightProduct packingProduct2 = new PackingWeightProduct(product2, 6, packing);
        PieceProduct product3 = new PieceProduct("product3","description of product3", 3);
        PieceProduct product4 = new PieceProduct("product4","description of product4", 1);
        PackingPieceProduct packingProduct3 = new PackingPieceProduct(packing, product3, 4);
        PackingPieceProduct packingProduct4 = new PackingPieceProduct(packing, product4, 4);
        ProductInterface[] test = new ProductInterface[]{packingProduct1, packingProduct2, packingProduct3, packingProduct4};
        batch = new GoodsBatch("test", test);
        filter = new ContainStringFilter("product1");
        filter2 = new ContainStringFilter("product0");
    }
    @Test
    public void testCountByFilter() {
        assertEquals(1, ServiceProduct.countByFilter(batch, filter));
        assertEquals(0, ServiceProduct.countByFilter(batch, filter2));
    }


}