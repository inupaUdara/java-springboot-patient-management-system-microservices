package com.example.patient_service.patient_service.mapper;

import java.time.LocalDate;

import com.example.patient_service.patient_service.dto.PatientRequestDTO;
import com.example.patient_service.patient_service.dto.PatientResponseDto;
import com.example.patient_service.patient_service.model.Patient;

public class PatientMapper {
    public static PatientResponseDto toDTO(Patient patient) {
        PatientResponseDto patientDTO = new PatientResponseDto();

        patientDTO.setId(patient.getId().toString());
        patientDTO.setName(patient.getName());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());

        return patientDTO;
    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
        Patient patient = new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
        return patient;
    }

}
