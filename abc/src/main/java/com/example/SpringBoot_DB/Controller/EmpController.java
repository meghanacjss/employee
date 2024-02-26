package com.example.SpringBoot_DB.Controller;
import com.example.SpringBoot_DB.Model.Employee;
import com.example.SpringBoot_DB.Service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class EmpController {

    @Autowired

    private EmpServiceImpl empServiceImpl;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/add")
    public String add(ModelMap model){
        Employee employee = new Employee();
        model.put("employee",employee);
        return "addEmp";
    }

    @RequestMapping("/addEmp")
    public String  addEmployee(@ModelAttribute("employee") Employee employee) {
        System.out.println(employee.getEmployeeId());
       empServiceImpl.addEmployee(employee);
        return "welcome";
    }

    @RequestMapping("/getAllEmployees")
    public String getEmployees(ModelMap model){
        System.out.println("hello");
        List<Employee> employeeList=empServiceImpl.getAllEmployees();
        model.addAttribute("EmployeeList",employeeList);
        return "viewemp";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee updatedEmployee) {
        System.out.println("Update Employee");
        empServiceImpl.updateEmployee(updatedEmployee);
        return "updateEmp";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee() {
        System.out.println("Delete Employee");
        //   service.deleteEmployeeById(employeeId);
        return "deleteEmp";
    }

    @RequestMapping("/")
    public String delete(@RequestParam("employeeId") int employeeId ,ModelMap model){
        empServiceImpl.deleteEmployeeById(employeeId);
        List<Employee> employeeList=empServiceImpl.getAllEmployees();
        model.addAttribute("EmployeeList",employeeList);
        return "/viewemp";
    }

}
