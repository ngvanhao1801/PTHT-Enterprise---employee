package hunre.it.employee.repository;


import hunre.it.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	List<Employee> findByTenPhongBanAndTuoiLessThanEqual(String tenPhongBan, int tuoi);
}
