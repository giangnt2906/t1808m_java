package Session4;
import java.util.ArrayList;
public class Donhang {
    private double tongtien = 0;
    private ArrayList<Sanpham> cart = new ArrayList<>();


    public void Mua(Sanpham sp, int soluongmua){
        int soluongcon;
        soluongcon = sp.getSoluong();
        if (soluongmua > soluongcon){
            System.out.println("So luong mua "+soluongmua+" la nhieu hon so luong hang con lai "+soluongcon+" cho san pham id "+sp.KtId());
            return;
        } else if (soluongcon == 0){
            System.out.println("Het hang cho san pham co id "+sp.KtId());
            return;
        }
        int option = 0;
        int index = 0;
        if (this.cart.size() == 0) {
            sp.setSoluong(soluongmua);
            this.cart.add(sp);
        } else {
            for (int i=0; i<this.cart.size(); i++){
                if (this.cart.get(i).KtId() == sp.KtId()){
                    option = 1;
                    index = this.cart.indexOf(this.cart.get(i));
                    break;
                }
            }
            if (option == 1){
                this.cart.get(index).ThemSoluong(soluongmua);
            } else {
                sp.setSoluong(soluongmua);
                this.cart.add(sp);
            }
        }
    }

    public void Indonhang(){
        for (int i=0; i<this.cart.size(); i++){
            this.cart.get(i).Tinhtien();
        }
    }

    public void TinhTong(){
        for (int i=0; i<this.cart.size(); i++){
            this.tongtien += this.cart.get(i).giaTien();
        }
        System.out.println("Tong tien cua don hang la: "+this.tongtien);
    }

    public static void main(String[] args){
        Sanpham sp1 = new Sanpham(1, "book", 10, 5);
        Sanpham sp2 = new Sanpham(2, "tivi", 20, 2);
        Sanpham sp3 = new Sanpham(3, "ball", 30, 0);
        Donhang dhang = new Donhang();
        dhang.Mua(sp1,4);
        dhang.Mua(sp2,3);
        dhang.Mua(sp3,0);
        dhang.Indonhang();
        dhang.TinhTong();
    }
}
