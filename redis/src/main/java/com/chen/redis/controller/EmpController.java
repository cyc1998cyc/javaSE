package com.chen.redis.controller;

import com.chen.redis.entities.Emp;
import com.chen.redis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("/emp")
    public String addEmp(Emp emp){
        empService.add(emp);
        return "add OK";
    }

    @GetMapping("/emp/{id}")
    public synchronized Object getEmpById(@PathVariable("id") Integer id){
        ExecutorService es = Executors.newFixedThreadPool(200);

        for (int i = 0; i < 500; i++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                    empService.getEmpById(id);
                }
            });
        }




        return empService.getEmpById(id);
    }
}
