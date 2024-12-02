package kz.bitlab.springtask2.controller;

import kz.bitlab.springtask2.db.DBManager;
import kz.bitlab.springtask2.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model) {

        model.addAttribute("students", DBManager.getStudents());
        return "home";
    }


    @GetMapping("/Add")
    public String adpage(Model model) {

        return "Add";
    }





    @PostMapping("/Add")
    public String add(@RequestParam String name,@RequestParam String surname,@RequestParam int exam) {

        if (exam > 90) {
            System.out.println("Salem");
            DBManager.add(name, surname, exam, "A");
        }

        return "redirect:/";
    }


}
