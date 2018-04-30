package com.swole.swolemvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class Note {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    public String noteTitle;
    @NotNull
    public String noteBody;
    public Note(String noteBody, String noteTitle){
        this.noteBody=noteBody;
        this.noteTitle=noteTitle;
    }
    public Note(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }
}
