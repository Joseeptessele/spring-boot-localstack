package br.com.joseptessele.springbootlocalstack.controller;

import br.com.joseptessele.springbootlocalstack.configuration.ParameterStoreConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class ParameterStoreController {

    @Autowired
    private ParameterStoreConfiguration configuration;

    @GetMapping("/parameterStoreConfiguration")
    public Map<String, String> configuration(){
        return Map.of("parameterStoreValue", configuration.getHelloWorld());
    }
}
