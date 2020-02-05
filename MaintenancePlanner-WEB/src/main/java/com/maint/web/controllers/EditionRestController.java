package com.maint.web.controllers;


//import com.knits.tms.beans.EditionDto;
//import com.knits.tms.service.EditionService;
import com.maint.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Controller
@RequestMapping("/rest/edition")
public class EditionRestController {

//    @Autowired
//    private EditionService editionService;
//
//    @RequestMapping(value = "/add/course", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<String> addEdition(@RequestBody EditionDto editionDto){
//        try {
//
//            editionService.save(editionDto);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return new ResponseBean<>("Edition added to Course with id");
//    }
}
