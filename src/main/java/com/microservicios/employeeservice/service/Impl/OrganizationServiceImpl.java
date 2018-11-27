package com.microservicios.employeeservice.service.Impl;

import com.microservicios.employeeservice.repository.OrganizationRepository;
import com.microservicios.employeeservice.model.Organization;
import com.microservicios.employeeservice.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public Organization getOrganizationById(Long idOrganization) {
        Organization organization= organizationRepository.findById(idOrganization).orElse(new Organization());;
        return organization;
    }

    @Override
    public void save(String name) {
        Organization organization = new Organization();
        organization.setName(name);
        organizationRepository.save(organization);
    }
}
