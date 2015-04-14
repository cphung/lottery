package com.nga4.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProvinceNotFoundException extends RuntimeException {
  public ProvinceNotFoundException(String provinceId) {
    super("could not find province '" + provinceId + "'.");
  }
}
