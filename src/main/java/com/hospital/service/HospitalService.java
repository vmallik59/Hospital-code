package com.hospital.service;

import com.hospital.bean.PatientDetails;
import com.hospital.dto.PatientDetailsDTO;

public interface HospitalService {
	String savePatientDetails(PatientDetailsDTO pDetailsDTO);
	PatientDetails getPatientDetailsByreferenceNum(String referenceNum);
}
