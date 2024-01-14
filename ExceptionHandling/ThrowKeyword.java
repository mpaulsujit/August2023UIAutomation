package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = null;
		
		if (url == null) {
			try {
				throw new Exception("URL IS NULL");
			}catch (Exception e) {
				e.printStackTrace();
				
			}
		}
			
			else {
				
				System.out.println(" Enter url in browser.....");
			}
		}
		
		
		
	}

}
