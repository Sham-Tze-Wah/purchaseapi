package com.cinematicketsys.purchaseapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@RequestMapping("/")
@Controller
public class HomeController {

    @RequestMapping("/index")
    String index(Locale locale, Model model){
        UUID id = UUID.randomUUID();
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        System.out.println("Home Page Requested.");
        model.addAttribute("ID",id);
        model.addAttribute("Title", "Black Adam");
        model.addAttribute("ReleaseDate", formattedDate);
        model.addAttribute("Description", "A superhero story.");

        return "index";
    }
}
