package com.spandana.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spandana.dao.impl.DoctorDAOImpl;
import com.spandana.dao.impl.HospitalDAOImpl;
import com.spandana.dao.impl.InvoiceDAOImpl;
import com.spandana.dao.impl.PatientDAOImpl;
import com.spandana.model.Doctor;
import com.spandana.model.Hospital;
import com.spandana.model.Invoice;
import com.spandana.model.Patient;

@Service
public class HMSService {
	
	@Autowired
	DoctorDAOImpl doctorDao;
	
	@Autowired
	PatientDAOImpl patientDao;
	
	@Autowired
	InvoiceDAOImpl invoiceDao;
	
	@Autowired
	HospitalDAOImpl hospitalDao;
	
	List<Doctor> listDoctors;
	List<Patient> listPatients;
	List<Invoice> invoiceList;
	
	//hospital
	
	public List<Hospital> getHospital() {
		return hospitalDao.getHospital();
	}
	
	//Doctor
	
	public List<Doctor> showAllDoctors(){
		listDoctors=doctorDao.allDoctors();
		return listDoctors;
	}

	public List<Map<String, Object>> searchDoctorByName(String doctorName){
		return doctorDao.searchDoctorByName(doctorName);
	}
	
	public Doctor searchDoctorById(long id) {	
		return doctorDao.searchDoctorById(id);
	}
	
	public Doctor createDoctor(Doctor doctor) {
		return doctorDao.createDoctor(doctor);
	}
	
	public Doctor updateDoctor(Doctor doctor) {
		return doctorDao.updateDoctor(doctor);
	}
	
	public void deleteDoctor(long id){
		doctorDao.deleteDoctor(id);
	}
	//Patients
	
	public List<Patient> showAllPatients(){
		listPatients=patientDao.allPatients();
		return listPatients;
	}
	
	public List<Map<String, Object>> searchPatientByName(String patientName){
		return patientDao.searchPatientByName(patientName);
	}
	
	public Patient searchPatientById(long id) {
		return patientDao.searchPatientById(id);
	}
	
	public Patient createPatient(Patient patient) {
		return patientDao.createPatient(patient);
	}
	
	public void updatePatient(Patient patient){
		patientDao.updatePatient(patient);
	}
	
	public void deletePatient(long id){
		patientDao.deletePatient(id);
	}
	
	// Invoice 
	
	public List<Invoice> showInvoice(){
		invoiceList=invoiceDao.showInvoice();
		return invoiceList;
	}

}
