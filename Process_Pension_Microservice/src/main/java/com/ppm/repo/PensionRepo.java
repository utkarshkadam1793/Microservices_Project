package com.ppm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppm.entity.Pension;

public interface PensionRepo extends JpaRepository<Pension, Long>{

}
