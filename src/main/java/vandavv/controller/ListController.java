package vandavv.controller;

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

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");

        List<Book> bookList = new ArrayList<>();
        bookRepository.findAll().forEach(bookList::add);
//                Arrays.asList(
//                        new Book("Altuğ B. Altıntaş", "Java ve Yazılım Tasarımı", 35),
//                        new Book("Rahman Usta", "Java Mimarisiyle Kurumsal Çözümler", 23),
//                        new Book("Rifat Çölkesen", "Veri Yapıları ve Algoritmalar", 40),
//                        new Book("Rifat Çölkesen", "Veri Yapıları ve Algoritmalar", 40)
//                );

        modelAndView.addObject("books", bookList);

        return modelAndView;
    }
}
