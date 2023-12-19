package org.example;

import org.example.filter.BeginStringFilter;
import org.example.filter.ContainStringFilter;
import org.example.filter.EndStringFilter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest {
    @Test
    public void myTest1(){
        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        boolean res1 = filter1.apply(str); // результат — true
        boolean res2 = filter2.apply(str); // результат — false
        assertTrue(res1);
        assertFalse(res2);
    }
    @Test
    public void myTest2(){
        String str = "Мама мыла раму";
        EndStringFilter filter1 = new EndStringFilter("Мама");
        EndStringFilter filter2 = new EndStringFilter("раму");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);
        assertFalse(res1);
        assertTrue(res2);
    }
    @Test
    public void myTest3(){
        String str = "Мама мыла раму";
        ContainStringFilter filter1 = new ContainStringFilter("мама");
        ContainStringFilter filter2 = new ContainStringFilter("раму");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);
        assertFalse(res1);
        assertTrue(res2);
    }
}