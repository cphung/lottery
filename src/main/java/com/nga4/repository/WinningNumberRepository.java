package com.nga4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nga4.model.WinningNumber;

public interface WinningNumberRepository extends JpaRepository<WinningNumber, Long> {
}
