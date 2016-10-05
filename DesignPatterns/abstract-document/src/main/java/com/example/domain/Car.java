package com.example.domain;

import com.example.AbstractDocument;
import java.util.Map;

/**
 * Car entity
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

    public Car(Map<String, Object> properties) {
        super(properties);
    }
}