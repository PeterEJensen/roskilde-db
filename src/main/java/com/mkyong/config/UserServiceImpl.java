package com.mkyong.config;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    ArrayList<Student> students = new ArrayList<>();

    public UserServiceImpl() {
        students.add(new Student(0, "Peter", "Jensen", "12346578", new Date()));
        students.add(new Student(1, "John", "Snow", "12346578", new Date()));
        students.add(new Student(2, "Test person 3", "Generic last name", "12346578", new Date()));
        students.add(new Student(3, "Viggo", "donut", "12346578", new Date()));
        students.add(new Student(4, "test", "test", "12346578", new Date()));
    }

    @Override
    public ArrayList<Student> fetchAllUsers(){
        return students;
    }

}

