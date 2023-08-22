package toy.wolen02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LogIn {

    @GetMapping("log-in")
    public String logIn(){
        return "log-in";
    }

    @GetMapping("main")
    public String main(Model model, @RequestParam("loginId") String loginId){
        model.addAttribute("data", loginId);
        return "main-page";
    }


}
