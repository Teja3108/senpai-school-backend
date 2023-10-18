package com.senpai.senpaischoolbackend.Controller;
import com.senpai.senpaischoolbackend.Entity.Student;
import com.senpai.senpaischoolbackend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudents")
    public Student addStudents(@RequestBody Student student){
       return studentService.addStudents(student);



    }

    @GetMapping("allStudents")
    public List<Student> getallStudents(){

        return studentService.getAll();
    }

    @DeleteMapping("allStudents/{id}")
    public void deleteUser(@PathVariable int id){

        studentService.deleteUser(id);
    }






}
