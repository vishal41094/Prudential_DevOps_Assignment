package de.ykoer.examples.hello.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerRedirect {

    @RequestMapping(value = "/")
    public String index() {
        return "redirect:swagger-ui.html";
    }
}
