package com.maint.web.controllers;


import com.maint.core.beans.MachineProducerDto;
import com.maint.core.model.MachineProducer;
import com.maint.core.service.MachineProducerService;
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
public class MachineProducerController {

    @Autowired
    private MachineProducerService machineProducerService;

    @RequestMapping(value = "/machineProducer/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody MachineProducerDto machineProducerDto) throws IOException {

        machineProducerService.save(machineProducerDto);
        return new ResponseBean<>("Machineproducer Saved");
    }
    @RequestMapping(value = "/machineProducer", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<List<MachineProducer>> findAll() {
        List<MachineProducer> machineProducers = machineProducerService.findAll();
        return new ResponseBean<List<MachineProducer>>(machineProducers);

    }
    @RequestMapping(value = "/machineProducer/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<Optional<MachineProducer>> find(@PathVariable Long id) {
        Optional<MachineProducer> machine = machineProducerService.findById(id);
        return new ResponseBean<Optional<MachineProducer>>(machine);
    }

}
