package Bai14;

public class CNTCN extends CongNhan{
    private  double luongCB, heSL;
    private  double soNC;
    public CNTCN() {
        
    }

    public CNTCN(String name, String ns, String place, String loaiCN, double luongCB, double heSL, double soNC) {
        super(name, ns, place, loaiCN);
        this.luongCB = luongCB;
        this.heSL = heSL;
        this.soNC = soNC;
    }
    public double thuong(){
        if(soNC < 20){
            return 0;
        }else{
            return luongCB *1.2;
        }
    }
    @Override
    public double thuNhap() {
        return this.luongCB * this.heSL + thuong();
    }
    public String toString(){
        return super.toString() + " " + "Luong CB: " + luongCB + " " + "He so luong: " + this.heSL + " " + "Thu Nhap: " + thuNhap();
    }
    
}
