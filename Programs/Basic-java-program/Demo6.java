import java.util.ArrayList;
class Continent{

    String cName;
    ArrayList <Countries> listOfCountries = new ArrayList<Countries>();
     double size;

    Continent( String cName, String[] conName){
        this.cName=cName;
        for (int i=0; i<conName.length; i++){
            listOfCountries.add( new Countries (conName [i]));
        }
    }

    public void displayCountries(){
        for (int i=0; i<listOfCountries.size(); i++){
            System.out.println(listOfCountries.get(i).conName);
        }
    }

}  // Continent class end here

class Countries{
    String conName;
    ArrayList <City> listOfCities = new ArrayList<City>();
    City capitalCity = new City();

    Countries(String conName, String[] cityName){
        this.conName=conName;
        for (int i=0; i<cityName.length; i++){
            listOfCities.add(new City(cityName[i]));
        }
    }

    public void displayCities(){
        for (int i=0; i<listOfCities.size(); i++){
            System.out.println(listOfCities.get(i).cityName);
        }
    }
    public int noOfCities(){
        return listOfCities.size();
    }
     public String capital(){ return capitalCity.capital;}

    class City{
        String cityName;
        long population;
        Countries cun;
        protected String capital;

        public void displayCity(){
            System.out.println("City name is : " + cityName);
        }
    }

}
public class Demo6{
    public static void main(String args[]){
        String [] conName={"Pakistan", "Korea"};
        String [] cityName={"Karachi","Solo"};
       // Continent asia = new Continent("western asia", conName);
        Countries c1 = new Countries("Pakistan", cityName);
        c1.displayCities();
    }
}