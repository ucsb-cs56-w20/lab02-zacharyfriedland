package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
        /*String html = "<h1>Hello World!</h1>\n" +
            "<p>This web app is powered by \n" +
            "<a href='https://github.com/ucsb-cs56-w20/lab02-zacharyfriedland'>this github repo</a></p>\n";
            return html;
            */
    }
    
}
