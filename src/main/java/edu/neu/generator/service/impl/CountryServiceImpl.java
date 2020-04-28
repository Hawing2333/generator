package edu.neu.generator.service.impl;


import edu.neu.generator.bean.Country;
import edu.neu.generator.bean.CountryExample;
import edu.neu.generator.repository.CountryMapper;
import edu.neu.generator.service.CountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Resource
    CountryMapper countryMapper;
    public List<Country> findAll(){
        CountryExample countryExample = new CountryExample();
        return countryMapper.selectByExample(countryExample);

    }

    @Override
    public Country findByCode(String code) {
        CountryExample countryExample = new CountryExample();
        CountryExample.Criteria criteria = countryExample.createCriteria();
        criteria.andCodeEqualTo(code);
        return countryMapper.selectByExample(countryExample).get(0);
    }

}
