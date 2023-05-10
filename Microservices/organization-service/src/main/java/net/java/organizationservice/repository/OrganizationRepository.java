package net.java.organizationservice.repository;

import net.java.organizationservice.dto.OrganizationDto;
import net.java.organizationservice.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByOrganizationCode(String organizationCode);
}
