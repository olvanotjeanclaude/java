import java.util.ArrayList;

class  Main{
  
  public static void main(String[] args) {
     MobilePhone mobile1= new MobilePhone();
    
     mobile1.addContact("olvanot", "05418869037");
     mobile1.addContact("jean claude", "05418869038");
     mobile1.addContact("rakotonirinia", "05418869039");

     mobile1.lists();

     Boolean olvanot= mobile1.findContact("rakotoniinia", mobile1.contacts);

     System.out.println(olvanot);
  }
}