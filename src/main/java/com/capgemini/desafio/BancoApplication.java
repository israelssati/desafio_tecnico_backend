package com.capgemini.desafio;

import java.math.BigDecimal;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.capgemini.desafio.model.Conta;
import com.capgemini.desafio.service.ContaService;


@SpringBootApplication
public class BancoApplication implements CommandLineRunner {

	@Autowired
	private ContaService contaService;
	
	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	@Override
    public void run(String... args) throws Exception {
		Conta conta1 = new Conta(103, Short.valueOf(""+1111), 1111, BigDecimal.ZERO);
		Conta conta2 = new Conta(103, Short.valueOf(""+2222), 2222, BigDecimal.ZERO);
		Conta conta3 = new Conta(103, Short.valueOf(""+3333), 3333, BigDecimal.ZERO);
		contaService.salvar(conta1);
		contaService.salvar(conta2);
		contaService.salvar(conta3);
    }

}
