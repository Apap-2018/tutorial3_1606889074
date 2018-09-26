package com.apap.tutorial3.service;

import java.util.List;
import com.apap.tutorial3.model.PilotModel;

public interface PilotService {
	void addPilot (PilotModel pilot);
	List<PilotModel> getPilotList();
	PilotModel getPilotDetailByLicenseNumber(String linceseNumber);
	
	//ditambahkan di Latihan 3
	void removePilot (PilotModel pilot);
}
