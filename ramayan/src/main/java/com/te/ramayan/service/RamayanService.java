package com.te.ramayan.service;

import java.util.Optional;

import com.te.ramayan.entity.Heros;

public interface RamayanService {
      public Heros save(Heros heros);
      public Optional<Heros> getByName(String name);
}
