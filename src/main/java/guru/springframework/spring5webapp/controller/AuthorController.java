/*
 * Created by Eduardo Studzinski Estima de Castro - 11/9/2018.
 *
 */

/*
 * Created by Eduardo Studzinski Estima de Castro - 11/9/2018.
 *
 */

package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController (AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
