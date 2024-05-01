# Employee Salary Analysis

## Description
This Java application calculates the average salary for each designation in each office location based on a list of employees' details.

## Usage
1. Ensure you have Java installed on your system.
2. Clone or download the project repository.
3. Navigate to the project directory.
4. Compile the Java files:
   ```bash
   javac *.java
   ```
5. Run the application:
   ```bash
   java SampleApp
   ```

## Sample Input
```java
List<Employee> employees = new ArrayList<>();
employees.add(new Employee("Ashish", "A", "IT", "Pune", "Software Engineer", 10000.0));
employees.add(new Employee("Amit", "R", "HR", "Pune", "Recruiter", 12000.0));
employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Senior Recruiter", 14000.0));
employees.add(new Employee("Jaya", "S", "IT", "Pune", "Tech Lead", 15000.0));
employees.add(new Employee("Smita", "M", "IT", "Bangalore", "Recruiter", 16000.0));
employees.add(new Employee("Umesh", "A", "IT", "Bangalore", "Software Engineer", 12000.0));
employees.add(new Employee("Pooja", "R", "HR", "Bangalore", "Software Engineer", 12000.0));
employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Recruiter", 16000.0));
employees.add(new Employee("Bobby", "S", "IT", "Bangalore", "Tech Lead", 20000.0));
employees.add(new Employee("Vipul", "M", "IT", "Bangalore", "Software Engineer", 14000.0));
```

## Sample Output
```
Pune --> Senior Recruiter --> 14000.00
Pune --> Tech Lead --> 15000.00
Pune --> Software Engineer --> 10000.00
Pune --> Recruiter --> 14000.00
Bangalore --> Tech Lead --> 20000.00
Bangalore --> Software Engineer --> 12666.67
Bangalore --> Recruiter --> 16000.00
```

## Classes
- **Employee**: Represents an employee with attributes such as first name, last name, department, office location, designation, and salary.
- **FindAverageSalaryApp**: Contains the logic to calculate the average salary for each designation in each office location.
- **SampleApp**: Main class to demonstrate the usage of the `FindAverageSalaryApp`.

