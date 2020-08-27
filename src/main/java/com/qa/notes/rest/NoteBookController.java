package com.qa.notes.rest;

import com.qa.notes.domain.Note;
import com.qa.notes.domain.NoteBook;
import com.qa.notes.service.NoteBookService;
import com.qa.notes.service.NoteService;
import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.processing.SupportedOptions;
import javax.websocket.server.PathParam;
import java.util.List;

/*
* What is @RestController doing?
* It is decorating the class so that class has rest controller functionality
* What is controller functionality?
* Spring tutorial:  @RestController is a convenience annotation for creating Restful controllers.
*  It is a specialization of @Component and is autodetected through classpath scanning.
* It adds the @Controller and @ResponseBody annotations. It converts the response to JSON or XML.
*  It does not work with the view technology, so the methods cannot return ModelAndView.
* It is typically used in combination with annotated handler methods based on the @RequestMapping annotation.
* The @Controller annotation is used with the view technology.
* @author: http:*zetcode.com/springboot/restcontroller/
* What is a RESTful controller?
*   What is a controller?
*       "Controllers allow for external access to a Spring application via HTTP requests."
*       @author: https:*portal.qa-community.co.uk/~/cne/learning/springboot/spring--controllers
*   A RESTful controller is A RESTFul application follows the REST architectural style,
*   which is used for designing networked applications. RESTful applications generate HTTP requests performing
*   CRUD (Create/Read/Update/Delete) operations on resources. RESTFul applications typically return data in
*   JSON or XML format.
*   @author: http:*zetcode.com/springboot/restcontroller/
*   What is the REST architecture?
*       A RESTful Web service, requests made to a resource's URI will elicit a response with a payload formatted in
*       HTML, XML, JSON, or some other format. The response can confirm that some alteration has been made to the
*       resource state, and the response can provide hypertext links to other related resources. When HTTP is used,
*       as is most common, the operations (HTTP methods) available are GET, HEAD, POST, PUT, PATCH, DELETE, CONNECT,
*       OPTIONS and TRACE.
*       @author: https:*en.wikipedia.org/wiki/Representational_state_transfer
*/
@RestController
public class NoteBookController {
/*
    *Creating an object of the noteBookService
    *Why are you creating an object of noteBookService?
    * If the controller is responsible for external access to the spring application then
    * it must have an object that allows it to move things into the application.
    * Do controllers send things back with the post method?
    *  Must do as this class has a @PostMapping decorator
    *   In the defintion there are other REQUEST methods e.g. Patch etc. do you think spring has
    *   these as decorators?
    *     Don't know try? 
    *      - found some down below
    *
 */
    private final NoteBookService noteBookService;

    /*
    * What is @Autowired decorator?
    *   It is a way for the autodection to be able to assign variables
    *   to an object without initializing it for example laptop may have
    *   a samsung hard drive what if I continuously want to create laptops
    *   with different hard drives then instead of making a new obj of lap
    *   Can you assign two objects with a different hard drive using autowiring
    *   How do you do this?
    *       - Watch the video on youtube
    * */
    @Autowired
    public NoteBookController(NoteBookService noteBookService) {
        this.noteBookService = noteBookService;
    }

    /*=============GET,POST,DELETE============*/

    @GetMapping("/getAllNoteBooks")
    public List<NoteBook> getAllNoteBooks(){
        return this.noteBookService.readAllNoteBooks();
    }

    @PostMapping("/createNoteBook")
    public NoteBook createNoteBook(@RequestBody NoteBook noteBook){
        return this.noteBookService.createNoteBook(noteBook);
    }

    @DeleteMapping("/deleteNoteBook/{id}")
    public Boolean deleteNoteBooks(@PathVariable Long id){
        return this.noteBookService.deleteNoteBookById(id);
    }
    /*===============GET,POST,DELETE===============*/


    /*GET, HEAD, POST, PUT, PATCH, DELETE, CONNECT OPTIONS and TRACE.
    Found some of these
    What do each of them do?
    @PatchMapping
    @RequestHeader
    @PutMapping
    public void setTRACE(and TRACE) {
        this.TRACE = TRACE;
    }*/

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 894329d123bc94a5c136e5736933c244a1c2f7f7
    @GetMapping("/getNoteBookById/{id}")
    public NoteBook getNoteBookById(@PathVariable Long id){
        return this.noteBookService.findNoteBookById(id);
    }

    @PutMapping("/updateNoteBook/{id}")
    public NoteBook updateNoteBook(@PathVariable Long id, @RequestBody NoteBook noteBook){
        return this.noteBookService.updateNoteBook(id, noteBook);
    }
<<<<<<< HEAD
>>>>>>> 314f0b01a67aad9426f8f06ede285dcc4eb4bd3a
=======
>>>>>>> 894329d123bc94a5c136e5736933c244a1c2f7f7

    /*
*    @GetMapping("/getNoteById/{id}")
*    public Note getNoteById(@PathVariable Long id){
*        return this.noteService.findNoteById(id);
*    }
*
*    @PutMapping("/updateNote/{id}")
*    public Note updateNote(@PathVariable Long id, @RequestBody Note note){
*        return this.noteService.updateNote(id, note);
*    }
*
*    @PutMapping("/updateNoteWithPathParam")
*    public Note updateNoteWithPathParam(@PathParam("id") Long id, @RequestBody Note note){
*        * localhost:8080/updateNoteWithPathParam?id=1
*        return this.noteSecreatervice.updateNote(id, note);
*    }
*/
}
