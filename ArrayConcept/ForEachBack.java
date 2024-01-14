package ArrayConcept;

class ForEachBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {10,20,30};
		
		ar[0]= 10; ar[1]=20; ar[2]=25;
		
		//print backward all the value
		
		int count =ar.length-1;
		for(int e: ar) {
		
		//count =e;
		System.out.println(e[count] +" ="+ e);		
				
		count--;

	}
//count--;
}
}