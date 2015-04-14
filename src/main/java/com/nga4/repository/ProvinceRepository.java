package com.nga4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.nga4.model.Province;

public interface ProvinceRepository extends JpaRepository<Province, Integer> {
  List<Province> findByName(String name);
  List<Province> findById(int id);
}
