package com.microservicios.employeeservice.service;

import com.microservicios.employeeservice.model.Organization;

public interface OrganizationService {

    public Organization getOrganizationById(Long idOrganization);

    public void save(String name);
}
