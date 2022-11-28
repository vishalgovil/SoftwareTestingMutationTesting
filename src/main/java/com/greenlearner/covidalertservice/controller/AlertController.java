package com.greenlearner.covidalertservice.controller;

import com.greenlearner.covidalertservice.dto.AlertStatus;
import com.greenlearner.covidalertservice.dto.SummaryData;
import com.greenlearner.covidalertservice.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/india/")
public class AlertController {

    @Autowired
    private AlertService alertService;


    @GetMapping("/home")
	public String home()
	{
		return "this is my home";
	}

    @GetMapping("/{state}")
    public AlertStatus getAlertAboutState(@PathVariable String state){

        return alertService.getAlertAboutState(state);
    }

    @GetMapping("/death/{state}")
    public AlertStatus getAboutStateDeath(@PathVariable String state){

        return alertService.getAboutStateDeath(state);
    }


    @GetMapping("/summary")
    public SummaryData getOverAllSummary(){

        return alertService.getOverAllSummary();
    }

    
}
