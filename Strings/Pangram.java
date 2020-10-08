/// Wikipedia: https://en.wikipedia.org/wiki/Pangram
public class Pangram {

	public static void main(String[] args) {
		System.out.println("Is Pangram: "+isPangram("Pangram is a sentence using every letter of alphabet at least once."));
        System.out.println("Is Pangram: "+isPangram("qwertyuiopasdfghjklxcvbnzm."));
        System.out.println("Is Pangram: "+isPangram("QWERTYUIOPADFGHJKLXCVBNZM!"));
        System.out.println("Is Pangram: "+isPangram("The quick brown fox jumps over the lazy dog"));                    
    }

	// Check if a string is Pangram
    public static boolean isPangram(String s) {    	
    	s = s.replaceAll("[^a-zA-Z]", ""); 
    	char ch ='a'; 
    	char CH='A';    
    	for(int i=0; i<26; i++, ch++, CH++) {
    		if(!s.contains(String.valueOf(ch)) && !s.contains(String.valueOf(CH))) {
    			return false;
    		}
    	}
    	return true;
    }
}
