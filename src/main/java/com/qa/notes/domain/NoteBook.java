package com.qa.notes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//What is entity doing?
// It make an entity
// What is an the @entity descorator?
// An entity is a THING(noun) - e.g. NOTE, NOTEBOOK, LOVE
// An entity is represent in sql to represent something(noun) in a table -
@Entity
public class NoteBook {

    //Look at Note for what these tags do
    @Id
    @GeneratedValue
    private Long id;

    //Column can be the same
    @Column
    private String name;

    /*  @description
     * Constructor for notebook that doesn't have any arguments passed
     * why was the old coding convention to use super() in this method?
     *  super is creating a constructor for the super method, this class doesn't
     *  extend a class GUESS the class is inheriting from the @Entity method
    */
    public NoteBook() {
        super();
    }

    /*
    * Notebook constructor
    */
    public NoteBook(String name) {
        this.name = name;
    }

    /*==========GETTER-SETTERS=================*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*==========GETTER-SETTERS=================*/
}
