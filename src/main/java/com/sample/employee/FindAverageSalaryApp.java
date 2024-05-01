package com.sample.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FindAverageSalaryApp {

  public void findAverageSalary(List<Employee> employees) {

    // Group employees by office location and designation
    // OfficeLocation - <Designation, List<Salary>>
    Map<String, Map<String, List<Double>>> groupedEmployees = new ConcurrentHashMap<>();

    employees.parallelStream()
        .forEach(
            employee ->
                groupedEmployees
                    .computeIfAbsent(employee.getOfficeLocation(), _ -> new ConcurrentHashMap<>())
                    .computeIfAbsent(employee.getDesignation(), _ -> new ArrayList<>())
                    .add(employee.getSalary()));

    // Calculate average salary for each group
    groupedEmployees.forEach(
        (officeLocation, designationVsSalaries) ->
            designationVsSalaries.forEach(
                (designation, salaries) -> {
                  double averageSalary =
                      salaries.stream().mapToDouble(Double::doubleValue).average().orElse(0);
                  System.out.printf(
                      "%s --> %s --> %.2f%n", officeLocation, designation, averageSalary);
                }));
  }
}
