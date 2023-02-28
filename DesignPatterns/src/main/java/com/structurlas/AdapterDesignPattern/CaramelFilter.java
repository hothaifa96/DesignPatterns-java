package com.structurlas.AdapterDesignPattern;

import com.structurlas.AdapterDesignPattern.VintageFilters.Caramel;

public class CaramelFilter implements Filter{
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.render(image);
    }
}
