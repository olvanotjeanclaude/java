public class Contacts {
    private String name;
    private String phoneNumber;
    
    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

   public Contacts(String name,String phoneNumber){
     this.name=name;
     this.phoneNumber=phoneNumber;
   }
}
