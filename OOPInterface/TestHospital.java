package OOPInterface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FortisHospital fh= new FortisHospital();
		fh.physioService();
		fh.entService();
		fh.dentalService();
		fh.emerServices();
		fh.gynoService();
		fh.medicalInsurance();
		fh.medicalTraining();
		USMedical.billing();
		FortisHospital.billing();
		fh.RnD();
		fh.medicalNewsPublish();
		
		System.out.println(USMedical.min_fee);
		
		//Access with child class
		System.out.println(FortisHospital.min_fee);
		
		//USMedical.min_fee=10;
		
		//Top Casting: child class object reffererd by parent interface ref variable
		USMedical USM= new FortisHospital();
		USM.physioService();
		USM.gynoService();
		USM.pediaService();
		
		UKMedical UKM= new FortisHospital();
		
		UKM.dentalService();
		UKM.orthooService();
		UKM.emerServices();
		// down casting. Not allowed
		
		//FortisHospital fh1 = new UKMedical();
		
		
		
	}

}
