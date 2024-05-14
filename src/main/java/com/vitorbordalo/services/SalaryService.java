package com.vitorbordalo.services;

import com.vitorbordalo.entities.Employee;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {


    private TaxService taxService;

    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {
        return employee.getGrossSalay() - taxService.tax(employee.getGrossSalay())
                - pensionService.discount(employee.getGrossSalay());
    }
}
