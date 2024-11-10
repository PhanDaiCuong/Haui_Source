package Bai10;

public class HocVienLT extends HocVien{
    protected double soBuoi;
    protected double donGia;
    
    public HocVienLT() {
        
    }

    public HocVienLT(String name, String diachi, String loaiUuTien, String loaiChuongTrinh, double soBuoi,
            double donGia) {
        super(name, diachi, loaiUuTien, loaiChuongTrinh);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }

    public double getUuTien(){
        if(loaiUuTien == "loai 1"){
            return 1000000;
        }else{
            return 500000;
        }
    }
    @Override
    public double tienHocPhi() {
        return this.soBuoi * donGia - getUuTien();
    }

    @Override
    public String toString() {
        return  super.toString()+ "HocVienLT [soBuoi=" + soBuoi + ", donGia=" + donGia + "Tien hoc phi: " + tienHocPhi() + "]";
    }
    
    
}
