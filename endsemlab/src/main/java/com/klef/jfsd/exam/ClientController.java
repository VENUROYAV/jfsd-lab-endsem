package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

	@RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/showInfo")
    public ModelAndView showInfo(@RequestParam("id") int id, @RequestParam("name") String name) {
        ModelAndView mv = new ModelAndView("showInfo");
        mv.addObject("id", id);
        mv.addObject("name", name);
        return mv;
    }

    @RequestMapping("/calculateSum/{num1}/{num2}")
    public ModelAndView calculateSum(@PathVariable int num1, @PathVariable int num2) {
        ModelAndView mv = new ModelAndView("calculateSum");
        mv.addObject("sum", num1 + num2);
        return mv;
    }

    @RequestMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    @RequestMapping("/addNumbers")
    public ModelAndView addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        ModelAndView mv = new ModelAndView("addNumbers");
        mv.addObject("sum", num1 + num2);
        return mv;
    }

    @RequestMapping("/combine")
    public ModelAndView combine(@RequestParam("str1") String str1, @RequestParam("str2") String str2) {
        ModelAndView mv = new ModelAndView("combine");
        mv.addObject("combinedString", str1 + " " + str2);
        return mv;
    }

    @RequestMapping("/calculate")
    public ModelAndView calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        ModelAndView mv = new ModelAndView("calculate");
        mv.addObject("sum", num1 + num2);
        mv.addObject("product", num1 * num2);
        return mv;
    }
}
