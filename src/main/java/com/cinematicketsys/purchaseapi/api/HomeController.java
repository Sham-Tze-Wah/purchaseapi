package com.cinematicketsys.purchaseapi.api;

import com.cinematicketsys.purchaseapi.model.Movie;
import com.cinematicketsys.purchaseapi.services.HomeService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.*;

@RestController
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }


    //@GetMapping//value="api/index", method= RequestMethod.GET)
    public String index(){
        //UUID id = UUID.randomUUID();
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//

//        String formattedDate = dateFormat.format(date);
//        //System.out.println("Home Page Requested.");
        //model.addAttribute("ID",id);
        System.out.println("Hey bro");
        return "index";
//        model.addAttribute("Title", "Black Adam");
//        model.addAttribute("ReleaseDate", formattedDate);
//        model.addAttribute("Description", "A superhero story.");

    }

    //@GetMapping
    public List<Movie> displayAllMovieDetails(){
        return homeService.displayAllMovieDetails();
    }

    @RequestMapping("/add")
    public String display(){
        System.out.println("This is working LOL");
        return "aboutUs.jsp";
    }
}
