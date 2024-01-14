package OOPInterface;

public class FortisHospital extend s Medical implements USMedical, UKMedical, IndianMedical{
//If you add more method in Fortis hospital need to implement in USMedical
	
	static final int min_fee= 45;
	
	@Override
	public void physioService() {
		// TODO Auto-generated method stub
		System.out.println("FH -- physioService");
	}

	@Override
	public void pediaService() {
		// TODO Auto-generated method stub
		System.out.println("FH -- pediaService");
	}

	@Override
	public void gynoService() {
		// TODO Auto-generated method stub
		System.out.println("FH -- gynoService");
	}

	

	@Override
	public void dentalService() {
		// TODO Auto-generated method stub
		System.out.println("FH -- DentalService");	
	}

	@Override
	public void orthooService() {
		// TODO Auto-generated method stub
		System.out.println("FH -- orthoService");
	}

	@Override
	public void entService() {
		// TODO Auto-generated method stub
		System.out.println("FH -- orthoService");
	}

	@Override
	//common method for all interface
	public void emerServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- emerService");
	}
	
	//method hiding
		public static void billing() {
			// TODO Auto-generated method stub
			System.out.println("FH -- billing");
				
		
	}
//Individual 
	
	public void medicalInsurance() {
		
		System.out.println("FH -- medicalInsurance");
		
	}
	
public void medicalTraining() {
		
		System.out.println("FH -- medicalTraining");
		
	}
// default method can be override with public keyword
@Override
public void RnD() {
	
	System.out.println("fortis -- Rnd");
	
}	
}
