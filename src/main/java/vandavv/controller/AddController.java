package vandavv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import vandavv.model.Book;
import vandavv.repository.BookRepository;

@RestController
public class AddController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView form() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView add(@RequestParam("author") String author, @RequestParam("title") String title, @RequestParam("isbn") Integer isbn) {

        bookRepository.save(new Book(author, title, isbn));
        return new ModelAndView(new RedirectView("/list", true));
    }
}