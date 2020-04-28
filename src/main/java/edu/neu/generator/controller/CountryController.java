package edu.neu.generator.controller;

import edu.neu.generator.bean.Country;
import edu.neu.generator.service.CountryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("country")
public class CountryController {
    @Resource
    CountryService countryService;

    @RequestMapping("/findAll")
    public List<Country> findAll(){
        return countryService.findAll();
    }
    @RequestMapping("/find/{code}")
    public Country findByCode(@PathVariable String code){
        return countryService.findByCode(code);
    }
}
