package com.maint.web.controllers;


import com.maint.core.beans.UserDto;
import com.maint.core.model.User;
import com.maint.core.service.UserService;
import com.maint.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/rest")
public class UserRestController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody UserDto userDto) throws IOException {

               userService.save(userDto);
        return new ResponseBean<>("User Saved");
    }


    @RequestMapping(value = "/user", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<List<User>> findAll() {
        List<User> user = userService.findAll();
        return new ResponseBean<List<User>>(user);

    }
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
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<Optional<User>> find(@PathVariable Long id) {
        Optional<User> userDto = userService.findById(id);
        return new ResponseBean<Optional<User>>(userDto);
    }
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
