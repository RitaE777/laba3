package org.example.filter;

import org.example.interfaces.Filter;

public class ContainStringFilter implements Filter {
    private String pattern;

    public ContainStringFilter(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.contains(pattern);
    }
}

