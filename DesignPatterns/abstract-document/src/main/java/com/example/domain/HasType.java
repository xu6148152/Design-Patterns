package com.example.domain;

import com.example.Document;
import java.util.Optional;

/**
 * HasType trait for static access to 'type' property
 */
public interface HasType extends Document {

  String PROPERTY = "type";

  default Optional<String> getType() {
    return Optional.ofNullable((String) get(PROPERTY));
  }

}