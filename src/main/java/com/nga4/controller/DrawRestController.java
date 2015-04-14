package com.nga4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nga4.model.Draw;
import com.nga4.repository.DrawRepository;
import com.nga4.repository.DrawTypeRepository;
import com.nga4.repository.ProvinceRepository;
import com.nga4.exception.ProvinceNotFoundException;

import java.util.Collection;

@RestController
@RequestMapping("/draw/{provinceId}")
public class DrawRestController {

    private DrawRepository     drawRepository;
    private ProvinceRepository provinceRepository;
    private DrawTypeRepository drawTypeRepository;

    @Autowired
    DrawRestController(DrawRepository drawRepository, ProvinceRepository provinceRepository, DrawTypeRepository drawTypeRepository) {
        this.drawRepository = drawRepository;
        this.provinceRepository = provinceRepository;
        this.drawTypeRepository = drawTypeRepository;
    }


    @RequestMapping(method = RequestMethod.GET)
    Collection<Draw> getDrawByProvinceId(@PathVariable String provinceId) {
        validateProvince(provinceId);
        return drawRepository.findByProvinceId(provinceId);
    }

    private void validateProvince(String provinceId) {
        if (provinceRepository.findById(Integer.parseInt(provinceId)).isEmpty()) {
            throw new ProvinceNotFoundException(provinceId);
        }

    }
}
