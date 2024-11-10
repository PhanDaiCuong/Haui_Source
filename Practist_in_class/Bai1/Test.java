package Bai1;
import java.util.*;
public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name,  dob,  pob,  email,  phone;
        char gender;
        boolean check = false;
        Person x = new Person();
        while(!check){
            try{
                check = true;
                System.out.println("Nhap thong tin cho mot nguoi: ");
                name = sc.nextLine();
                dob = sc.nextLine();
                pob = sc.nextLine();
                email = sc.nextLine();
                phone = sc.nextLine();
                gender = sc.nextLine().charAt(0);
                System.out.println(name + " " + dob + " " + pob + " " + email+ " " + phone + " " + gender);
                x = new Person(name, dob, pob, email, phone, gender);
            }catch(Exception e){
                check = false;
                System.out.println("Nhap thong tin bi loi can nhap lai!");
            }
        }
        System.out.println(x);
        
    }

    
}
