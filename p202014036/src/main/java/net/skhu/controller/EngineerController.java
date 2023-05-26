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
        return engineerRepository.findAllByOrderByIdAsc();
    }

    @RequestMapping("exam3")
    public List<Engineer> exam3() {
        return engineerRepository.findByNameStartsWith("이");
    }


}
