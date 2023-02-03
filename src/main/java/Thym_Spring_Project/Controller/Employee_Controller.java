package Thym_Spring_Project.Controller;

import Thym_Spring_Project.Service.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee_Controller {

    @Autowired

    private Employee_Service employeeService;


    @GetMapping("/home_view_page")

    public String viewHomePage(Model model){

    model.addAttribute("getemployee",employeeService.getAllEmployee());

    return "index";

    }
}
