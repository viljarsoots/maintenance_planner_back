package com.maint.web.controllers;



import com.maint.core.beans.MachineDto;
import com.maint.core.model.Machine;
import com.maint.core.service.MachineService;
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
public class MachineRestController {

    @Autowired
    private MachineService machineService;

    @RequestMapping(value = "/machine/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody MachineDto machineDto) throws IOException {

        machineService.save(machineDto);
        return new ResponseBean<>("Customer Saved");
    }

    @RequestMapping(value = "/machine", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<List<Machine>> findAll() {
        List<Machine> machines = machineService.findAll();
        return new ResponseBean<List<Machine>>(machines);

    }
    @RequestMapping(value = "/machine/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<Optional<Machine>> find(@PathVariable Long id) {
        Optional<Machine> machine = machineService.findById(id);
        return new ResponseBean<Optional<Machine>>(machine);
    }

}
