package app.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}