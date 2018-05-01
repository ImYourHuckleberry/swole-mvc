package com.swole.swolemvc.controllers;

import com.swole.swolemvc.models.Post;
import com.swole.swolemvc.models.data.PostDao;
import com.swole.swolemvc.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;
import java.util.List;
import java.util.stream.Collectors;

@Controller

@RequestMapping("home")
public class HomeController {
    @Autowired
    private PostDao postDao;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("posts", postDao.findAll());

        return "home/index";
    }

}
