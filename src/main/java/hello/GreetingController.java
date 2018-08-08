package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    //ensures that http get requests to /greeting are mapped to the greeting method
    @GetMapping("/greeting") //directs content to greeting
    //@RequestParam binds values of query string param name to the name parameter of the greeting method
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //this makes the name attribute accessible to the view template by adding to the model
        model.addAttribute("name", name);
        return "greeting"; //this is required and returns you /greeting
    }
}
