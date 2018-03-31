package praktek002;


public class penjualankipasangin {
   int harga_kipas;
   int jumlah_kipas;

    public penjualankipasangin() {
        harga_kipas=200000;
        jumlah_kipas=2;
    }
   
   
   
   void tampildata(){
    System.out.println("============================");
    System.out.println("harga_kipas   :"+harga_kipas);
    System.out.println("jumlah_kipas  :"+jumlah_kipas);
    System.out.println("============================");
   
   }
           int hitungpembelian(){
                int total;
                total=harga_kipas*jumlah_kipas;
                return total;
           }
           void cetaktotal(){
               System.out.println("totalnya :"+hitungpembelian());
                       
           }
}
