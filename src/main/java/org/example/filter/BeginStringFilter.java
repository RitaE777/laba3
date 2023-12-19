package org.example.filter;

import org.example.interfaces.Filter;

public class BeginStringFilter implements Filter {
    private String pattern;
    private int x;
    private int y;

    public BeginStringFilter(int x, int y){
    }
    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }
    @Override
    public boolean apply(String str) {
        return str.startsWith(pattern);
    }


}
