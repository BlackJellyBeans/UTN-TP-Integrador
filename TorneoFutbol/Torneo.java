	import java.io.IOException;
	import java.nio.charset.StandardCharsets;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.List;

import java.util.Scanner;

public class Torneo {
	
	public static void main (String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingresa tu equipo");
		String no1 = teclado.nextLine();
		System.out.println("ingresa tu segundo equipo");
		String no2 = teclado.nextLine();
		
		if (no1.equals("Argentina") && no2.equals("Francia")) {			
			System.out.println("Lista de equipos");
		
		while (no1.equals("Argentina")==false) {
					}
		
	TorneoFutbol equipos[] = new TorneoFutbol [2];
		String nombre1 = "<Argentina>: ";
		String descripcion1 = "Seleccionado Argentino";
		
		String nombre2 = "<Francia>: ";
		String descripcion2 = "Seleccionado Frances";
		
		TorneoFutbol equipo1  = new TorneoFutbol(nombre1, descripcion1);
		TorneoFutbol equipo2  = new TorneoFutbol(nombre2, descripcion2);
		
		equipos[0] = equipo1;
		equipos[1] = equipo2;
		
		System.out.println(nombre1 + descripcion1);
		System.out.println(nombre2 + descripcion2);
			 	
		        String archivo = "C:/Users/fabri/Documents/Resultados.txt";
		        //reemplazar la ruta del archivo .txt
		       
		        Path ruta;
		        List <String> lineasArchivo = null;
		        try {
		            ruta = Paths.get(archivo);
		            lineasArchivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        for(String linea : lineasArchivo){
		            System.out.println(linea);
		        }

		    }
			
		}

		
	        
		}
	
				
