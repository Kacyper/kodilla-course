package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacadeSearchService {

    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    @Autowired
    public FacadeSearchService(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Company> searchCompaniesByNamePart(String fragment) {
        fragment = "%" + fragment + "%";
        return companyDao.retrieveCompaniesByNamePart(fragment);
    }

    public List<Employee> searchEmployeeByNamePart(String fragment) {
        fragment = "%" + fragment + "%";
        return employeeDao.retrieveEmployeeByNamePart(fragment);
    }
}
