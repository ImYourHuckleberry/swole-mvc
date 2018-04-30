package com.swole.swolemvc.controllers;

import com.swole.swolemvc.models.Note;
import com.swole.swolemvc.models.data.NoteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("note")
public class NoteController {
    @Autowired
    private NoteDao noteDao;

    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("note", noteDao.findAll());
        return "note/index";
    }
    @RequestMapping(value="form", method = RequestMethod.GET)
    public String displayFormForm (Model model){
        model.addAttribute("note", "Add a Note");
        model.addAttribute(new Note());
        return"note/form";
    }
    @RequestMapping(value="form", method = RequestMethod.POST)
    public String displayFormForm(@ModelAttribute @Valid Note newNote, Errors
                                  errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("note", "Add a New Note");
            return "note/form";
        }
        noteDao.save(newNote);
        return"redirect:";
    }
}
