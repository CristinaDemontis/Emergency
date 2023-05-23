package it.polito.tdp.emergency;

public class TestSimulator {
	
	public static void main(String[] args) {
		Simulator sim = new Simulator(3) ;
		
		sim.initialize();
		sim.run();
		
		System.out.println("Pazienti: "+sim.getnPatients());
		System.out.println("Curati: "+sim.getnHealedPatients());
		System.out.println("Hanno abbandonato: "+sim.getnAbandonedPatients());
		System.out.println("Morti: "+sim.getnDeadPatients());

	}

}
