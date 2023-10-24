package hunre.it.employee.controller;

import hunre.it.employee.entity.Employee;
import hunre.it.employee.entity.MyEmployeeList;
import hunre.it.employee.service.EmployeeService;
import hunre.it.employee.service.MyEmployeeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@Autowired
	private MyEmployeeListService myEmployeeListService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/employee_register")
	public String employeeRegister() {
		return "employeeRegister";
	}

	@GetMapping("/available_employees")
	public ModelAndView getAllEmployee() {
		List<Employee> list = service.getAllEmployee();

		return new ModelAndView("employeeList", "employee", list);
	}

	@PostMapping("/save")
	public String addEmployee(@ModelAttribute Employee e) {
		service.save(e);
		List<String> ca = new ArrayList<>();
		return "redirect:/available_employees";
	}

	@GetMapping("/my_employees")
	public String getMyEmployees(Model model) {
		List<MyEmployeeList> list = myEmployeeListService.getAllMyEmployees();
		model.addAttribute("employee", list);
		return "myEmployee";
	}

	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Employee e = service.getEmployeeById(id);
		MyEmployeeList me = new
				MyEmployeeList(e.getId(), e.getMaNv(), e.getTenNhanVien(), e.getTenPhongBan(), e.getGioiTinh(), e.getTuoi());
		myEmployeeListService.saveMyEmployees(me);
		return "redirect:/my_employees";
	}

	@RequestMapping("/editEmployee/{id}")
	public String editEmployee(@PathVariable("id") int id, Model model) {
		Employee e = service.getEmployeeById(id);
		model.addAttribute("employee", e);
		return "employeeEdit";
	}

	@RequestMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/available_employees";
	}

	@GetMapping("/search")
	public String searchEmployee(@RequestParam("tenPhongBan") String tenPhongBan,
	                             @RequestParam("tuoi") int tuoi,
	                             Model theModel) {
		List<Employee> theSach = service.searchEmployee(tenPhongBan, tuoi);
		theModel.addAttribute("employee", theSach);
		return "search-employee";
	}

}
