package com.hospital.dto;

import java.util.Date;

public class PatientDetailsDTO {

	
	private String firstName;
	private String lastName;
	private Date dob;
	private Date appointmentDate;
	private String appointmentTime;

	
	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	@Override
	public String toString() {
		return "PatientDetailsDTO [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime + "]";
	}

}
