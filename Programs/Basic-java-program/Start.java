public  class Human {
    Clothes c1 = new Clothes();
   

    public class Eye {

        int FPS;
        int MegaPixel;

    }

    public class Heart {

        int pumpingRate;
        int BloodRange;

    }

    public class Lungs {
        int Sizeoflungs;

        public void display() {
            System.out.println("Lungs can work");
        }

    }

    public class Brain {
        int neorones;
        int sizeOfNeorones;

    }

    public class Clothes {
        int colorOfClothes;
        String PentShirt;
        String KurtaShalwar;
    }
 Lungs l1 = new Lungs();
Human(){
l1.display( );
}

    
}
public class Start{

    public static void main(String args[]){
        Human h1=new Human();

        
    }}

