package net.java.organizationservice.service;

import net.java.organizationservice.dto.OrganizationDto;
import net.java.organizationservice.entity.Organization;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);
    OrganizationDto getOrganizationByCode(String organizationCode);
}
