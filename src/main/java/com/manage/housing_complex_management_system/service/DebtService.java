package com.manage.housing_complex_management_system.service;

import com.manage.housing_complex_management_system.entity.resident.Resident;
import com.manage.housing_complex_management_system.entity.residential.Flat;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DebtService {

    public Flat calcDebtFlat (Flat flat,int paidAmount) {

        int currentDebt;

        currentDebt = flat.getDebt() - paidAmount;

        flat.setDebt(currentDebt);

        return flat;
    }
}
