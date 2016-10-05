package com.example.domain;

import com.example.Document;
import java.util.Optional;

/**
 * HasPrice trait for static access to 'price' property
 */
public interface HasPrice extends Document {

    String PROPERTY = "price";

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(PROPERTY));
    }
}