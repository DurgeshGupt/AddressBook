package addressbook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        int ch;
        ArrayList<Person> ob = new ArrayList<Person>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.DELEATE");
            System.out.println("ENTER YOUR CHOICE");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("enter name");
                    String name = sc.next();
                    System.out.println("enter lastname");
                    String lName = sc.next();
                    System.out.println("enter PhoneNumber");
                    int phoneNumber = sc.nextInt();
                    System.out.println("enter email");
                    String email = sc.next();
                    System.out.println("enter city");
                    String city = sc.next();
                    System.out.println("enter state");
                    String  state = sc.next();

                    ob.add(new Person(name, lName, phoneNumber, email, city, state));
                    break;
                case 2:
                    System.out.println("----------------");
                    Iterator<Person> i = ob.iterator();
                    while(i.hasNext()){
                        Person z = i.next();
                        System.out.println(z);

                    }
                    System.out.println("--------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("enter emPhone to search");
                    String name1 = sc.nextLine();

                    System.out.println("----------------");
                    i = ob.iterator();
                    while(i.hasNext()) {
                        Person z = i.next();
                        if (z.getName() == name1) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("record not found");
                    }else
                        System.out.println("Record  Deleated Succesfully");


                    System.out.println("--------------");
                    break;


            }


        } while (ch != 0);
    }
}