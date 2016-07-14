package vandavv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AddController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView form() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestParam("author") String author, @RequestParam("title") String title, @RequestParam("isbn") Integer isbn) {

        return "ok: " + author + "; " + title + "; " + isbn;
    }
}