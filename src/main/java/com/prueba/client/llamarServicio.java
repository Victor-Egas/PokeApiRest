package com.prueba.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.prueba.modelo.Datos;


@Component
public class llamarServicio  implements CommandLineRunner {

	private static void llamarRest(){
		RestTemplate rest=new RestTemplate();
		System.out.println("Prueba");
		System.out.println("Prueba 1");
		System.out.println("Prueba 2");
		Datos datos=rest.getForObject("https://pokeapi.co/api/v2/pokemon-species",Datos.class);
		System.out.println("Los Pokemones obtenidos son : "+datos.getResults());
		
	}
	


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		llamarRest();
	}
}
