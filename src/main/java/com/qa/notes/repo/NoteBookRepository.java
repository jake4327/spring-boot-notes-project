package com.qa.notes.repo;

import com.qa.notes.domain.NoteBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
* What is Repository doing
* Meaning of Repository: a place where or receptacle in which things are or may be stored.
*
* Meaning in a technical sense: a central location in which data is stored and managed.
*
* Meaing in SpringBoot: @Repository is a Spring annotation that indicates that the decorated class is a repository.
*   A repository is a mechanism for encapsulating storage, retrieval,
*   and search behavior which emulates a collection of objects.
*   It is a specialization of the @Component annotation allowing
*   for implementation classes to be autodetected through
*   classpath scanning.
*  @author: http://zetcode.com/springboot/repository/
* */

/*
* Why is there a need for a repository for each class?
* GUESS - A repository is needed for each class because the data stored of the object type
*         needs to be separate because it would be confusing to keep the entities in the same
*          class as when auto-detection is enabled it allows for the search to take less time*/
@Repository
public interface NoteBookRepository extends JpaRepository<NoteBook, Long> {
}
