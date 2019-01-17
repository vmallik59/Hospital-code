package com.hospital.dao;

import com.hospital.bean.PatientDetails;

public interface HospitalDao {
	String savePatientDetails(PatientDetails patientDetails);
	PatientDetails getPatientDetailsByreferenceNum(String referenceNum);
}
