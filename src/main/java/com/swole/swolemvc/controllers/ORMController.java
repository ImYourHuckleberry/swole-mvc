package com.swole.swolemvc.controllers;

import com.swole.swolemvc.models.ORM;
import com.swole.swolemvc.models.data.*;
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
        private ORMDao oRMDao;

        @RequestMapping(value="" )
        public String index(Model model){

            model.addAttribute("orms", oRMDao.findAll());
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
            oRMDao.save(newORM);
            return"redirect:";
        }

        // @RequestMapping (value="workout", method=RequestMethod.GET)
        //public String processWorkoutForm ()
/**
        @RequestMapping(value = "remove", method = RequestMethod.GET)
        public String displayRemoveForm(Model model) {
            model.addAttribute("oRMs", oRMDao.findAll());
            model.addAttribute("title", "Remove One Rep Max");
            return "swole/remove";
        }

        @RequestMapping(value = "remove", method = RequestMethod.POST)
        public String processRemoveForm(@RequestParam int[] oRMIds) {

            for (int oRMId : oRMIds) {
                oRMDao.delete(oRMId);
            }

            return "redirect:";
        }
**/
    }


