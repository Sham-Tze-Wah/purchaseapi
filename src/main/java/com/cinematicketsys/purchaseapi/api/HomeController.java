package com.cinematicketsys.purchaseapi.api;

import com.cinematicketsys.purchaseapi.services.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@RequestMapping("/index")
@Controller
public class HomeController {

//    private final HomeService homeService;
//
//    public HomeController(HomeService homeService) {
//        this.homeService = homeService;
//    }

    @RequestMapping("/index")
    ModelAndView index(Locale locale){
        UUID id = UUID.randomUUID();
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        ModelAndView model = new ModelAndView();
        model.setViewName("index.jsp");
        //System.out.println("Home Page Requested.");
        model.addObject("ID",id);
        model.addObject("Title", "Black Adam");
        model.addObject("ReleaseDate", formattedDate);
        model.addObject("Description", "A superhero story.");

        return model;
    }
}
