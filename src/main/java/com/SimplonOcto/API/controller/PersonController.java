package com.SimplonOcto.API.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.SimplonOcto.API.form.PersonForm;
import com.SimplonOcto.API.model.Person;
import com.SimplonOcto.API.model.Produit;
import com.SimplonOcto.API.model.ProduitRepository;
import com.SimplonOcto.API.service.ProduitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {
	
	@Autowired
	private ProduitRepository pr;
	
	private static List<Person> persons = new ArrayList<Person>();
	private Produit product = new Produit();

	static {
		persons.add(new Person("Bill", "Gates"));
		persons.add(new Person("Steve", "Jobs"));
	}

	// Injectez (inject) via application.properties.
	@Value("${welcome.message}")
	private String message;
	
	@Value("${error.message}")
	private String errorMessage;

	
	@RequestMapping(value = { "/", "index" }, method = RequestMethod.GET)
	public String index(Model model) {
		
		List<Produit> products = (List<Produit>) pr.findAll();

		model.addAttribute("message", message);
		model.addAttribute("rattrapages", products );

		return "index";
	}

	@RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
	public String personList(Model model) {

		model.addAttribute("persons", persons);

		return "personList";
	}

	@RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
	public String showAddPersonPage(Model model) {

		PersonForm personForm = new PersonForm();
		model.addAttribute("personForm", personForm);

		return "addPerson";
	}

	@RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
	public String savePerson(Model model, //
			@ModelAttribute("personForm") PersonForm personForm) {

		String firstName = personForm.getFirstName();
		String lastName = personForm.getLastName();

		if (firstName != null && firstName.length() > 0 //
				&& lastName != null && lastName.length() > 0) {
			Person newPerson = new Person(firstName, lastName);
			persons.add(newPerson);

			return "redirect:/personList";
		}

		model.addAttribute("errorMessage", errorMessage);
		return "addPerson";
	}

}