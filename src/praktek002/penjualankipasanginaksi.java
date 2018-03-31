package praktek002;


public class penjualankipasanginaksi {
    public static void main(String[] args) {
          penjualankipasangin r1 = new penjualankipasangin();
          
          r1.harga_kipas = 300000;
          r1.jumlah_kipas = 2;
          
          r1.tampildata();
            System.out.println("total kipasangin  ="+r1.hitungpembelian());
            r1.cetaktotal();
            
            penjualankipasangin r2 = new penjualankipasangin();
            r2.tampildata();
            
            penjualankipasangin r3 = new penjualankipasangin(100000,4);
            r3.tampildata();
            
   
                
          
    }
}
