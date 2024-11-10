package Bai11;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = 5;
        GiangVien arr[] = new GiangVien[n];
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String diaChi = sc.nextLine();
            String loaiGiangVien = sc.nextLine();
            if(loaiGiangVien.equals("GVThinhGiang")){
                int soTiet = sc.nextInt();
                int donGia = sc.nextInt();
                arr[i] = new GVThinhGiang(name, diaChi, loaiGiangVien, soTiet, donGia);
            }else{
                int luongCB = sc.nextInt();
                int HesoLuong = sc.nextInt();
                int thamNien = sc.nextInt();
                arr[i] = new GVCoHuu(name, diaChi, loaiGiangVien, luongCB, HesoLuong, thamNien);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
