package Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FortisHospital FH = new FortisHospital();
		
		FH.dentalServices();
		FH.emergencyServices();
		FH.gynoServices();
		//FH.medicalInsurance();
		//FH.medicalTraining();
		FH.pediaServices();
		FH.physioServices();
		int a = USMedical1.min_fee;
		
		System.out.println(a);
		//Can we do the top casting with interface
		
		//USMedica1 us = new USMedical(); can not instantiate interface
		//Top Casting
		USMedical1 us = new FortisHospital();
		//All USMedical1 method can be called and common method can be called. 
		
		us.physioServices();
		us.emergencyServices();
		us.oncologyServices();
		us.PediaServices();
		us.physioServices();
		
		
		// Top Casting with other interfaces
		
		UKMedical uk = new FortisHospital();
		
		uk.dentalServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		// down casting is not allowed in Interface
		
		
		//FortisHospital fh1 = new USMedical1();
		
		
		
		
		
		
		
		
		
	}

}
