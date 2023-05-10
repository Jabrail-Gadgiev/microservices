package net.java.organizationservice.service.impl;

import lombok.AllArgsConstructor;
import net.java.organizationservice.dto.OrganizationDto;
import net.java.organizationservice.entity.Organization;
import net.java.organizationservice.repository.OrganizationRepository;
import net.java.organizationservice.service.OrganizationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;
    private ModelMapper modelMapper;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = modelMapper.map(organizationDto, Organization.class);
        Organization savedOrganization = organizationRepository.save(organization);
        OrganizationDto savedOrganizationDto = modelMapper.map(savedOrganization, OrganizationDto.class);
        return savedOrganizationDto;
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return modelMapper.map(organization, OrganizationDto.class);
    }
}
