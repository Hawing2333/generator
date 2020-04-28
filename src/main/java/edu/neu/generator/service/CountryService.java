package edu.neu.generator.service;

import edu.neu.generator.bean.Country;

import java.util.List;

public interface CountryService {
    public List<Country> findAll();
    public Country findByCode(String code);
}
