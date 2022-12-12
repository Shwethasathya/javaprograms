package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {

		IplRepository iplRepository = new IplRepositoryImpl();

		IplDTO dto1 = new IplDTO();
		dto1.setCaptain("virat kohli");
		dto1.setTeamName("RCB");
		dto1.setOwnerAlive(true);
		dto1.setDefeats(113);
		dto1.setPurse(80);
		dto1.setWin(107);
		dto1.setCreatedBy("SYSTEM");
		dto1.setCreatedDate(LocalDateTime.now());

		IplDTO dto2=new IplDTO();
		dto2.setCaptain("MS Dhoni");
		dto2.setTeamName("CSK");
		dto2.setOwnerAlive(true);
		dto2.setDefeats(90);
		dto2.setPurse(86);
		dto2.setWin(121);
		dto2.setCreatedBy("SYSTEM");
		dto2.setCreatedDate(LocalDateTime.now());

		IplDTO dto3=new IplDTO();
		dto3.setCaptain(" Rishabh Pant");
		dto3.setTeamName("Delhi capitals");
		dto3.setOwnerAlive(true);
		dto3.setDefeats(118);
		dto3.setPurse(86);
		dto3.setWin(100);
		dto3.setCreatedBy("SYSTEM");
		dto3.setCreatedDate(LocalDateTime.now());
		
		IplDTO dto4=new IplDTO();
		dto4.setCaptain("Shreyas Iyer");
		dto4.setTeamName("Kolkata Knight Riders");
		dto4.setOwnerAlive(true);
		dto4.setDefeats(106);
		dto4.setPurse(86);
		dto4.setWin(113);
		dto4.setCreatedBy("SYSTEM");
		dto4.setCreatedDate(LocalDateTime.now());
		
		IplDTO dto5=new IplDTO();
		dto5.setCaptain("Rohith sharma");
		dto5.setTeamName("Mumbai Indians");
		dto5.setOwnerAlive(true);
		dto5.setDefeats(98);
		dto5.setPurse(86);
		dto5.setWin(129);
		dto5.setCreatedBy("SYSTEM");
		dto5.setCreatedDate(LocalDateTime.now());
		
		IplDTO dto6=new IplDTO();
		dto6.setCaptain("Sourav Ganguly");
		dto6.setTeamName("pune warrior");
		dto6.setOwnerAlive(true);
		dto6.setDefeats(33);
		dto6.setPurse(86);
		dto6.setWin(12);
		dto6.setCreatedBy("SYSTEM");
		dto6.setCreatedDate(LocalDateTime.now());

		IplDTO dto7=new IplDTO();
		dto7.setCaptain("Sanju Samson");
		dto7.setTeamName("Rajasthan royals");
		dto7.setOwnerAlive(true);
		dto7.setDefeats(93);
		dto7.setPurse(86);
		dto7.setWin(94);
		dto7.setCreatedBy("SYSTEM");
		dto7.setCreatedDate(LocalDateTime.now());
		
		IplDTO dto8=new IplDTO();
		dto8.setCaptain("Kane Williamson");
		dto8.setTeamName("Sunrisers hyderabad");
		dto8.setOwnerAlive(true);
		dto8.setDefeats(74);
		dto8.setPurse(86);
		dto8.setWin(74);
		dto8.setCreatedBy("SYSTEM");
		dto8.setCreatedDate(LocalDateTime.now());
		
		IplDTO dto9=new IplDTO();
		dto9.setCaptain("Kumar Sangakkara");
		dto9.setTeamName("Deccan Chargers");
		dto9.setOwnerAlive(true);
		dto9.setDefeats(46);
		dto9.setPurse(86);
		dto9.setWin(29);
		dto9.setCreatedBy("SYSTEM");
		dto9.setCreatedDate(LocalDateTime.now());
		
		IplDTO dto10=new IplDTO();
		dto10.setCaptain("Shikar dhavan");
		dto10.setTeamName("punjab kings");
		dto10.setOwnerAlive(true);
		dto10.setDefeats(33);
		dto10.setPurse(86);
		dto10.setWin(12);
		dto10.setCreatedBy("SYSTEM");
		dto10.setCreatedDate(LocalDateTime.now());
		
		IplDTO dto11=new IplDTO();
		dto11.setCaptain("Hardik pandya");
		dto11.setTeamName("Gujarat titans");
		dto11.setOwnerAlive(true);
		dto11.setDefeats(4);
		dto11.setPurse(86);
		dto11.setWin(12);
		dto11.setCreatedBy("SYSTEM");
		dto11.setCreatedDate(LocalDateTime.now());
		
		
		iplRepository.create(dto1);
		iplRepository.create(dto2);
		iplRepository.create(dto3);
		iplRepository.create(dto4);
		iplRepository.create(dto5);
		iplRepository.create(dto6);
		iplRepository.create(dto7);
		iplRepository.create(dto8);
		iplRepository.create(dto9);
		iplRepository.create(dto10);
		iplRepository.create(dto11);
		
	}

}




