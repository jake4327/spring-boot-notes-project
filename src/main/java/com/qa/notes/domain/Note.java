package com.qa.notes.domain;

import javax.persistence.*;


@Entity
public class Note {

    //What is this doing?
    //  It creates an id for the class and allows it to be generated every time the class is  constructed
    @Id
    @GeneratedValue
    private Long id;

    //What is this doing?
    // Creates a variable title and makes it into a column.
    // Defines a column in an sql table
    @Column
    private String title;

    //What is this doing?
    // Creates a variable description and make it into a column.
    // defines a column in our H2 data in an sql format
    @Column
    private String description;


    @ManyToOne(targetEntity = NoteBook.class)
    private NoteBook noteBook;


    //A constructor of Note allows the creation of a note object so that
    //When an object of note is created it doesn't need any parameters passed to it
    public Note() {
    }

    //A constructor of Note allows the creation of a note object with two
    //parameters pasted to it
    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //=============== GET AND SET METHODS ========================
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    //================ GET AND SET METHODS ========================

    public NoteBook getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(NoteBook noteBook) {
        this.noteBook = noteBook;
    }
}
