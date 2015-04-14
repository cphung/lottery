package com.nga4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nga4.model.Prize;

public interface PrizeRepository extends JpaRepository<Prize, Integer> {
}
