package com.ryanvictory.chillpills.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ryanvictory.chillpills.models.Chemical;
import com.ryanvictory.chillpills.services.ChemicalService;

@Controller
@RequestMapping("/chemicals")
public class ChemicalController {
	private final ChemicalService chemService;

	public ChemicalController(ChemicalService chemService) {
		this.chemService = chemService;
	}
	
	@RequestMapping("/new")
    public String addChem(Model model, @ModelAttribute("chemical") Chemical chem) {
    	return "addChem.jsp";
    }
    
    
    @RequestMapping(value="/new", method=RequestMethod.POST)
    public String processChem(@Valid @ModelAttribute("chemical") Chemical chem, BindingResult result, HttpSession session) {
    	if(result.hasErrors()) {
    		return "addChem.jsp";
    	}
    	chemService.create(chem);
    	return "success.jsp";
    }
}
