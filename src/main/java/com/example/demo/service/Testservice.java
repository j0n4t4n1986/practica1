package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Auto;

@Component
public class Testservice {
	
	public Auto getById(Integer id) {
		
		System.out.println("metodo get   " +id.toString());
		Auto auto = new Auto();
		return auto;
	}
	
	public List<Auto> getAll() {
		System.out.println("metodo all   ");
		List<Auto> lstAuto= new ArrayList<Auto>();
		Auto auto = new Auto();
		auto.setColor("red");
		lstAuto.add(auto);
		Auto auto2 = new Auto();
		auto2.setColor("blue");
		lstAuto.add(auto2);
		return lstAuto;
	}
	
	public Auto update(Integer id,Auto auto) {
		System.out.println("metodo update   " +auto.getColor());
		System.out.println("metodo  id   " +id.toString());
		return auto;
		
	}
	
	public Auto save(Auto auto) {
		System.out.println("metodo save   " +auto.getColor());
		return auto;
		
	}
	
	public void delete(Integer id) {
		System.out.println("metodo delete   " +id.toString());
		
	}

}
