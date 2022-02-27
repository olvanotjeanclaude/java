import java.util.ArrayList;

public class MobilePhone {
    private Boolean started=false;
    public ArrayList<Contacts> contacts=new ArrayList<Contacts>();

    public void start() {
        this.started=true;
    }
    
    public void menu(){
        System.out.println("Choose menu:");
        System.out.println("0-Quit\n 1-List\n contacts\n 2-Add New Contact\n 3-Update Existing Contact\n 4-Remove Contact\n 5-find Contact");
    }

   
    public void addContact(String name,String phoneNumber){
        Contacts contact= new Contacts(name, phoneNumber);
        this.contacts.add(contact);
    }

    public boolean findContact(String name,ArrayList<Contacts> contacts){
       for(Contacts contact : contacts){
            String currentName= contact.getName();
            if(currentName.equals(name)){
                return true;
            }
       }

       return false;
    }

    public Contacts getContacts(String name,ArrayList<Contacts> contacts){
      
    }

    public void lists(){
        for (Contacts contact : contacts) {
            System.out.println(contact.getName()+"=>"+contact.getPhoneNumber());
        }
    }

    public void quit(){
        if(this.started){
            this.started=false;
            System.out.println("Good Bye...");
        }
    }
}
