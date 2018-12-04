package com.dxc.doctor.delegate;

import com.dxc.doctor.api.V1ApiDelegate;
import com.dxc.doctor.api.model.MedicalTreatmentProfile;
import com.dxc.doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class V1ApiDelegateImp implements V1ApiDelegate {

    @Autowired
    private DoctorService doctorService;

    @Override
    public ResponseEntity<List<MedicalTreatmentProfile>> searchPatients(String name, String disease, String medicine) {
        return null;
    }

    @Override
    public ResponseEntity<List<String>> searchTest(String id, String name) {
        return null;
    }

    @Override
    public ResponseEntity<String> upsertProfiles(String id, List<MedicalTreatmentProfile> profiles) {
        return ResponseEntity.ok(doctorService.upsertProfiles(id, profiles));
    }
}