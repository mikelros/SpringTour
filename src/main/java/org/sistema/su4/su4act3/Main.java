package org.sistema.su4.su4act3;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Main program just for testing purposes
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public class Main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("letour.xml");
		
		Tour leTour = (Tour) contexto.getBean("tour");
		System.out.println("--------------------- Tour data -----------------");
		System.out.println(leTour.toString());

		// Add some data
		leTour.addRace(new Race(7,"Race 7","Pamplona","Oviedo",320.42f,null,null));

		// show race data
		System.out.println("--------------------- Races data -----------------");
		System.out.println(leTour.showRaces());
		
		Vector<Cyclist> cyclists = new Vector<Cyclist>();
		
		cyclists.add(new Cyclist(10,"David","Asturies"));
		cyclists.add(new Cyclist(11,"César","Asturies"));
		cyclists.add(new Cyclist(12,"Luis Enrique","Asturies"));
		Manager manager = new Manager(4,"Pipi Estrada");
		
		leTour.addTeam(new Team(4,"Central Lechera","El equipo más paisano","Asturies",cyclists,manager)); 

		// show team data
		System.out.println("--------------------- Teams data -----------------");
		System.out.println(leTour.showTeams());
		
		// Now show all data again
		System.out.println("--------------------- Tour data -----------------");
		System.out.println(leTour.toString());
	}

}
