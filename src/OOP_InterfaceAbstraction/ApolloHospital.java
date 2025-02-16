package OOP_InterfaceAbstraction;

public class ApolloHospital implements USMedical, UKMedical, IndianMedical {

	@Override
	public void covidVaccination() {
		System.out.println("AH - covidVaccination");		
	}

	@Override
	public void cardioServices() {
		System.out.println("AH - CardioServices");
		
	}

	@Override
	public void gyncServices() {
		System.out.println("AH - Gyno Services");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("AH = ortho services");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("AH - neuro services");
		
	}

	@Override
	public void physioServices() {
		System.out.println("AH - physio services");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("AH - onco services");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("AH - dental services");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("AH - Emergency services");
		
	}

	@Override
	public void payment(int amount) {
		System.out.println(amount);
		
	}
	

}
