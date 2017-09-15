package com.paris.backend.service;

import java.util.List;

import com.paris.backend.model.Organization;

public interface BasicInfoService {

	public List<Organization> findAllOrganization();
	public List<Organization> findOrganizationById(int id);


	public void deleteOrganizationById(int id);


	public void saveOrganization(Organization organization);

}