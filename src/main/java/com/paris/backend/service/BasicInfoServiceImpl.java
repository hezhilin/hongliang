package com.paris.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paris.backend.model.Organization;
import com.paris.backend.repository.OrganizationRepository;

@Service("basicInfoService")
public class BasicInfoServiceImpl implements BasicInfoService{


	@Autowired
	private OrganizationRepository organizationRepository;
	

	@Override
	public List<Organization> findAllOrganization() {
		return organizationRepository.findAll();
	}
	@Override
	public void deleteOrganizationById(int id) {
		organizationRepository.removeById(id);
		
	}

	@Override
	public void saveOrganization(Organization organization) {
		this.organizationRepository.save(organization);

	}

	@Override
	public List<Organization> findOrganizationById(int id) {
		return organizationRepository.findOrganizationById(id);
	}
}