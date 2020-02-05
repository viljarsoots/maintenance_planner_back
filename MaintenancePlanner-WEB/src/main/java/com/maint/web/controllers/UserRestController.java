package com.maint.web.controllers;

import com.maint.core.dao.UserDao;
import com.maint.core.beans.UserDto;
import com.maint.core.model.User;
import com.maint.core.service.UserService;
import com.maint.core.utils.BeanUtils;
import com.maint.core.utils.Mocks;
import com.maint.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@CrossOrigin
@RequestMapping("/rest/user")
public class UserRestController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody UserDto userDto) {
       User newUser = BeanUtils.dto2Model(userDto);
               userDao.save(newUser);
        return new ResponseBean<>("User Saved");
    }
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
    @RequestMapping(value = "/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<UserDto> find(@PathVariable Long id) {
        UserDto userDto = userService.findById(id);
        return new ResponseBean<UserDto>(userDto);
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
