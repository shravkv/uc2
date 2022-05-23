public class salary {
    public static void main(String[] args){

        int wageperhour=20;
        int fulldayhour=8;
        int halfdayhour=4;
        int dailywage;
        int presentfull=1;
        int presenthalf=2;
        int randomNum=(int)(Math.random()*3);
          Syestem.out.println("Displaying random:" +randomNum);
          if(presentfull==randomNum){          }
          dailywage=(wageperhour*fulldayhour);
       System.out.println("Employee is present Fullday :"+dailywage);

    }else if (presenthalf==randomNum){
          dailywage=(wageperhour*halfdayhour);
        System.out.println("Employee is present Parttime :"+dailywage);
    }else{
     dailywage=0;
        System.out.println("Employee is Absent :"+dailywage);

     }
  }
}