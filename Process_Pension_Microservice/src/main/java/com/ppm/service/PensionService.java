package com.ppm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppm.entity.Details;
import com.ppm.entity.Pension;
import com.ppm.repo.DetailsRepo;
import com.ppm.repo.PensionRepo;

@Service
public class PensionService implements IPensionService{
	
	@Autowired
	PensionRepo pensionRepo;
	
	@Autowired
	DetailsRepo detailsRepo;

	@Override
	public Pension getPensionDetails(Long aadhar) {
		Integer amount=null;
		Integer charge=null;
		Details pensionerdetails=detailsRepo.getById(aadhar);
		if(pensionerdetails.getPensionType().equalsIgnoreCase("Self")) {
			amount=((pensionerdetails.getSalaryEarned()/100)*80)+pensionerdetails.getAllownces();
		}
		if(pensionerdetails.getPensionType().equalsIgnoreCase("Family")) {
			amount=((pensionerdetails.getSalaryEarned()/100)*50)+pensionerdetails.getAllownces();
		}
		if(pensionerdetails.getBankType().equalsIgnoreCase("Public")) {
			charge=500;
		}
		if(pensionerdetails.getBankType().equalsIgnoreCase("Private")) {
			charge=550;
		}
		Pension pension=new Pension(aadhar, amount, charge);
		pensionRepo.save(pension);
		return pension;
	}

}
