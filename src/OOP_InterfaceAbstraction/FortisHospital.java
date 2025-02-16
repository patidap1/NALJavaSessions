package OOP_InterfaceAbstraction;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	int min_fee = 200;
	
	//US
	@Override
	public void physioServices() {
		System.out.println("FH - physio services");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH - oncology services");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH - dental services");
		
	}

	@Override
	public void payment(int amount) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void orthoServices() {
		System.out.println("FH - ortho services");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH - neuro services");		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH - cardio services");				
	}

	@Override
	public void gyncServices() {
		System.out.println("FH - gyno services");				
	}

	//common method - needs to be implemented once 
	@Override
	public void emergencyServices() {
		System.out.println("FH - emergency services");		
	}

	//individual
	public void medicalTraining() {
		System.out.println("FH - Medical Training");
	}
	
	//individual
	public void optServices() {
		System.out.println("FH - OPT Services");
	}
	
	public static void medicalBilling() {
		System.out.println("FH - medical billing");
	}
	
	@Override
	public void medicalNews() {
		System.out.println("FH - medical news");
	}

	//WHO - coming from grand parent interface
	@Override
	public void covidVaccination() {
		System.out.println("FH - Covid vaccination");
	}

	
}
