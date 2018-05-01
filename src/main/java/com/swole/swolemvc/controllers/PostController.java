package com.swole.swolemvc.controllers;

import com.swole.swolemvc.models.Post;
import com.swole.swolemvc.models.data.PostDao;
import com.swole.swolemvc.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller

public class PostController {
    @Autowired
    private PostDao postDao;

    @RequestMapping("/posts/view/{id}")
    public String view(@PathVariable("id") Long id, Model model){

        model.addAttribute("post",postDao.findAll());
        return"posts/view";
    }
    @RequestMapping(value="/posts/add", method= RequestMethod.GET)
    public String newAddForm(Model model){
        model.addAttribute(new Post());

        return "posts/add";

    }
    @RequestMapping(value="/posts/add", method=RequestMethod.POST)
    public String newAdd(@ModelAttribute  Post newPost, Model model){
        postDao.save(newPost);
        return"posts/add";
    }

}
