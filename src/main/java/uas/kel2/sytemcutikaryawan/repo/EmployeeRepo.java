package uas.kel2.sytemcutikaryawan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uas.kel2.sytemcutikaryawan.models.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    Optional<Employee> findByUsername(String username);
}
