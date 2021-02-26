package jp.co.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.test.form.LoginForm;

@Controller
public class IndexFormController {

    @RequestMapping(value="/")
    public String index1(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }
    @RequestMapping(value="/index")
    public String index2(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @RequestMapping(value="/result", method=RequestMethod.POST)
    public String indexFormSubmit(@ModelAttribute LoginForm loginForm, Model model) {
        model.addAttribute("loginForm", loginForm);
        return "result";
    }
}
