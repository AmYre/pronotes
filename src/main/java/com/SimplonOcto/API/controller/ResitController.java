package com.SimplonOcto.API.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.SimplonOcto.API.model.Classroom;
import com.SimplonOcto.API.model.ClassroomRepository;
import com.SimplonOcto.API.model.Resit;
import com.SimplonOcto.API.model.ResitRepository;
import com.SimplonOcto.API.model.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResitController {

	@Autowired
	private ResitRepository rr;

	@GetMapping("/resits")
	public Iterable<Resit> getResits() {
		return rr.findAll();
	}

	@GetMapping("/resits/ef")
	public Iterable<Resit> getResitsEf() {
		return rr.findByStatus("ef");
	}

	@GetMapping("/resits/efno")
	public Iterable<Resit> getResitsEfno() {
		return rr.findByStatus("efno");
	}

	@GetMapping("/resits/noef")
	public Iterable<Resit> getResitsNoef() {
		return rr.findByStatus("noef");
	}

	@GetMapping("/resitsbyteacher")
	public List<Resit> professeurLIst(@RequestParam(required = false) Optional<Integer> id) {

		return rr.findAllByTeacherId(id);
	}

	@CrossOrigin
	@PostMapping("/addresit")
	public ResponseEntity createResit(@RequestBody Resit resit) throws URISyntaxException {
		Resit savedResit = rr.save(resit);
		return ResponseEntity.created(new URI("/addresit/" + savedResit.getId())).body(savedResit);
	}

	@PutMapping("/{id}")
	public ResponseEntity updateResit(@PathVariable Integer id, @RequestBody Resit resit) {
		Resit currentResit = rr.findById(id).orElseThrow(RuntimeException::new);
		currentResit.setName(resit.getName());
		currentResit.setExam(resit.getExam());
		currentResit = rr.save(resit);

		return ResponseEntity.ok(currentResit);
	}

	@DeleteMapping("/delresit/{id}")
	public ResponseEntity deleteResit(@PathVariable Integer id) {
		rr.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
