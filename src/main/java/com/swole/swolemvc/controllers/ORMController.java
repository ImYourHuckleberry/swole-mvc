package com.swole.swolemvc.controllers;

import com.swole.swolemvc.models.Deadlift;
import com.swole.swolemvc.models.ORM;
import com.swole.swolemvc.models.data.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping ("form")
//might have to change to "form"
public class ORMController {
    @Autowired
    private DeadliftDao deadliftDao;
    private OverHeadPressDao overHeadPressDao;
    private BenchPressDao benchPressDao;
    private SquatDao squatDao;
    private BentOverRowDao bentOverRowDao;

    @RequestMapping(value="" )
    public String index(Model model){

        model.addAttribute("deadlift", deadliftDao.findAll());
        model.addAttribute("overheadpress", overHeadPressDao.findAll());
        model.addAttribute("squat", squatDao.findAll());
        model.addAttribute("benchpress", benchPressDao.findAll());
        model.addAttribute("bentoverrow", bentOverRowDao.findAll());

        model.addAttribute("title", "One Rep Max");
        return "index";
    }

    @RequestMapping (value="/form", method=RequestMethod.GET)
    public String ormForm(Model model){
        model.addAttribute("Deadlift", "Add Deadlift");
        model.addAttribute(new Deadlift());
        return "form";
    }
    @RequestMapping(value="/form", method=RequestMethod.POST)
    public String ormSubmit (@ModelAttribute  Deadlift newDeadlift, Model model) {
        model.addAttribute("deadlift", "Add deadlift");

        deadliftDao.save(newDeadlift);
        return "result";
    }
    }



