package org.example;

import org.example.packing.PackingWeightProduct;
import org.example.packing.ProductPacking;
import org.example.product.WeightProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackingWeightProductTest {
    PackingWeightProduct something;
    @BeforeEach
    public void setUp(){
        ProductPacking packing = new ProductPacking("something", 1);
        WeightProduct smth = new WeightProduct("smth", "smth");
        something = new PackingWeightProduct(smth, 1, packing);
    }
    @Test
    void testBrutto(){
        assertEquals(2, something.getBrutto());
    }
    @Test
    void testNetto(){
        assertEquals(1, something.getNetto());
    }

}