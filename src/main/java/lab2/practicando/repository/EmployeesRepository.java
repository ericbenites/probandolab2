package lab2.practicando.repository;

import lab2.practicando.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository <Employees, String> {

}
