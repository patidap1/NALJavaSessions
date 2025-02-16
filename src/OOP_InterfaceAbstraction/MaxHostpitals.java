package OOP_InterfaceAbstraction;

public class MaxHostpitals implements IndianMedical{

	@Override
	public void covidVaccination() {
		System.out.println("MH - Covid Vaccination");
	}

	@Override
	public void cardioServices() {
		System.out.println("MH - Cardio Services");
		
	}

	@Override
	public void gyncServices() {
		System.out.println("MH - Gyno Services");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("MH - Emergency Services");
		
	}

}
