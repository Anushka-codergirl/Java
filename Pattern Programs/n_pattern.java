public class n_pattern {

    static void Alphabet_N_Pattern(int N)
    {

        int index, side_index, size;

        int Right = 1, Left = 1, Diagonal = 2;

        
        for (index = 0; index < N; index++) {

            
            System.out.print(Left++);

            
            for (side_index = 0; side_index < 2 * (index); side_index++)
                System.out.print(" ");

            
            if (index != 0 && index != N - 1)
                System.out.print(Diagonal++);
            else
                System.out.print(" ");

            
            for (side_index = 0; side_index < 2 * (N - index - 1); side_index++)
                System.out.print(" ");

            
            System.out.print(Right++);

            System.out.println();
        }
    }

    
    public static void main(String args[])
    {
        
        int Size = 6;

        
        Alphabet_N_Pattern(Size);
    }
}
