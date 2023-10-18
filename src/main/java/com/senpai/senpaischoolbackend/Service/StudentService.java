package com.senpai.senpaischoolbackend.Service;

import com.senpai.senpaischoolbackend.Entity.Student;
import com.senpai.senpaischoolbackend.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudents(Student student) {

        return studentRepository.save(student);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }


    public void deleteUser(int id) {

        studentRepository.deleteById(id);
    }
}
