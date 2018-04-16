package com.swole.swolemvc.controllers;


import com.swole.swolemvc.models.data.RepDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("swole")
public class RepController {
    @Autowired
    private RepDao repDao;

    @RequestMapping (value="")
    pubic int index(Model model){
        model.addAttribute("reps", repDao.findAll());
        model.addAttribute("title", "Rep");
        return "swole/workout";
    }
}

