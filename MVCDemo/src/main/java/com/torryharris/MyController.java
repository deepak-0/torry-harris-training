package com.torryharris;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyController {

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        // int num1=Integer.parseInt(request.getParameter("user"));
        // int num2=Integer.parseInt(request.getParameter("pass"));
        String s1 = request.getParameter("user");
        String s2 = request.getParameter("pass");

        ModelAndView mv = new ModelAndView();
        if (s1.equals("admin") && s2.equals("1234")) {

            mv.setViewName("success.jsp");
            mv.addObject("user",s1);
        } else {
            mv.setViewName("failure.jsp");
        }
        return mv;
    }
}
//    @RequestMapping("/sub")
//    public ModelAndView sub(HttpServletRequest request, HttpServletResponse response){
//        int num1=Integer.parseInt(request.getParameter("num1"));
//        int num2=Integer.parseInt(request.getParameter("num2"));
//        int result=num1-num2;
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("result.jsp");
//        mv.addObject("result",result);
//        return mv;
 //   }
//}
