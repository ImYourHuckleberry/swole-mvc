package com.swole.swolemvc.controllers;


import com.swole.swolemvc.models.ORM;
import com.swole.swolemvc.models.RepCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import com.swole.swolemvc.models.data.ORMDao;



import javax.validation.Valid;

    @Controller
    @RequestMapping("swole")
    public class ORMController {
        @Autowired
        private ORMDao ormDao;


        @RequestMapping(value="" )
        public String index(Model model){

            model.addAttribute("orm", ormDao.findMostRecent());
            //if this is bad its the sql i wrote, and if it always gives same one we shouldnt order by desc

            model.addAttribute("title", "One Rep Max");
            return "swole/index";
        }


        @RequestMapping(value="form", method = RequestMethod.GET)
        public String displayFormForm(Model model){
            model.addAttribute("orm", "Add One Rep Max");
            model.addAttribute(new ORM());


            return "swole/form";


        }
        @RequestMapping(value="form", method= RequestMethod.POST)
        public String processFormForm(@ModelAttribute @Valid ORM newORM,
                                         Errors errors, Model model){
            if (errors.hasErrors()){
                model.addAttribute("orm", "Add One Rep Max");
                return "swole/form";
            }
            ormDao.save(newORM);
            return"redirect:";
        }

        @RequestMapping (value="workout", method= RequestMethod.GET)
        public String displayWorkoutForm(Model model) {
            model.addAttribute("title", "Your Daily Lifts");
            model.addAttribute("rep", RepCalculator.Lift(ormDao.findMostRecent()));
            return "swole/workout";

        }


        }

