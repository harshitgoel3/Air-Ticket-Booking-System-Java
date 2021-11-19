public class passenger extends generalDetails{
    
    int extra_miles; 
    int pnr_number; 
    String flight_name;
    int seat_type;
    String comp_name;

    public passenger(){
        this.extra_miles=0;
        this.flight_name="/0";
        this.pnr_number=0;
        this.seat_type=0;
        this.comp_name="/0";
    }

    public passenger(String name,int age,String email_address,int phone_number){
        super(name,age,email_address,phone_number) ; 
        this.extra_miles=0;
        this.flight_name="/0";
        this.pnr_number=0;
        this.seat_type=0;
        this.comp_name="/0";
    }
    
}
