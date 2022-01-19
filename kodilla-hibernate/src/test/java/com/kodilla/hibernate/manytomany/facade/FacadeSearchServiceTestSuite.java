package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class facadesearchservicetestsuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private FacadeSearchService facadeSearchService;

    private int test1;
    private int test2;
    private int test3;
    private int test4;

    @BeforeEach
    public void dataPreparation() {
        Employee mike = new Employee("Mike", "Smith");
        Employee rob = new Employee("Robert", "Junior");
        Employee nick = new Employee("Nick", "Black");
        Employee max = new Employee("Max", "Mad");

        Company adidas = new Company("Adidas");
        Company nike = new Company("Nike");
        Company rebook = new Company("Rebook");
        Company puma = new Company("Puma");

        adidas.getEmployees().add(mike);
        nike.getEmployees().add(rob);
        rebook.getEmployees().add(nick);
        puma.getEmployees().add(max);

        companyDao.save(adidas);
        test1 = adidas.getId();
        companyDao.save(nike);
        test2 = nike.getId();
        companyDao.save(rebook);
        test3 = rebook.getId();
        companyDao.save(puma);
        test4 = puma.getId();
    }

    @AfterEach
    public void cleanData() {
        try {
            companyDao.deleteById(test1);
            companyDao.deleteById(test2);
            companyDao.deleteById(test3);
            companyDao.deleteById(test4);
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void searchCompaniesByNamePartTest() {
        //Given
        //When
        List<Company> companyList = facadeSearchService.searchCompaniesByNamePart("ke");
        //Then
        assertEquals(1, companyList.size());
        System.out.println("List of companies");
        for (Company company : companyList) {
            System.out.println(company.getName());
        }
        System.out.println("The end");
    }

    @Test
    void searchEmployeesByNamePartTest() {
        //Given
        //When
        List<Employee> employeeList = facadeSearchService.searchEmployeeByNamePart("u");
        //Then
        assertEquals(1, employeeList.size());
        System.out.println("List of employees");
        for (Employee employee : employeeList) {
            System.out.println(employee.getFirstname() + " " + employee.getLastname());
        }
        System.out.println("That's all.");
    }
}
