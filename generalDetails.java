public class generalDetails {
    
    String name;
    int age;
    String email_address;
    int phone_number;
    generalDetails(){
        this.name="\0" ;
        this.age = 0 ;
        this.email_address="\0" ;
        this.phone_number = 0 ;
    }
    generalDetails(String name,int age,String email_address,int phone_number){
        this.name=name;
        this.age=age;
        this.email_address=email_address;
        this.phone_number=phone_number;
    }
    void display(){
        System.out.println("Name            :- " + name) ; 
        System.out.println("Age             :- " + age) ; 
        System.out.println("Email Address   :- " + email_address) ; 
        System.out.println("Phone Number    :- " + phone_number) ; 
       
    }

}
