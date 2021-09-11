package ar.com.noaamongo.noaa.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.noaamongo.noaa.entities.Boya;
import ar.com.noaamongo.noaa.models.response.GenericResponse;
import ar.com.noaamongo.noaa.service.BoyaService;


@RestController
public class BoyaController {

    @Autowired
    BoyaService boyaService;
    
    
    
    @PostMapping("api/boyas") 
    public ResponseEntity<?> crearBoya(@RequestBody Boya boya){
        
        GenericResponse respuesta = new GenericResponse();

        
        boyaService.crearBoya(boya); 

        respuesta.isOk = true;
        respuesta.id = boya.get_id().toHexString();
        respuesta.message = "Boya creada con exito";

        return ResponseEntity.ok(respuesta);

    }

    @GetMapping("api/boyas")
    public ResponseEntity<List<Boya>> traerBoyas() {
        List<Boya> lista = boyaService.traerBoyas();

        return ResponseEntity.ok(lista);
    }
}
