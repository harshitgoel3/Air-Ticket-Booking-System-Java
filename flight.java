public class flight {
    
    boolean seat_business[] = new boolean[3];
    boolean seat_economy[] = new boolean[3];
    boolean seat_executive[] = new boolean[3];
    int count1; //economy
    int count2; //executive
    int count3; //business
    String flight_name;
    String source;
    String destination;
    int arrival_time;
    int departure_time;
    int economy_fare;
    int executive_fare;
    int business_fare;
    passenger passenger_list[] = new passenger[9];


   public flight(){}
   public flight(String flight_name, String source, String destination,int arrival_time,int departure_time,int economy_fare,int executive_fare,int business_fare){
       this.flight_name=flight_name;
       this.source=source;
       this.destination=destination;
       this.arrival_time=arrival_time;
       this.departure_time=departure_time;
       this.economy_fare=economy_fare;
       this.executive_fare=executive_fare;
       this.business_fare=business_fare;
       count1=0;
       count2=0;
       count3=0;
       for(int i=0;i<3;i++){
            seat_business[i]=false;
            seat_economy[i]=false;
            seat_executive[i]=false;
       }
   }
   void display(){
        System.out.print(flight_name+"            ") ; 
        System.out.print(source+"      ") ; 
        System.out.print(destination+"          ") ; 
        System.out.print(departure_time+"              ") ; 
        System.out.print(arrival_time+"           ") ; 
        System.out.println("           ") ; 

        
   }
}


 
