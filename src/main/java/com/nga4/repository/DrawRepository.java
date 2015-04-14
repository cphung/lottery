package com.nga4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.nga4.model.Draw;

public interface DrawRepository extends JpaRepository<Draw, Long> {
  List<Draw> findByProvinceId(String provinceId);
}
