package com.microservicios.employeeservice.controller;

import com.microservicios.employeeservice.model.Organization;
import com.microservicios.employeeservice.service.OrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private OrganizationService organizationService;

    @GetMapping(value = "/get")
    public ResponseEntity<Organization> getOrganization(@RequestParam Long idOrganization){
        return new ResponseEntity<Organization>(organizationService.getOrganizationById(idOrganization),HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<HttpStatus> saveOrganization(@RequestParam String name){

        log.info("Saving organizacion with name "  + name);

        organizationService.save(name);

        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

}
