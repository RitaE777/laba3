package org.example.filter;

import org.example.interfaces.Filter;

public class EndStringFilter implements Filter {
    private String pattern;

    public EndStringFilter(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.endsWith(pattern);
    }
}
