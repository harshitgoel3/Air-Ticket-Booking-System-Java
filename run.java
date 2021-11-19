import java.util.* ;  
import java.io.IOException; 

public class run {
    public static void clrscr(){

        //Clears Screen in java
    
        try {
    
            if (System.getProperty("os.name").contains("Windows"))
    
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    
            else
    
                Runtime.getRuntime().exec("clear");
    
        } catch (IOException | InterruptedException ex) {}
    
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in) ; 
        functions f = new functions() ; 
        HashMap<String,String> login = new HashMap<String,String>() ;//email->password
        HashMap<String,passenger> details = new HashMap<String,passenger>() ;//email->passenger 

        flight f1 = new flight ("F1","Delhi","Mumbai",12,10,100,200,300);
        flight f2 = new flight ("F2","Kolkata","Chennai",16,11,1200,2200,3200);
        flight f3 = new flight ("F3","Chennai","Delhi",17,13,1300,2300,3300);
        flight f4 = new flight ("F4","Mumbai","Kolkata",9,6,1600,2600,3600);
        flight f5 = new flight ("F5","Delhi","Kolkata",9,6,1600,2600,3600);
        flight f6 = new flight ("F6","Delhi","Chennai",11,7,2600,3600,4600);
        flight f7 = new flight ("F7","Delhi","Mumbai",14,10,1800,2800,3800);
        flight f8 = new flight("F8","Kolkata","Chennai",17,13,13200,23200,33200);
        flight f9 = new flight("F9","Chennai","Delhi",18,13,3300,4300,5300);
        flight f10 = new flight("F10","Mumbai","Kolkata",19,16,11600,21600,31600);
        flight f11 = new flight("F11","Delhi","Kolkata",20,17,11600,21600,31600);
        flight f12 = new flight("F12","Delhi","Chennai",21,16,1500,2500,3500);
        flight f13 = new flight("F13","Delhi","Mumbai",22,20,1400,2200,1300);
        flight f14 = new flight("F14","Kolkata","Chennai",14,11,13200,23200,33200);
        flight f15 = new flight("F15","Chennai","Delhi",17,12,3300,5300,6300);
        flight f16 = new flight("F16","Mumbai","Kolkata",18,16,1400,2400,3300);
        flight f17 = new flight("F17","Delhi","Kolkata",4,1,16300,26300,33600);
        flight f18= new flight("F18","Delhi","Chennai",5,2,12600,8600,9600);


        //flight total_flights[] = new flight[6];
        Vector<flight> total_flights = new Vector<flight>();
        total_flights.add(f1) ;
        total_flights.add(f2) ;
        total_flights.add(f3) ;
        total_flights.add(f4) ;
        total_flights.add(f5) ;
        total_flights.add(f6) ;
        // System.out.print(total_flights[0].flight_name) ; 


        employee e1 = new employee("Abhinav",30,"Ab@gmail.com",981177703 ,"Pilot",11,"AirIndia");
        employee e2 = new employee("Abhi",31,"Ab1@gmail.com",888077703 ,"Co Pilot",12,"AirIndia");
        employee e3 = new employee("Rahul",29,"Ra@gmail.com",731177703 ,"Crew",13,"AirIndia");
        employee e4 = new employee("Manan",32,"Ma@gmail.com",981177773 ,"Crew",14,"AirIndia");
        employee e5 = new employee("Hiten",25,"Hi@gmail.com",80951777 ,"Crew",15,"AirIndia");
        employee e6 = new employee("Chandeep",36,"Ch@gmail.com",806577773 ,"Crew",16,"AirIndia");


        // employee list_of_employees[] = new employee[6];
        Vector<employee> list_of_employees = new Vector<employee>();

        list_of_employees.add(e1);
        list_of_employees.add(e2);
        list_of_employees.add(e3) ;
        list_of_employees.add(e4) ;
        list_of_employees.add(e5) ;
        list_of_employees.add(e6) ;

        company c1 = new company("AirIndia",total_flights,list_of_employees);
        total_flights.clear() ; 
        list_of_employees.clear() ; 

        total_flights.add(f7);
        total_flights.add(f8);
        total_flights.add(f9);
        total_flights.add(f10);
        total_flights.add(f11);
        total_flights.add(f12);


        employee e7 = new employee("Nikita",33,"Ni@gmail.com",863277703 ,"Pilot",17,"AirAsia");
        employee e8 = new employee("Priyanka",27,"Pr@gmail.com",783577773 ,"Co Pilot",18,"AirAsia");
        employee e9 = new employee("Riya",24,"Ri@gmail.com",809517728 ,"Crew",19,"AirAsia");
        employee e10 = new employee("Abhiraj",38,"Ab2@gmail.com",806545773 ,"Crew",20,"AirAsia");
        employee e11 = new employee("Vansh",31,"Va1@gmail.com",863456703 ,"Crew",21,"AirAsia");
        employee e12 = new employee("Vaanya",24,"Va@gmail.com",783589773 ,"Crew",22,"AirAsia");

        list_of_employees.add(e7) ;
        list_of_employees.add(e8) ;
        list_of_employees.add(e9) ;
        list_of_employees.add(e10)  ;
        list_of_employees.add(e11)  ;
        list_of_employees.add(e12)  ;


        company c2 = new company("AirAsia",total_flights,list_of_employees);
        total_flights.clear() ; 
        list_of_employees.clear() ; 

        total_flights.add(f13) ;
        total_flights.add(f14) ;
        total_flights.add(f15) ;
        total_flights.add(f16) ;
        total_flights.add(f17) ;
        total_flights.add(f18) ;

        employee e13 = new employee("Abeer",33,"Ab4@gmail.com",863277703 ,"Pilot",23,"Indigo");
        employee e14 = new employee("Niharika",27,"Ni1@gmail.com",782377773 ,"Co Pilot",24,"Indigo");
        employee e15 = new employee("Kshitij",24,"Ks@gmail.com",899578728 ,"Crew",25,"Indigo");
        employee e16 = new employee("Vanshika",38,"Va3@gmail.com",999845773 ,"Crew",26,"Indigo");
        employee e17 = new employee("Armaan",31,"Ar@gmail.com",973456703 ,"Crew",27,"Indigo");
        employee e18 = new employee("Sonali",23,"So@gmail.com",773589773 ,"Crew",28,"Indigo");


        list_of_employees.add(e13);
        list_of_employees.add(e14);
        list_of_employees.add(e15);
        list_of_employees.add(e16);
        list_of_employees.add(e17);
        list_of_employees.add(e18);
    
        company c3 = new company("Indigo",total_flights,list_of_employees);
        total_flights.clear() ; 
        list_of_employees.clear() ; 
    
        company total_company[] = new company[3];
        total_company[0] = c1; //AirIndia
        total_company[1] = c2; //AirAsia
        total_company[2] = c3; //Indigo

        login.put("harshitgoel413@gmail.com" , "58") ;

        passenger p2 = new passenger("Harshit",19,"harshitgoel413@gmail.com",90347);
        details.put("harshitgoel413@gmail.com" , p2) ;

        Vector<pair2> flight_names = f.get_all_flights_fromStoD(total_company , "Delhi" , "Chennai") ;
        f.book_ticket(flight_names , "AirIndia" , 2 , p2);

        login.put("diprachaudhry18@gmail.com" , "46") ;
        passenger p3 = new passenger("Dipra" , 19 , "diprachaudhry18@gmail.com" , 98798);
        details.put("diprachaudhry18@gmail.com" , p3) ;

        Vector<pair2> flight_names1 = f.get_all_flights_fromStoD(total_company , "Delhi" , "Chennai");
        f.book_ticket(flight_names, "AirIndia", 2, p3);



        int choice=0;
        while(choice!=-1){
            // system("Color F3");
            int digit ;
            System.out.println(" ") ;
            System.out.println(" ") ;
            
            System.out.println("                        WELCOME TO AIR TICKET BOOKING SYSTEM") ; 
            System.out.println(" ") ; 

            System.out.println("                               Select the desired view") ; 
            System.out.println(" ") ; 
            System.out.println(" ") ; 
            System.out.println(" ") ; 
            System.out.println(" ") ; 


            System.out.println("Press 1 for customer.") ; 
            System.out.println("Press 2 for admin.") ; 
            System.out.println("Press any other digit to exit.") ; 
            
            digit = scan.nextInt() ;

           // System.out.print("\033[1F\33[K"); 
            clrscr();
            System.out.flush();

            if(digit==1){
                System.out.println("Press 1 to login.") ;
                System.out.println("Press 2 to sign up.") ;  
                System.out.println("Press any other key to exit.") ;
                
                int n = scan.nextInt() ;

              //  System.out.print("\033[1F\33[K"); 
                clrscr();
                System.out.flush();  

                if(n==1){
                    String email , password ;
                    boolean emailPasswordMatched = false ; 
                    while(true){

                    
                    System.out.println("Enter email id   : ") ; 
                    email = scan.next() ;

                    System.out.println() ; 

                    System.out.println("Enter password   : ") ; 
                    password = scan.next() ; 
                    System.out.println() ; 
                    System.out.println() ; 
                    System.out.println() ; 


                    // System.out.print("\033[H\033[2J");  
                    // System.out.flush();  

                    if(login.containsKey(email)==true){
                        if( (login.get(email)).equals(password) ){
                            emailPasswordMatched = true ; 
                            System.out.println("Logged in successfully!") ; 
                            System.out.println("Press enter key to continue") ; 
                            try
                            {
                                System.in.read();
                            }  
                            catch(Exception e)
                            {} 
                           // System.out.print("\033[H\033[2J");  
                            clrscr();
                            System.out.flush(); 

                            System.out.println("Press 1 to book a ticket.") ;
                            System.out.println("Press 2 to print a previously booked ticket.") ; 
                            System.out.println("Press 3 to unbook a ticket.") ;  

                            int c = scan.nextInt() ; 

                          //  System.out.print("\033[1F\33[K"); 
                            clrscr();
                            System.out.flush();  
                            if(c==1){
                                passenger p = details.get(email) ;
                                String source,destination ;
                                System.out.println("Enter starting location : ") ; 
                                source = scan.next() ; 
                                System.out.println() ; 

                                System.out.println("Enter destination : ") ; 
                                destination = scan.next() ; 
                                System.out.println(" ") ; 

                                Vector<pair2>v=f.get_all_flights_fromStoD(total_company,source,destination);

                                int num_comps_S_D_matched = 0 ;
                                for(int i=0 ; i<3 ; i++){
                                    int x = f.get_flight_schedule(total_company[i],source,destination);
                                    num_comps_S_D_matched += x ; 
                                    if(x==0){
                                        continue;
                                    }
                                }
                                
                                if(num_comps_S_D_matched==0){
                                    System.out.println("No flights found from "+source+" to "+destination) ;
                                    //hold screen
                                    System.out.println() ; 
                                    System.out.println() ;

                                    System.out.println("Press enter key to continue") ; 
                                    try
                                    {
                                        System.in.read();
                                    }  
                                    catch(Exception e)
                                    {} 
                                    //System.out.print("\033[H\033[2J");  
                                    clrscr();
                                    System.out.flush(); 
                                }else{
                                    //hold screen
                                    System.out.println("Press enter key to continue") ; 
                                    try
                                    {
                                        System.in.read();
                                    }  
                                    catch(Exception e)
                                    {} 
                                    //System.out.print("\033[H\033[2J"); 
                                    clrscr(); 
                                    System.out.flush(); 

                                    System.out.println("Enter C to compare flight rates.") ; 
                                    System.out.println(" ") ; 
                                    System.out.println(" ") ;

                                    
                                    char x = scan.next().charAt(0) ;

                                    if(x=='C' || x=='c'){
                                        f.compare_rates(v);
                                    }

                                    System.out.println(" ") ;
                                    System.out.println("Enter company name to book tickets :- ") ;
                                    
                                    String Company_name;
                                    while(true){
                                        Company_name = scan.next() ; 
                                        boolean nameFound = false ;

                                        if(Company_name.equals("Indigo") || Company_name.equals("AirIndia") || Company_name.equals("AirAsia")){
                                            nameFound = true ; 
                                            break ; 
                                        }
                                    }
                                    

                                  //  System.out.print("\033[1F\33[K");
                                    clrscr();  
                                    System.out.flush();  
                                    int digit1 ; 

                                    System.out.println("Enter 1 for Economy ") ; 
                                    System.out.println("Enter 2 for Executive") ; 
                                    System.out.println("Enter 3 for Business ") ; 

                                    while(true){
                                        digit1 = scan.nextInt();
                                        if(digit1==1 || digit1==2 || digit1==3){
                                            break ; 
                                        }else{
                                            System.out.println("Wrong number entered");
                                            System.out.println("Try again");
                                        }
                                    }
                                    

                                  //  System.out.print("\033[1F\33[K"); 
                                    clrscr();
                                    System.out.flush();  
                                    f.book_ticket(v , Company_name , digit1 , p);

                                    //hold screen
                                    System.out.println() ; 
                                    System.out.println() ; 
                                    System.out.println("Press enter key to continue") ; 
                                    try
                                    {
                                        System.in.read();
                                    }  
                                    catch(Exception e)
                                    {} 
                                    //System.out.print("\033[1F\33[K"); 
                                    clrscr();
                                    System.out.flush(); 

                                    //check
                                    System.out.println("Your ticket is :  ") ; 
                                    f.print_ticket(p);

                                    //hold screen
                                    System.out.println("Press enter key to continue") ; 
                                    try
                                    {
                                        System.in.read();
                                    }  
                                    catch(Exception e)
                                    {} 
                                   // System.out.print("\033[H\033[2J");  
                                    clrscr();
                                    System.out.flush(); 
                                }

                            }
                            else if(c==2){
                                System.out.println("Enter pnr number of the ticket.") ; 
                                int pnr = scan.nextInt() ;

                                pair1 object = f.ourMap.get(pnr) ;
                                passenger P=object.p;
                                f.print_ticket(P);

                                //hold screen
                                System.out.println() ; 
                                System.out.println() ; 

                                System.out.println("Press enter key to continue") ; 
                                try
                                {
                                    System.in.read();
                                }  
                                catch(Exception e)
                                {} 
                               // System.out.print("\033[1F\33[K");  
                                clrscr();
                                System.out.flush();  
                            }
                            else if(c==3){
                                    int num;
                                    System.out.println("Enter PNR Number.") ;                        
                                    num = scan.nextInt() ; 
                                    f.unbook_flight(num);

                                     //hold screen
                                    System.out.println() ; 
                                    System.out.println() ; 

                                    System.out.println("Press enter key to continue") ; 
                                    try
                                    {
                                        System.in.read();
                                    }  
                                    catch(Exception e)
                                    {} 
                                   // System.out.print("\033[H\033[2J");
                                    clrscr();  
                                    System.out.flush(); 
                            }
                            break ; 
                        }
                        else{
                            System.out.println("The password is incorrect.") ; 
                            System.out.println("Try Again") ; 
                            //hold screen
                            System.out.println() ; 
                            System.out.println() ; 

                            System.out.println("Press enter key to continue") ; 
                            try
                            {
                                System.in.read();
                            }  
                            catch(Exception e)
                            {} 
                           // System.out.print("\033[1F\33[K"); 
                            clrscr();
                            System.out.flush();  
                        }
                        
                    }
                    else{
                        System.out.println("The email is not registered.") ; 
                        System.out.println("Try Again") ; 
                        
                        //hold screen
                        System.out.println() ; 
                        System.out.println() ; 

                        System.out.println("Press enter key to continue") ; 
                        try
                        {
                            System.in.read();
                        }  
                        catch(Exception e)
                        {} 
                       // System.out.print("\033[1F\33[K");  
                        clrscr();
                        System.out.flush();   
                    }
                }
                }
                else if(n==2){
                    //sign up
                    String name , mail , source , destination , password;
                    int age, phNo ;
                    System.out.println("Enter name : ") ; 
                    name = scan.next() ;

                    System.out.println("Enter age : ") ; 
                    age = scan.nextInt() ; 
                    System.out.println("Enter email : ") ; 

                    while(true){
                        mail = scan.next() ;

                        //checking format of id
                        int index1 = mail.indexOf('@') ; //checking for @
                        int index2 = mail.indexOf(".com") ; //checking for .com in mail
                        if((index1==-1) || (index2==-1)){
                            //wrong format 
                            System.out.println("Wrong mail format !") ; 
                            System.out.println("Try Again") ; 
                        }else{
                            //correct mail format
                            break ; 
                        }
                    }
                    

                    System.out.println("Enter password : ") ; 
                    password = scan.next() ; 

                    System.out.println("Enter phone number : ") ; 
                    phNo = scan.nextInt() ; 

                    if(login.containsKey(mail)==true){
                        System.out.println("Already registered!") ; 
                    }else{
                        System.out.println("Successfully registered!") ; 
                        login.put(mail , password) ; 
                    }

                     //hold screen
                     System.out.println() ; 
                     System.out.println() ; 

                     System.out.println("Press enter key to continue") ; 
                     try
                     {
                         System.in.read();
                     }  
                     catch(Exception e)
                     {} 
                    // System.out.print("\033[H\033[2J");  
                     clrscr();
                     System.out.flush(); 
                    


                    passenger p1 = new passenger(name , age , mail , phNo) ; 
                    details.put(mail , p1) ;

                    System.out.println("Do you want to book a ticket? Y/N ");
                    char c ; 
                    c = scan.next().charAt(0) ; 
                    if(c=='Y' || c=='y'){
                        System.out.println("Enter starting location : ") ; 
                        source = scan.next() ;
                        System.out.println("Enter destination : ") ; 
                        destination = scan.next() ; 

                        System.out.println() ; 
                        Vector <pair2> v = f.get_all_flights_fromStoD(total_company,source,destination) ;
                         


                        int num_comps_S_D_matched1 = 0 ;
                        for(int i=0 ; i<3 ; i++){
                            int x = f.get_flight_schedule(total_company[i],source,destination);
                            num_comps_S_D_matched1 += x ;
                            if(x==0){
                                    continue;
                            }
                        }

                        if(num_comps_S_D_matched1==0){
                            System.out.println("No flights found from "+source+" to "+destination) ;
                            //hold screen
                            System.out.println() ; 
                            System.out.println() ; 

                            System.out.println("Press enter key to continue") ; 
                            try
                            {
                                System.in.read();
                            }  
                            catch(Exception e)
                            {} 
                            //System.out.print("\033[H\033[2J");  
                            clrscr();
                            System.out.flush(); 
                        }
                        
                        else{
                            //hold screen
                            System.out.println() ; 
                            System.out.println() ; 

                            System.out.println("Press enter key to continue") ; 
                            try
                            {
                                System.in.read();
                            }  
                            catch(Exception e)
                            {} 
                            //System.out.print("\033[H\033[2J");  
                            clrscr();
                            System.out.flush(); 


                            System.out.println("Enter C to compare flight rates.") ; 
                            System.out.println(" ") ; 

                            char x = scan.next().charAt(0) ; 
                            if(x=='C'){
                                f.compare_rates(v);
                            }
                            System.out.println("Enter company name to book tickets :- ") ; 
                            String Company_name = scan.next() ; 
                           // System.out.print("\033[1F\33[K"); 
                            clrscr();
                            System.out.flush();  

                            System.out.println("Enter 1 for Economy ") ; 
                            System.out.println("Enter 2 for Executive ") ; 
                            System.out.println("Enter 3 for Business ") ; 

                            int digit2 ;
                            while(true){
                                digit2 = scan.nextInt() ;
                                if(digit2==1 || digit2==2 || digit2==3){
                                    break ; 
                                } else{
                                    System.out.println("Wrong number entered!");
                                    System.out.println("Try Again");
                                }
                            } 
                            
                            //System.out.print("\033[1F\33[K"); 
                            clrscr();  
                            System.out.flush();  
                            f.book_ticket(v,Company_name,digit,p1); 

                            //hold screen
                            System.out.println() ; 
                            System.out.println() ; 
                            System.out.println("Press enter key to continue") ; 
                            try
                            {
                                System.in.read();
                            }  
                            catch(Exception e)
                            {} 
                           // System.out.print("\033[H\033[2J");  
                            clrscr();
                            System.out.flush(); 

                            System.out.println("Your ticket is :- ") ; 
                            f.print_ticket(p1);
                            
                            //hold screen
                            System.out.println() ; 
                            System.out.println() ; 

                            System.out.println("Press enter key to continue") ; 
                            try
                            {
                                System.in.read();
                            }  
                            catch(Exception e)
                            {} 
                            //System.out.print("\033[H\033[2J"); 
                            clrscr(); 
                            System.out.flush(); 
                        }


                    }else{
                       // System.out.print("\033[H\033[2J"); 
                        clrscr(); 
                        System.out.flush(); 
                    }                
                            
                }
                else{
                    break;
                }
            }
            else if(digit==2){
                //ADMIN VIEW
                System.out.println("Press 1 to view passenger details") ; 
                System.out.println("Press 2 to view employee details") ; 
                System.out.println("Press 3 to add new employee") ; 
                System.out.println("Press 4 to fire existing employee") ; 
                System.out.println("Press 5 to add new flights") ; 
                System.out.println("Press 6 to remove an existing flight") ; 


                int n = scan.nextInt() ; 
                //System.out.print("\033[H\033[2J");  
                clrscr();
                System.out.flush(); 

                if(n==1){
                    System.out.println("Enter flight name.") ; 
                    String flight_name = scan.next();
                    System.out.println() ; 
                    f.admin(total_company,flight_name,"/0") ;

                     //hold screen
                     System.out.println() ; 
                     System.out.println() ; 

                     System.out.println("Press enter key to continue") ; 
                     try
                     {
                         System.in.read();
                     }  
                     catch(Exception e)
                     {} 
                    // System.out.print("\033[H\033[2J");  
                     clrscr();
                     System.out.flush(); 
                }
                
       

                
                else if(n==2){
                    //view employee details
                    System.out.println("Enter company name : ") ; 
                    String comp_name = scan.next() ;

                    System.out.println() ; 
                    f.admin(total_company,"\0",comp_name);
                    //hold screen
                    System.out.println() ; 
                    System.out.println() ; 

                    System.out.println("Press enter key to continue") ; 
                    try
                    {
                        System.in.read();
                    }  
                    catch(Exception e)
                    {} 
                    //System.out.print("\033[H\033[2J");  
                    clrscr();
                    System.out.flush(); 
                }
           

                else if(n==3){
                    //adding new employee
                    String comp_name ; 
                    int index ; 
                    System.out.println("Enter company name : ") ; 
                    while(true){   
                        comp_name = scan.next() ;
                        index = -1 ; 

                        if(comp_name.equals("Indigo")){
                            index = 2 ; 
                            break ; 
                        }else if(comp_name.equals("AirAsia")){
                            index = 1 ; 
                            break ; 
                        }else if(comp_name.equals("AirIndia")){
                            index = 0 ;
                            break ;   
                        }else{
                            System.out.println("Wrong company name!") ; 
                            System.out.println("Try again") ; 
                        }
                    }

                    String name , mail , post ;
                    int age, phNo , employee_id ;
                    System.out.println("Enter name : ") ; 
                    name = scan.next() ;

                    System.out.println("Enter age : ") ; 
                    age = scan.nextInt() ; 

                    System.out.println("Enter email : ") ; 
                    while(true){
                        mail = scan.next() ;

                        //checking format of id
                        int index1 = mail.indexOf('@') ; //checking for @
                        int index2 = mail.indexOf(".com") ; //checking for .com in mail
                        if((index1==-1) || (index2==-1)){
                            //wrong format 
                            System.out.println("Wrong mail format !") ; 
                            System.out.println("Try Again") ; 
                        }else{
                            //correct mail format
                            break ; 
                        }
                    }

                    System.out.println("Enter employee post : ") ; 
                    post = scan.next() ; 
                    

                    System.out.println("Enter Phone Number : ") ; 
                    phNo = scan.nextInt() ; 

                    System.out.println("Enter employee ID : ") ; 
                    employee_id = scan.nextInt() ;
                    
                    employee new_emp = new employee(name,age,mail,phNo ,post,employee_id,comp_name);
                    total_company[index].list_of_employees.add(new_emp) ; 
                    System.out.println() ; 
                    System.out.println() ; 
                    System.out.println("New employee has been added!") ; 

                    //hold screen
                    System.out.println() ; 
                    System.out.println() ; 

                    System.out.println("Press enter key to continue") ; 
                    try
                    {
                        System.in.read();
                    }  
                    catch(Exception e)
                    {} 
                    //System.out.print("\033[H\033[2J");  
                    clrscr();
                    System.out.flush(); 

                }else if(n==4){
                    //fire employee
                    String comp_name ; 
                    int index ; 
                    System.out.println("Enter company name : ") ; 
                    while(true){
                        comp_name = scan.next() ;
                        index = -1 ; 

                        if(comp_name.equals("Indigo")){
                            index = 2 ; 
                            break ; 
                        }else if(comp_name.equals("AirAsia")){
                            index = 1 ; 
                            break ; 
                        }else if(comp_name.equals("AirIndia")){
                            index = 0 ;
                            break ;   
                        }else{
                            System.out.println("Wrong company name") ; 
                            System.out.println("Try again") ; 
                        }
                    }

                    System.out.println("Enter employee ID : ") ; 
                    while(true){
                        int emp_id = scan.nextInt() ; 

                        boolean emp_removed = false ; 
                        for(int x=0 ; x<total_company[index].list_of_employees.size() ; x++){
                            employee emp = total_company[index].list_of_employees.get(x) ; 
                            if(emp.employee_id==emp_id){
                                //delete this employee
                                total_company[index].list_of_employees.remove(x) ; 
                                emp_removed = true ; 
                                System.out.println() ; 
                                System.out.println() ; 
                                System.out.println("Employee fired!") ; 

                                 //hold screen
                                System.out.println() ; 
                                System.out.println() ; 

                                System.out.println("Press enter key to continue") ; 
                                try
                                {
                                    System.in.read();
                                }  
                                catch(Exception e)
                                {} 
                                //System.out.print("\033[H\033[2J");  
                                clrscr();
                                System.out.flush(); 

                                break ; 
                            }
                        }

                        if(emp_removed==false){
                            System.out.println("Wrong employee ID") ; 
                            System.out.println("Try Again") ; 
                        }else{
                            break ; 
                        }
                    }
                    

                }else if(n==5){
                    //add new flight
                    String comp_name ; 
                    int index ; 
                    System.out.println("Enter company name : ") ; 
                    while(true){
                        comp_name = scan.next() ;
                        index = -1 ; 

                        if(comp_name.equals("Indigo")){
                            index = 2 ; 
                            break ; 
                        }else if(comp_name.equals("AirAsia")){
                            index = 1 ; 
                            break ; 
                        }else if(comp_name.equals("AirIndia")){
                            index = 0 ;
                            break ;   
                        }else{
                            System.out.println("Wrong company name") ; 
                            System.out.println("Try again") ; 
                        }
                    }

                    System.out.println("Enter flight details here") ;
                    String flight_name , source , destination ; 
                    int arrival_time, departure_time, economy_fare, executive_fare, business_fare ;


                    System.out.println("Enter Flight Name : ") ; 
                    flight_name= scan.next() ; 

                    System.out.println("Enter Source : ") ; 
                    source= scan.next() ; 

                    System.out.println("Enter Destination : ") ; 
                    destination = scan.next() ; 
                    

                    System.out.println("Enter Arrival Time : ") ; 
                    arrival_time = scan.nextInt() ; 

                    System.out.println("Enter Departure Time : ") ; 
                    departure_time = scan.nextInt() ; 

                    System.out.println("Enter Economy Fare : ") ; 
                    economy_fare = scan.nextInt() ; 

                    System.out.println("Enter Executive Fare : ") ; 
                    executive_fare = scan.nextInt() ; 

                    System.out.println("Enter Business Fare : ") ; 
                    business_fare = scan.nextInt() ; 

                    flight new_flight = new flight(flight_name, source, destination, arrival_time, departure_time, economy_fare , executive_fare , business_fare) ; 
                    total_company[index].total_flights.add(new_flight) ; 
                    System.out.println() ; 
                    System.out.println() ; 
                    System.out.println("Flight "+flight_name +" has been added !") ; 


                    //hold screen
                    System.out.println() ; 
                    System.out.println() ; 
 
                    System.out.println("Press enter key to continue") ; 
                    try
                    {
                        System.in.read();
                    }  
                    catch(Exception e)
                    {} 
                   // System.out.print("\033[H\033[2J");  
                    clrscr();
                    System.out.flush(); 

                }else if(n==6){
                    //remove flights
                    String comp_name , flight_name ; 
                    int index ; 
                    System.out.println("Enter company name : ") ; 
                    while(true){
                        comp_name = scan.next() ;
                        index = -1 ; 

                        if(comp_name.equals("Indigo")){
                            index = 2 ; 
                            break ; 
                        }else if(comp_name.equals("AirAsia")){
                            index = 1 ; 
                            break ; 
                        }else if(comp_name.equals("AirIndia")){
                            index = 0 ;
                            break ;   
                        }else{
                            System.out.println("Wrong company name") ; 
                            System.out.println("Try again") ; 
                        }
                    }

                    System.out.println("Enter flight name : ") ;
                    flight_name = scan.next() ; 
                    boolean flightRemoved = false ;

                    while(true){
                        for(int x = 0 ; x<total_company[index].total_flights.size() ; x++){
                            flight currFlight = total_company[index].total_flights.get(x) ; 
                            
                            if(currFlight.flight_name.equals(flight_name)){
                                System.out.println() ; 
                                System.out.println() ; 
                                System.out.println("Flight "+flight_name +" has been removed!") ;
                                flightRemoved = true ; 
                                total_company[index].total_flights.remove(x) ; 

                                //hold screen
                                System.out.println() ; 
                                System.out.println() ; 
            
                                System.out.println("Press enter key to continue") ; 
                                try
                                {
                                    System.in.read();
                                }  
                                catch(Exception e)
                                {} 
                               // System.out.print("\033[1F\33[K");  
                                clrscr();
                                System.out.flush();                                 
                                break ; 
                            }
                        }
    
                        if(flightRemoved==false){
                            System.out.println("Wrong flight name") ; 
                            System.out.println("Try again") ; 
                        }else{
                            break ; 
                        }
                    }
                    
                }
            }
            else{
                break;
            }
    }

    System.out.println("Termination of program.") ;
    scan.close();
}


}

    

