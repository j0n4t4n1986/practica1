package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Auto;
import com.example.demo.service.Testservice;

@RestController
@RequestMapping("test")
public class TestController {

	@Autowired
	private Testservice testservice;

	// @RequestMapping(value="",method = RequestMethod.GET)
	// @GetMapping(value="hola")
	@RequestMapping(value = "test", method = RequestMethod.GET, produces = "application/json")
	String getValor() {
		return "valor";

	}
	// @ResponseBody
	// @RequestParam(name = "id") String fooId
	// @PathVariable String id

	// http get normalmente utilizado para listados o recuperar un valor
	@GetMapping("{id}")
	Auto getById(@PathVariable("id") Integer id) {
		
		return testservice.getById(id);

	}

	// http get normalmente utilizado para listados o recuperar un valor
	@GetMapping("")
	List<Auto> getAll() {
		
		return testservice.getAll();

	}

	// http get normalmente utilizado para listados o recuperar un valor
	@PostMapping(value = "{id}", produces = "application/json", consumes = "application/json")
	Auto save(@PathVariable("id") Integer id, @RequestBody() Auto auto) {
		testservice.save(auto);
		return auto;

	}

	// http get normalmente utilizado para listados o recuperar un valor
	@PutMapping(value = "{id}", produces = "application/json", consumes = "application/json")
	Auto update(@PathVariable("id") Integer id, @RequestBody() Auto auto ) {
		testservice.update(id,auto);
		return auto;
	}

	// http get normalmente utilizado para listados o recuperar un valor
	@DeleteMapping(value = "{id}")
	void delete(@PathVariable("id") Integer id) {
		testservice.delete(id);

	}

}
