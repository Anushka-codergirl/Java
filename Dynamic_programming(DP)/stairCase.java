//A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count and return all possible ways in which the child can run-up to the stairs.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class stairCase {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(staircase(n));
    }
	
		
    public static long staircase(int n){
     
          long storage[] = new long[n + 1]; 
            storage[0] = 1; 
            storage[1] = 1; 
            storage[2] = 2; 
      
            for (int i = 3; i <= n; i++){ 
                storage[i] = storage[i - 1] + storage[i - 2] 
                         + storage[i - 3];
            }
      
            return storage[n]; 
     }
        
}
    