package toy.wolen02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogIn {

    @GetMapping("log-in")
    public String logIn(){
        return "log-in";
    }

}
