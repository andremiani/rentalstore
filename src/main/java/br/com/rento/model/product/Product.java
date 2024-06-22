package br.com.rento.model.product;

import br.com.rento.model.dimensions.Dimensions;

public interface Product {
    String getType();

    Dimensions getDimensions();
}