package com.te.ramayan.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.ramayan.entity.Heros;
import com.te.ramayan.service.RamayanService;

@RestController
public class RamayanController {
	@Autowired
	RamayanService ramayanService;

	@PostMapping("/add")
	public Heros add(@RequestBody Heros heros) {
		Heros save = ramayanService.save(heros);
		if (save == null) {
			throw new RuntimeException("The object of heros is null");
		}
		return save;
	}

	@GetMapping("/add")
	public Heros findByName(@RequestParam String name) {
		Optional<Heros> byName = ramayanService.getByName(name);
		if (byName==null) {
			throw new RuntimeException("name is null");
		}
		return byName.get();

	}

}
