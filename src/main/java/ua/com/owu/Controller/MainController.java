package ua.com.owu.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ua.com.owu.editor.ProductEditor;
import ua.com.owu.entity.Product;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

@Controller
public class MainController {
@Autowired
private UserService userService;

@Autowired
private ProductEditor productEditor;


        @GetMapping("/")
        public String index (Model model){
            model.addAttribute("user",new User());

        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("user") User user){
    userService.save(user);
    return "index";
    }
    @InitBinder
    public void biner(WebDataBinder binder){
        binder.registerCustomEditor(Product.class,productEditor);
    }

}
