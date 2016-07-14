package vandavv.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import vandavv.model.Book;
import vandavv.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListController {

    private static final Logger LOG = LoggerFactory.getLogger(ListController.class);

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView getAllBooks() {
        LOG.debug("Recieved GET on /list endpoint");
        LOG.debug("Creating ModelAndView");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");

        LOG.debug("Getting all data from database");
        List<Book> bookList = new ArrayList<>();
        bookRepository.findAll().forEach(bookList::add);

        LOG.debug("Adding data to template");
        modelAndView.addObject("books", bookList);

        LOG.debug("Returning prepared response");
        return modelAndView;
    }
}
