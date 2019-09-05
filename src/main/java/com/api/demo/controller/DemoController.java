package com.api.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo.data.entities.Table;
import com.api.demo.service.DemoService;

@RestController
public class DemoController {
	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "getStatus", method = RequestMethod.POST, produces = { "application/json" })
	public ResponseEntity<?> getTableInfo() {
		Table table = new Table();
		table = demoService.execute();
		List tableSummary = new ArrayList<>();

		tableSummary.add(table);

		return new ResponseEntity<>(tableSummary, HttpStatus.OK);
	}
	
	@RequestMapping(value = "getStatus", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<?> getTableInfoGet() {
		Table table = new Table();
		table = demoService.execute();
		List tableSummary = new ArrayList<>();

		tableSummary.add(table);

		return new ResponseEntity<>(tableSummary, HttpStatus.OK);
	}
}
