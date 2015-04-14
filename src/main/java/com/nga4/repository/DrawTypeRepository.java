package com.nga4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.nga4.model.DrawType;

public interface DrawTypeRepository extends JpaRepository<DrawType, Integer> {
    List<DrawType> findByName(String name);
}
