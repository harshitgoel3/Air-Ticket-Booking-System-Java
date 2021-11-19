import java.util.* ;  

public class company {
    
    String company_name;
    Vector<flight> total_flights = new Vector<flight>() ;
    int num_of_flights;
    Vector<employee> list_of_employees = new Vector<employee>() ;

    company(){}

    company(String company_name, Vector<flight> total_flights, Vector<employee> list_of_employees){
        this.company_name=company_name;

        for(int i=0 ; i<total_flights.size() ; i++){
            this.total_flights.add(total_flights.get(i) );
        }
        num_of_flights = total_flights.size() ;

        for(int i=0 ; i<list_of_employees.size() ; i++){
            this.list_of_employees.add(list_of_employees.get(i) );
        }
    }
}

