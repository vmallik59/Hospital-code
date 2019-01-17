package com.hospital.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.bean.PatientDetails;
import com.hospital.dao.HospitalDao;
import com.hospital.repository.PatientRepository;

@Repository
public class HospitalDaoImpl implements HospitalDao {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public String savePatientDetails(PatientDetails patientDetails) {
		String refNum  = "";
		try {
			patientRepository.save(patientDetails);
			refNum = patientDetails.getReferenceNumber();
		} catch(Exception e) {
			refNum = "";
			e.printStackTrace();
		}
		return refNum;
	}

	@Override
	public PatientDetails getPatientDetailsByreferenceNum(String referenceNum) {
		PatientDetails patientDetails = patientRepository.findByReferenceNumber(referenceNum);
		return patientDetails;
	}

}
