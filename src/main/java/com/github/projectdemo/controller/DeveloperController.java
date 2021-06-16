package com.github.projectdemo.controller;

import com.github.projectdemo.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzz
 * @create 2021-06-15 17:32
 */
@RestController
@RequestMapping("/api/developers")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;

    @GetMapping("/")
    public ResponseEntity getList() {

        return ResponseEntity.ok(developerService.getList());

    }

}
