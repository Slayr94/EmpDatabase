package Employee.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Employee> listEmployees = employeeService.listAll();
        model.addAttribute("listEmployees", listEmployees);
        System.out.println("Get / ");
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("employee", new Employee());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect:/";
    }

    @RequestMapping("edit/{id}")
    public ModelAndView showEditPage(@PathVariable(name="id") int id){
        ModelAndView mav = new ModelAndView("new");
        Employee employee = employeeService.getId(id);
        mav.addObject("Employee", employee);
        return mav;
    }
    @RequestMapping("/delete/{id}")
    public String delete (@PathVariable int id){
        employeeService.delete(id);
        return "redirect:/";
    }





}
