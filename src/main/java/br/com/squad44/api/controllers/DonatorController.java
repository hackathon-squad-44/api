package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.dto.DonatorDTO;
import br.com.squad44.api.services.DonatorService;

@RestController
@RequestMapping("/donator")
public class DonatorController {
    
    @Autowired
    DonatorService service;
    
    @GetMapping("/{id}")
    public ResponseEntity<DonatorDTO> getById(@PathVariable Long id) {
    	return service.getById(id);
    }

}
