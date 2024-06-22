package br.com.rento.model.product;

import br.com.rento.model.dimensions.Dimensions;
import br.com.rento.model.dimensions.DressDimensions;

public class Dress implements Product {
    private DressDimensions dimensions;

    public Dress(DressDimensions dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String getType() {
        return "Dress";
    }

    @Override
    public Dimensions getDimensions() {
        return dimensions;
    }
}