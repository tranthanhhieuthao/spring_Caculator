package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {

    @GetMapping("")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("result")
    public String result(@RequestParam float firstNumber, float secondNumber,
                         String Conculator,
                         Model model){
if (Conculator.equals("Addition(+)")) {
    model.addAttribute("result", firstNumber + secondNumber);
    model.addAttribute("kq", Conculator);
}
else if (Conculator.equals("Subtraction(-)")){
    model.addAttribute("result", firstNumber - secondNumber);
    model.addAttribute("kq", Conculator);
}
else if (Conculator.equals("Multiplication(x)")){
    model.addAttribute("result", firstNumber * secondNumber);
    model.addAttribute("kq", Conculator);
}
else {
    model.addAttribute("result", firstNumber /secondNumber);
    model.addAttribute("kq", Conculator);
}
        return "Result";
    }


}
