package vandavv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AddController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView index() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");

        return modelAndView;
    }
}
