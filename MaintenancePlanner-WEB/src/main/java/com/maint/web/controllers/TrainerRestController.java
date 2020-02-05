package com.maint.web.controllers;


//import com.knits.tms.beans.TrainerDto;
//import com.knits.tms.beans.TrainerSearchDto;
//import com.knits.tms.model.Trainer;
//import com.knits.tms.service.TrainerService;
//import com.maint.web.beans.ResponseBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/rest/trainer")
@Slf4j
public class TrainerRestController {

//    @Autowired
//    private TrainerService trainerService;
//
//
//    @RequestMapping(value = "/search", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<List<TrainerDto>> searchTrainer(@RequestBody TrainerSearchDto trainerSearchDto) {
//        List<TrainerDto> results =trainerService.searchTrainer(trainerSearchDto);
//        return new ResponseBean<List<TrainerDto>>(results);
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<String> saveTrainer(@RequestBody TrainerDto trainerDto) {
//        trainerService.addTrainer(trainerDto);
//        return new ResponseBean<>("Trainer saved");
//    }
//
//    @RequestMapping(value = "/deactivate/{trainerId}", method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<String> deactivateTrainer(@PathVariable Long trainerId) {
//        trainerService.deActivate(trainerId);
//        return new ResponseBean<>("Trainer #" + trainerId + " deactivated");
//    }
//
//    @RequestMapping(value = "/edit", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<String> editTrainer(@RequestBody TrainerDto trainerDto){
//        trainerService.addTrainer(trainerDto);
//        return new ResponseBean<>("Trainer saved");
//    }


}
