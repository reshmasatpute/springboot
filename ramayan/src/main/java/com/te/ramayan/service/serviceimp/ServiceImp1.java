package com.te.ramayan.service.serviceimp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ramayan.entity.Heros;
import com.te.ramayan.repository.RamayanRepo;
import com.te.ramayan.service.RamayanService;

@Service
public class ServiceImp1 implements RamayanService {

	@Autowired
	RamayanRepo ramayanRepo;

	@Override
	public Heros save(Heros heros) {
		Heros save = ramayanRepo.save(heros);
		if (save == null) {
			throw new RuntimeException("heros is not present");
		}
		return save;
	}

	@Override
	public Optional<Heros> getByName(String name) {
		Optional<Heros> findByName = ramayanRepo.findByName(name);
		if (findByName==null) {
			throw new RuntimeException("The name you are serching is not present");
		}
		return findByName;
	}

}
