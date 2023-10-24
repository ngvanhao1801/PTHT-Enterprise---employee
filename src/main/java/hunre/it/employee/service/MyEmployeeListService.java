package hunre.it.employee.service;

import hunre.it.employee.entity.MyEmployeeList;
import hunre.it.employee.repository.MyEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyEmployeeListService {

  @Autowired
  private MyEmployeeRepository myEmployee;

  public void saveMyEmployees(MyEmployeeList employee) {
    myEmployee.save(employee);
  }

  public List<MyEmployeeList> getAllMyEmployees() {
    return myEmployee.findAll();
  }

  public void deleteById(int id) {
    myEmployee.deleteById(id);
  }

}
