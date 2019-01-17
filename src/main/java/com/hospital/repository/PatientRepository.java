package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.bean.PatientDetails;

@Repository
public interface PatientRepository extends JpaRepository<PatientDetails, Long>{

	PatientDetails findByReferenceNumber(String referenceNumber);
}
