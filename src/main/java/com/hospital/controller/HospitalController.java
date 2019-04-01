package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.bean.PatientDetails;
import com.hospital.dto.PatientDetailsDTO;
import com.hospital.service.HospitalService;

@RestController
//@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;
	
	@PostMapping("/savePatientDetails")
	public String savePatientDetails(@RequestBody PatientDetailsDTO pDetailsDTO) {
		String refNum = hospitalService.savePatientDetails(pDetailsDTO);
		String message = "";
		if(!"".equals(refNum)) {
			message = "Appointement has scheduled and the reference number is:"+refNum;
		} else {
			message = "failed to save patient details";
		}
		System.out.println(message);
		return message;
	}
	
	@GetMapping("/patientDetailsByrefNum")
	public PatientDetails PatientDetailsByreferenceNum(@RequestParam("referenceNum") String referenceNum) {
		System.out.println("referenceNum====>"+referenceNum);
		PatientDetails patientDetails = hospitalService.getPatientDetailsByreferenceNum(referenceNum);
		if(patientDetails == null) {
			patientDetails = new PatientDetails();
		}
		return patientDetails;
	}
	
	@GetMapping("hello")
   	public String sayHello(){
		return ("Hello, SpringBoot on Wildfly");
    	}
	
}
