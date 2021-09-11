package ar.com.noaamongo.noaa.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.noaamongo.noaa.entities.Boya;
import ar.com.noaamongo.noaa.repos.BoyaRepository;

@Service
public class BoyaService {
    
    @Autowired
    BoyaRepository repo;
  
    public void crearBoya(Boya boya) {
        repo.save(boya);

    }

    public List<Boya> traerBoyas() {
        return repo.findAll();
    }




}
