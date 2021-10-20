package com.wd.projeto01.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wd.projeto01.entities.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Integer>{

	Page<Vendas> findAll(Pageable pageable);

}
