package com.cybertek.controller;

import com.cybertek.model.Gender;
import com.cybertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class studentController {

    Student marry = new Student("Marry","Jake", 23, Gender.FEMALE);
    Student herry = new Student("Herry","Smith", 25, Gender.MALE);
    Student james = new Student("James","Bond", 30, Gender.MALE);
    Student lily = new Student("Lily","Wang", 23, Gender.UNKNOWN);


    @GetMapping("/register")
    public String registerPage(Model model){
        List<Student>studentList = new ArrayList<>();
        studentList.add(marry);
        studentList.add(herry);
        studentList.add(james);
        studentList.add(lily);

        model.addAttribute("studentList",studentList);
        model.addAttribute("pageTitle","Registration");


        return "/student/register";
    }

    @GetMapping("/class")
    public String classPage(Model model){

        model.addAttribute("pageTitle","Class");

        return "/student/class";
    }

}


