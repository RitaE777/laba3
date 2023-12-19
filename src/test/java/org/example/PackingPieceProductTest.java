package org.example;

import org.example.packing.PackingPieceProduct;
import org.example.packing.ProductPacking;
import org.example.product.PieceProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackingPieceProductTest {
    PackingPieceProduct something;
    @BeforeEach
    void setUp(){
        ProductPacking packing = new ProductPacking("something", 1);
        PieceProduct smth = new PieceProduct("smth", "smth", 2);
        something = new PackingPieceProduct(packing, smth, 5);
    }
    @Test
    void testBrutto(){

        assertEquals(11, something.getBrutto());
    }
    @Test
    void testNetto(){

        assertEquals(10, something.getNetto());
    }

}