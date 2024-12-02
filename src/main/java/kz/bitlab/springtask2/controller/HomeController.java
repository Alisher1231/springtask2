package kz.bitlab.springtask2.controller;

import kz.bitlab.springtask2.db.DBManager;
import kz.bitlab.springtask2.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping
    public String homePage(Model model){

        model.addAttribute("students", DBManager.getStudents());
        return "home";
    }


    @GetMapping("/Add")
    public void add(@RequestBody String name, String surname,int exam){

        if(exam>90)
        DBManager.add(name,surname,exam,"A");

    }


}
