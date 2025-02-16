package OOP_InterfaceAbstraction;

public class TestHospital {

	public static void main(String[] args) {

		//fortis
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.medicalTraining();
		fh.neuroServices();
		fh.oncologyServices();
		fh.physioServices();
		fh.optServices();
		USMedical.medicalBilling();
		FortisHospital.medicalBilling();
		fh.medicalNews();
		fh.medicalRND();
		fh.covidVaccination();
		System.out.println(USMedical.min_fee);
		System.out.println(fh.min_fee);
		fh.min_fee = 400;
		
		// USMedical.min_fee = 500; //not allowed since final in nature
		System.out.println("------------------");
		
		//Apollo Hospitals
		ApolloHospital ah = new ApolloHospital();
		ah.cardioServices();
		ah.covidVaccination();
		ah.dentalServices();
		ah.emergencyServices();
		ah.medicalNews();
		ah.neuroServices();
		ah.oncologyServices();
		ah.orthoServices();
		ah.physioServices();
		ah.payment(100);
		
		System.out.println("------------------");
		
		//MAX Hospitals
		MaxHostpitals mh = new MaxHostpitals();
		mh.cardioServices();
		mh.covidVaccination();
		mh.emergencyServices();
		mh.gyncServices();
		
		System.out.println("------------------");
		
		
		//top casting: Child class object can be referred by parent interface ref variable
		//reference type check will be failed for other interfaces
		//'us', 'uk' & 'in' will have access to the USMedical methods and common methods
		
		USMedical us = new FortisHospital();
		us.dentalServices();
		us.oncologyServices();
		us.physioServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.neuroServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		IndianMedical in = new FortisHospital();
		in.cardioServices();
		in.gyncServices();
		in.emergencyServices();
		
		//Down Casting : not allowed
		//can not intantiate the interface
		// FortisHospital fh1 = new IndianMedical();
		
		
	}

}
