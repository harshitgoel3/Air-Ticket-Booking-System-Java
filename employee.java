public class employee extends generalDetails{
    
    String post;
    int employee_id;
    String company_name;

    
    public employee(){
        this.post = "\0";
        this.employee_id = 0 ; 
        this.company_name = "\0";
    }

    public employee(String name,int age,String email_address,int phone_number,String post,int employee_id,String company_name){
        super(name,age,email_address,phone_number) ; 
        this.post=post;
        this.employee_id=employee_id;
        this.company_name=company_name;
    }

    public void display(){
        System.out.println("Name            :- " + name) ; 
        System.out.println("Age             :- " + age) ; 
        System.out.println("Email Address   :- " + email_address) ; 
        System.out.println("Phone Number    :- " + phone_number) ; 
        System.out.println("Post            :- " + post) ;
        System.out.println("Employee ID     :- " + employee_id) ;
        System.out.println("Company Name    :- " + company_name) ;
    }
    
}
