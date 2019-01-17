package com.hospital.bean;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_details")
public class PatientDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "appointment_date")
	private Date dateOfAppointment;
	@Column(name = "appointment_time")
	private Time timeOfAppointment;

	@Column(name="reference_number")
	@Id
	private String referenceNumber;
	
	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getDateOfAppointment() {
		return String.valueOf(dateOfAppointment).substring(0,10);
	}

	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public Time getTimeOfAppointment() {
		return timeOfAppointment;
	}

	public void setTimeOfAppointment(Time timeOfAppointment) {
		this.timeOfAppointment = timeOfAppointment;
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

	public String getDob() {
		return String.valueOf(dob).substring(0,10);
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	

	@Override
	public String toString() {
		return "PatientDetails [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", dateOfAppointment=" + dateOfAppointment + ", timeOfAppointment=" + timeOfAppointment
				+ ", referenceNumber=" + referenceNumber + "]";
	}
}
