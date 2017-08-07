package app;

import app.dto.DTOMappingUtil;
import app.dto.EmployeeDto;
import app.dto.ManagerDto;
import app.model.Address;
import app.model.City;
import app.model.Employee;
import org.springframework.boot.CommandLineRunner;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

public class TerminalController implements CommandLineRunner {
    private City city = new City("Varna");
    private Address address = new Address(city);
    @Override
    public void run(String... strings) throws Exception {
        Employee e1 = new Employee("Ivan", "Dimitrov", BigDecimal.valueOf(1234.89), new Date(), address);

        EmployeeDto employeeDto = DTOMappingUtil.convert(e1,EmployeeDto.class);
        Employee e2 = DTOMappingUtil.convert(employeeDto, Employee.class);
        System.out.println(employeeDto);

        Employee e3 = new Employee("Gosho", "Petrov", BigDecimal.valueOf(50000), new Date(), address);
        e3.addManagedEmployee(e1);
        ManagerDto managerDto = DTOMappingUtil.convert(e3, ManagerDto.class);
        System.out.println(e2);
    }
}
