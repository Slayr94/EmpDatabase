package Employee.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAll(){
       return employeeRepository.findAll();
    }
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee getId(long id){
        return employeeRepository.findById(id).get();
    }
    public void delete(long id){
        employeeRepository.deleteById(id);
    }
}
