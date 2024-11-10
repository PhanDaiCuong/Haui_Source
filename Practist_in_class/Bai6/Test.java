package Bai6;
import java.util.Scanner;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        PartTimeEmployee[] arr = new PartTimeEmployee[n];
        PartTimeEmployee x;
        // Nhap thong tin nhan vien
        for(int i = 0; i < 2; i ++){
            boolean check = false;
            x = new PartTimeEmployee();
            // nhap thong tin den khi nhap dung thi dung lai
            while(!check){
                try{
                    check = true;
                    String mnv = sc.nextLine();
                    
                    String name = sc.nextLine();
                    
                    int age = sc.nextInt();
                    
                    sc.nextLine();
                    char gender = sc.nextLine().charAt(0);
                    
                    int luong = sc.nextInt();
                    
                    int hour = sc.nextInt();
                    sc.nextLine();
                   
                    x = new PartTimeEmployee(name, age,  gender,  mnv,  luong, hour);
                }catch(Exception e){
                    check = false;
                    System.out.println("Du lieu nhap sai!");
                    System.out.println("Nhap lai!");
                }
            }
            arr[i] = x;
        }
        // Sap xep cac nhan vien theo luong
        Arrays.sort(arr, new Comparator<PartTimeEmployee>(){

            @Override
            public int compare(PartTimeEmployee o1, PartTimeEmployee o2) {
                return o1.getLuong() - o2.getLuong();
            }

        });
        // In ra thong tin nhan vien
        for(int i = 0; i < 2; i++){
            System.out.println(arr[i]);
        }
    }
}
