package com.atuluttam.mvcaddtwonumbers.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/add")
    public String formpage()
    {
        return "add";
    }
    @RequestMapping("/addnumber")
    public String add(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b, Model m)
{
    Integer c = a+b;
    m.addAttribute("total", c);
    return "add";
}





@RequestMapping("/div")
    public String divform()
{
    return "divform";
}

@RequestMapping("/divresult")
public String divresult(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b,  Model m)
{

    m.addAttribute("num1", a );
    m.addAttribute("num2", b);
    Integer c = a/b;
    m.addAttribute("d", c);
    return "result";
}


}
