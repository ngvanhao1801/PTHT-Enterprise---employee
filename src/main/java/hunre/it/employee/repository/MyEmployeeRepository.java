package hunre.it.employee.repository;


import hunre.it.employee.entity.MyEmployeeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEmployeeRepository extends JpaRepository<MyEmployeeList, Integer> {
}
