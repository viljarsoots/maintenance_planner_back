package com.maint.web.controllers;

//import com.knits.tms.beans.CourseDto;
//import com.knits.tms.beans.CourseSearchDto;
//import com.knits.tms.service.CourseService;
//import com.knits.tms.util.BeanMappingUtils;
import com.maint.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@CrossOrigin
@RequestMapping("/rest/course")
public class CourseRestController {

//    @Autowired
//    private CourseService courseService;
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes= MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<String> moduleProcess(@RequestBody CourseDto courseDto) {
//        courseService.saveCourse(courseDto);
//        return new ResponseBean<>("Course Saved");
//    }
//
//    @RequestMapping(value = "/search", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes= MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<List<CourseDto>> courseSearch(@RequestBody CourseSearchDto courseSearchDto) {
//        List<CourseDto> courseDtos = courseService.searchCourses(courseSearchDto)
//                .stream()
//                .map(BeanMappingUtils::model2Dto)
//                .collect(Collectors.toList());
//        return new ResponseBean<List<CourseDto>>(courseDtos);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<CourseDto> find(@PathVariable Long id) {
//        CourseDto courseDto = courseService.findById(id);
//        return new ResponseBean<CourseDto>(courseDto);
//    }
//
//    @RequestMapping(value = "/edit", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes= MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<CourseDto> courseEditSubmit(@RequestBody CourseDto courseDto) {
//        courseService.updateCourse(courseDto);
//        return new ResponseBean<CourseDto>(courseDto);
//    }
}
