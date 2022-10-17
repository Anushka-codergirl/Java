class Clock{
  private   int sec;
   private float min;
   private float hour;
    int totalSec;

   public void setHourMinSec(float hour, float min , int sec){
       this.hour=hour;
       this.min=min;
       this.sec=sec;
   }
   int getSec(){ return  sec ;}
    float getMin(){ return  min;}
float getHour(){ return  hour;}

    public int convertToSec(float hour, float min){
        totalSec =(int)(hour*3600+min*60);

      return  totalSec;

    }
    public void secRecipocal(){
        int backHour= totalSec/3600;
        System.out.println(backHour);
        totalSec-=totalSec*backHour;
        int backMinute=totalSec/60;
        System.out.println(backMinute);

    }
}
public class Test {
    public static void main(String[] args) {
        Clock c1= new Clock();
        c1.setHourMinSec(3,50,0);
        System.out.println(c1.convertToSec(3,50));


    }
}
