package vandavv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Foo! I'm alive";
    }
}
