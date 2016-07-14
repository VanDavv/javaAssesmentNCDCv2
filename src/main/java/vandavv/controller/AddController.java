package vandavv.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOG = LoggerFactory.getLogger(AddController.class);

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView form() {
        LOG.debug("Recieved GET on /add endpoint");
        LOG.debug("Creating ModelAndView");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");

        LOG.debug("Returning prepared form");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addBook(@RequestParam("author") String author, @RequestParam("title") String title, @RequestParam("isbn") Integer isbn) {

        LOG.debug("Recieved POST on /add with parameters " + author + "; " + title + "; " + isbn);
        LOG.debug("Saving created entity to database");
        bookRepository.save(new Book(author, title, isbn));
        LOG.debug("Redirecting to /list page");
        return new ModelAndView(new RedirectView("/list", true));
    }
}