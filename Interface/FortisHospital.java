package Interface;

public class FortisHospital implements USMedical1, UKMedical, IndianMedical{
//US
	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		
		System.out.println("FH - physioServices");
		
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		

		System.out.println("FH - OncologyServices");
		
	}

	@Override
	public void PediaServices() {
		// TODO Auto-generated method stub
		
		System.out.println("FH - PediaServices");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("FH - testServices");
	}
	
	//UK

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		System.out.println("FH - DentalServices");
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH - OrthoServices");
	}
//Indian
	@Override
	public void gynoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH - GynoServices");
		
	}

	@Override
	public void pediaServices() {
		// TODO Auto-generated method stub
		System.out.println("FH - GynoServices");
	}
//common 
	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
	}
		//Individual
		
	public void medicalInsurance() {
		// TODO Auto-generated method stub
		
	}
	public void medicalTraining() {
		// TODO Auto-generated method stub
	
	}	
}
