package org.kdcoder.covidpercentage.controller;

import org.kdcoder.covidpercentage.models.CovidData;
import org.kdcoder.covidpercentage.services.CovidTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coviddata")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CovidTrackerController {
	@Autowired
	private CovidTrackerService covidTrackerService; 

	@GetMapping
	public ResponseEntity<CovidData> getAllData() {
		return ResponseEntity.status(HttpStatus.OK).body(covidTrackerService.getAllCovidData());
	}
}
