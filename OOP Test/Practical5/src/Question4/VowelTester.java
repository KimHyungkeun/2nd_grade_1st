package Question4;

public class VowelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel info = new Vowel("PowerOver");
		info.vowel_search();
		
		System.out.println("Vowel : "+info.vowel_result());
		System.out.println("Non_Vowel : "+info.non_vowel_result());
	}

}
