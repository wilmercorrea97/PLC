package com.Invertec.TEST.controllers;

import com.Invertec.TEST.PLCService;
import com.Invertec.TEST.models.DatosJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PLCController {

    private final PLCService plcService;

    @Autowired
    public PLCController(PLCService plcService){
        this.plcService = plcService;
    }

    @GetMapping("/datos-join")
    public List<DatosJoin> obtenerDatosJoin(){
        return plcService.obtenerDatosJoin();
    }

}
