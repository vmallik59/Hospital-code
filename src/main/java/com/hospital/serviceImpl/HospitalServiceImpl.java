package com.hospital.serviceImpl;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.bean.PatientDetails;
import com.hospital.dao.HospitalDao;
import com.hospital.dto.PatientDetailsDTO;
import com.hospital.service.HospitalService;

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalDao hospitalDao;

	@Override
	public String savePatientDetails(PatientDetailsDTO pDetailsDTO) {
		
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        while (sb.length() < 18) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            sb.append(SALTCHARS.charAt(index));
        }
        String ranStr = sb.toString();

        String s = pDetailsDTO.getAppointmentTime()+":00";
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        long ms = 0;
		try {
			ms = sdf.parse(s).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
        Time t = new Time(ms);
        
		PatientDetails patientDetails = new PatientDetails();
		patientDetails.setFirstName(pDetailsDTO.getFirstName());
		patientDetails.setLastName(pDetailsDTO.getLastName());
		patientDetails.setDob(pDetailsDTO.getDob());
		patientDetails.setDateOfAppointment(pDetailsDTO.getAppointmentDate());
		patientDetails.setTimeOfAppointment(t);
		patientDetails.setReferenceNumber(ranStr);

		return hospitalDao.savePatientDetails(patientDetails);
	}

	@Override
	public PatientDetails getPatientDetailsByreferenceNum(String referenceNum) {
		return hospitalDao.getPatientDetailsByreferenceNum(referenceNum);
	}

}
