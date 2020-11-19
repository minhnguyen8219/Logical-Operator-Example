package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @RequestMapping("/logical-operator-example")
    public String operatorExample() {
        return "logical-operator-example";
    }
}
