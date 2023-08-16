package ms.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControlladorPrueva {
    @GetMapping("/index")
    public String prueva(){
        return "hola momo";
    }
}
