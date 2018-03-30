package com.swole.swolemvc.controllers;

import com.swole.swolemvc.models.ORM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ORMController {

    Logger log = LoggerFactory.getLogger(this.getClass());
    @RequestMapping (value="/form", method=RequestMethod.GET)
    public String ormForm(Model model){
        model.addAttribute("orm", new ORM());
        return "form";
    }
    @RequestMapping(value="/form", method=RequestMethod.POST)
    public String ormSubmit (@ModelAttribute ORM orm, Model model) {
        model.addAttribute("orm", orm);
        String info = String.format("ORM Submission: id=%d, deadlift=%s, squat=%s, overheadpress=%s, benchpress=%s, bentoverrow=%s",
                orm.getId(), orm.getBenchpress(), orm.getSquat(), orm.getDeadlift(), orm.getBentoverrow(), orm.getOverheadpress());
        log.info(info);
        return "result";
    }
    }



