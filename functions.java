import java.util.*;  


public class functions {
    int PNR_NUM = 999913 ;
    int alreadyBookedTickets=0 ; 
    HashMap<Integer,pair1> ourMap = new HashMap<Integer,pair1>();//pnr->(passenger,flight)
    Scanner scan = new Scanner(System.in) ; 


    public static Vector<pair2> get_all_flights_fromStoD(company c[],String source,String destination){
        Vector<pair2> v = new Vector() ;

        for(int i=0 ; i<3 ; i++){      //total companies

            company co = c[i];
            for(int j=0 ; j<co.total_flights.size() ; j++){
                flight f=co.total_flights.get(j);
                if(f.source.equals(source) && f.destination.equals(destination)){
                        pair2 p = new pair2();
                        p.c = co;
                        p.f = f;
                        v.add(p);
                }
            }

        }
    return v;
    }
    

    public int get_flight_schedule(company c,String source,String destination){
        boolean flag=false;
        
        for(int i=0 ; i<c.total_flights.size() ; i++){
            flight f = c.total_flights.get(i) ;
            if(f.source.equals(source) && f.destination.equals(destination)){
                System.out.println("Company Name  Flight name    Source   Destination    Departure timing    Arrival timing ") ;
                
                System.out.print(c.company_name + "        ") ; 

                f.display();
                flag = true;
                System.out.println(" ") ; 
            }
        }
        if(flag==false){
            System.out.println("No flights found in "+c.company_name+".") ; 
            return 0;
        }
        return 1;
    }



    public void compare_rates(Vector<pair2> v){
        System.out.println(" ") ; 
        for(int i=0 ; i<v.size() ; i++){
                if((v.elementAt(i).f.count1+v.elementAt(i).f.count2+v.elementAt(i).f.count3) < 9){
                    System.out.println(v.elementAt(i).c.company_name+"  "+v.elementAt(i).f.flight_name) ; 
                    
                    if(v.elementAt(i).f.count1 < 3){
                        System.out.println("Available tickets in Economy   :- " + (3-v.elementAt(i).f.count1)) ;
                        System.out.print("Price                          :- " + v.elementAt(i).f.economy_fare);
                        System.out.println(" ") ; 
                        
                    }
                    if(v.elementAt(i).f.count2 < 3){
                        System.out.println("Available tickets in Executive :- " + (3-v.elementAt(i).f.count2)) ;
                        System.out.print("Price                          :- " + v.elementAt(i).f.executive_fare);
                        System.out.println(" ") ; 
                        
                    }
                    if(v.elementAt(i).f.count3 < 3){
                        System.out.println("Available tickets in Business  :- " + (3-v.elementAt(i).f.count3)) ;
                        System.out.print("Price                          :- " + v.elementAt(i).f.business_fare);
                        System.out.println(" ") ; 
                        
                    }
                    System.out.println(" ") ;
                    System.out.println(" ") ;
                }
                else{
                    System.out.println("All tickets are booked.") ;
                    System.out.println(" ") ;
                    
                }
        }
    
    }




    public void print_ticket(passenger P){
        if(P.seat_type==1 || P.seat_type==2 || P.seat_type==3){
            P.display();
            System.out.println("PNR number      :- " + P.pnr_number) ;
            System.out.println("Extra miles     :- " + P.extra_miles) ;
            System.out.println("Company name    :- " + P.comp_name) ;
            System.out.println("Flight name     :- " + P.flight_name) ;
        }
        if(P.seat_type==1){
            System.out.println("Seat type       :- Economy") ; 
        }
        else if(P.seat_type==2){
            System.out.println("Seat type       :- Executive ") ; 
        }
        else if(P.seat_type==3){
            System.out.println("Seat type       :- Business ") ; 
        }
        else{
            System.out.println("No such type of seats.") ;
        }
    
    }


    
    public void payment_options(int price, passenger P ,flight f){
        alreadyBookedTickets++ ; 
        if(alreadyBookedTickets > 2){
        //if(P.email_address!="harshitgoel413@gmail.com" && P.email_address!="diprachaudhry18@gmail.com"){
            System.out.println("Press 1 for Net Banking.") ; 
            System.out.println("Press 2 for Debit Card. ") ; 
            System.out.println("Press 3 for Credit Card.") ; 

            int n = scan.nextInt();
            int discounted_price = price-P.extra_miles/10 ;
            P.extra_miles=0;
            System.out.println("Rs "+discounted_price + " has been deducted.") ; 
            
        }
        
        P.pnr_number = PNR_NUM;
        PNR_NUM++;
        P.extra_miles = P.extra_miles + price/10;
    
        pair1 pf = new pair1(P,f) ;
        ourMap.put(P.pnr_number , pf) ; 
    }



    public void book_ticket(Vector<pair2>v ,String Company_name,int digit, passenger P){
        for(int i=0 ; i<v.size() ; i++){
            if(v.elementAt(i).c.company_name.equals(Company_name)){
                if(digit==1){
                    if(v.elementAt(i).f.count1==3){
                        System.out.println("No seats left in economy.") ; 
                    }
                    else {
                        v.elementAt(i).f.seat_economy[v.elementAt(i).f.count1]=true;
                        v.elementAt(i).f.count1++;
                        P.seat_type = 1;
                        v.elementAt(i).f.passenger_list[v.elementAt(i).f.count1+v.elementAt(i).f.count2+v.elementAt(i).f.count3-1]=P ;
                        payment_options(v.elementAt(i).f.economy_fare, P, v.elementAt(i).f);
                        P.comp_name = Company_name;
                        P.flight_name = v.elementAt(i).f.flight_name;
                        break ; 
                    }
                 }
                else if(digit==2){
                    if(v.elementAt(i).f.count2==3){
                        System.out.println("No seats left in executive.") ; 
                    }
                    else {
                        v.elementAt(i).f.seat_executive[v.elementAt(i).f.count2]=true;
                        v.elementAt(i).f.count2++;
                        P.seat_type = 2 ;
                        v.elementAt(i).f.passenger_list[v.elementAt(i).f.count1+v.elementAt(i).f.count2+v.elementAt(i).f.count3-1]=P;
                        payment_options(v.elementAt(i).f.executive_fare , P , v.elementAt(i).f);
                        P.comp_name = Company_name;
                        P.flight_name = v.elementAt(i).f.flight_name;
                        break ; 
                    }
                }
                else if(digit==3){
                    if(v.elementAt(i).f.count3==3){
                        System.out.println("No seats left in business.") ; 
                    }
                    else {
                        v.elementAt(i).f.seat_business[v.elementAt(i).f.count3]=true;
                        v.elementAt(i).f.count3++;
                        P.seat_type = 3 ;
                        v.elementAt(i).f.passenger_list[v.elementAt(i).f.count1+v.elementAt(i).f.count2+v.elementAt(i).f.count3-1]=P ;
                        payment_options(v.elementAt(i).f.business_fare , P , v.elementAt(i).f);
                        P.comp_name = Company_name;
                        P.flight_name = v.elementAt(i).f.flight_name;
                        break ; 
                    }
                }
                else{
                    System.out.println("No such type of seats.") ; 
                }
            }
           
        }

    }




    public void unbook_flight(int PNR_NUMBER){
        if(ourMap.containsKey(PNR_NUMBER)==true){
            pair1 pf = ourMap.get(PNR_NUMBER) ;
            passenger P = pf.p;
            flight F = pf.f;
            int seat_digit = P.seat_type;
    
            int index = -1;         //index of the passenger to be deleted in the passenger list
    
            for(int i=0;i<9;i++){          //deleting passengers from passenger list
                if(P.pnr_number==F.passenger_list[i].pnr_number){
                     index = i;
                     break;
                }
            }

            //shifting the array elements
            for(int j=index ; j<8 ; j++){
                F.passenger_list[j] = F.passenger_list[j+1];
            }
    
            P.extra_miles -= 100;
            P.pnr_number = 0;
    
            if(seat_digit==1){
                F.seat_economy[F.count1-1]=false ;
                F.count1-- ;
                System.out.println("Your ticket has been unbooked.") ; 

            }
            else if(seat_digit==2){
                F.seat_executive[F.count2-1] = false ;
                F.count2-- ;
                System.out.println("Your ticket has been unbooked.") ; 
                
            }
            else if(seat_digit==3){
                F.seat_business[F.count3-1]=false ;
                F.count3-- ;
                System.out.println("Your ticket has been unbooked.") ; 
                
            }else{
                System.out.println("No such type of seats.") ; 
                
            }

            P.seat_type = 0;
            ourMap.remove(PNR_NUMBER);
        }
        else{
            System.out.println("Invalid PNR Number.") ; 
        }
    
    }



    public void admin(company total_companies[] , String flight_name , String company_name ){
        if(flight_name.charAt(0)!='\0'){ //passenger details
            for(int i=0 ; i<3 ; i++){
                    company c = total_companies[i];
                    
                    for(int j=0 ; j<c.total_flights.size() ; j++){
                        flight f = c.total_flights.get(j);
                        if(f.flight_name.equals(flight_name)){
                            for(int k=0 ; k<(f.count1+f.count2+f.count3) ; k++){
                                passenger p = f.passenger_list[k];
                                p.display();
                                System.out.println(" ");
                            }if((f.count1+f.count2+f.count3==0)){
                                System.out.println("No passengers! ");
                            }
                        }
                    }
            }
        }
        else{
            for(int i=0 ; i<3 ; i++){ //employee details
                    company c = total_companies[i]; 

                    if(c.company_name.equals(company_name)){
                        for(int j=0 ; j<c.list_of_employees.size() ; j++){                   
                            employee e = c.list_of_employees.get(j);
                            e.display();
                            System.out.println(" ") ;
                        }
                    }
            }
        }
    }

}
