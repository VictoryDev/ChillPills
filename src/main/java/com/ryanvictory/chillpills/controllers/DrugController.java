package com.ryanvictory.chillpills.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ryanvictory.chillpills.models.Chemical;
import com.ryanvictory.chillpills.models.Drug;
import com.ryanvictory.chillpills.models.Insurance;
import com.ryanvictory.chillpills.services.ChemicalService;
import com.ryanvictory.chillpills.services.DrugService;
import com.ryanvictory.chillpills.services.InsuranceService;

@Controller
@RequestMapping("/drugs")
public class DrugController {
	private final DrugService drugService;
	private final InsuranceService insuranceService;
	private final ChemicalService chemService;


	public DrugController(DrugService drugService, ChemicalService chemService,InsuranceService insuranceService) {
		this.drugService = drugService;
		this.chemService = chemService;
		this.insuranceService = insuranceService;

	}
	
	@RequestMapping("")
	public String index(Model model) {
		List<Insurance> insurances = insuranceService.allInsurances();
		model.addAttribute("insurances", insurances);
		return "index.jsp";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(Model model, @RequestParam String param1, @RequestParam String param2) {
		if(param1.substring(10).equals("%20")) {
			param1 = "searchStr= ";
		}
		List<Drug> drugs = drugService.searchAll(param1.substring(10));
		
		if(drugs != null) {
			Float x = Float.parseFloat(param2.substring(13));
			model.addAttribute("drugs", drugs);
			model.addAttribute("x", x);
		}
		
		return "table.jsp";
	}
	
	@RequestMapping("/new")
    public String addDrug(Model model, @ModelAttribute("drug") Drug drug) {
		List<Chemical> allChems = chemService.allChemicals();
		model.addAttribute("chemicals", allChems);
    	return "addDrug.jsp";
    }

    
    @RequestMapping(value="/new", method=RequestMethod.POST)
    public String processDrug(@Valid @ModelAttribute("drug") Drug drug, BindingResult result, HttpSession session) {
    	if(result.hasErrors()) {
    		return "addDrug.jsp";
    	}
    	drugService.create(drug);
       	return "success.jsp";
    }
    
    
}
