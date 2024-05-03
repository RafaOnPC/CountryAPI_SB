package com.mysql.entitys.repository;

import com.mysql.entitys.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
