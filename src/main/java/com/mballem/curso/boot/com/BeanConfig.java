package com.mballem.curso.boot.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mballem.curso.boot.dao.CargoDao;
import com.mballem.curso.boot.dao.CargoDaoImpl;
import com.mballem.curso.boot.dao.DepartamentoDao;
import com.mballem.curso.boot.dao.DepartamentoDaoImpl;
import com.mballem.curso.boot.dao.FuncionarioDao;
import com.mballem.curso.boot.dao.FuncionarioDaoImpl;

@Configuration
public class BeanConfig {
    @Bean(name="CargoDao")
    public CargoDao createBeanCargo() {
        CargoDao bean = new CargoDaoImpl();
        return bean;
    }
    
    @Bean(name="DepartamentoDao")
    public DepartamentoDao createBeanDepartamento() {
    	DepartamentoDao bean = new DepartamentoDaoImpl();
        return bean;
    }
    
    @Bean(name="FuncionarioDao")
    public FuncionarioDao createBeanFuncionario() {
    	FuncionarioDao bean = new FuncionarioDaoImpl();
        return bean;
    }
}
