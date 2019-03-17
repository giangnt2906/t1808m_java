package Session4;

public class Sanpham {
    private int id;
    private String ten;
    private double gia;
    private int soluong;

    public Sanpham(int id, String ten, double gia,int soluong){
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
    }

    public void Tinhtien(){
        System.out.println(this.id+"."+this.ten+"--mua "+this.soluong+"--thanh tien: "+this.gia*this.soluong);
    }

    public double giaTien(){
        return this.gia*this.soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void ThemSoluong(int soluongthem){
        this.soluong += soluongthem;
    }

    public int KtId(){
        return this.id;
    }

}
