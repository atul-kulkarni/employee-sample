package com.sample.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  private String firstName;
  private String lastName;
  private String department;
  private String officeLocation;
  private String designation;
  private Double salary;
}
