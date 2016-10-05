package com.example.domain;

import com.example.Document;
import java.util.stream.Stream;

/**
 * HasParts trait for static access to 'parts' property
 */
public interface HasParts extends Document {

  String PROPERTY = "parts";

  default Stream<Part> getParts() {
    return children(PROPERTY, Part::new);
  }

}