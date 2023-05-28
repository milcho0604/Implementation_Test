package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.entity.Engineer;
import net.skhu.repository.EngineerRepository;

@RestController
public class EngineerController {
    @Autowired
    private EngineerRepository engineerRepository;

    @RequestMapping("exam1")
    public List<Engineer> exam1() {
        return engineerRepository.findAll();
    }

    @RequestMapping("exam2")
    public List<Engineer> exam2() {
        return engineerRepository.findByRoleId(1);
    }

    @RequestMapping("exam3")
    public List<Engineer> exam3() {
        return engineerRepository.findByNameStartsWith("이");
    }

    @RequestMapping("exam4")
    public List<Engineer> exam4() {
        return engineerRepository.findByNameStartsWith("이");
    }


}
