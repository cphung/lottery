package com.nga4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

import com.nga4.model.Province;
import com.nga4.repository.ProvinceRepository;

@Controller
@RequestMapping(value = "/province/")
public class ProvinceRestController {
  @Autowired
  private ProvinceRepository provinceRepository;
  
  @RequestMapping(method = RequestMethod.GET)
  Collection<Province> geProvinces() {
    return provinceRepository.findAll();
  }
}
