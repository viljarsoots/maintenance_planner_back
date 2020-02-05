package com.maint.web.controllers;

//import com.knits.tms.beans.ModuleDto;
//import com.knits.tms.service.CourseService;
//import com.knits.tms.service.ModuleService;
import com.maint.web.beans.ResponseBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/rest/module")
@Slf4j
public class ModuleRestController {
//    @Autowired
//    private ModuleService moduleService;
//
//    @Autowired
//    private CourseService courseService;
//
//
//    @PostMapping(value = "/save",
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<String> saveCourseModule( @RequestBody ModuleDto moduleDto)  {
//        moduleService.save(moduleDto);
//        return new ResponseBean<>("Course module saved");
//    }

}
