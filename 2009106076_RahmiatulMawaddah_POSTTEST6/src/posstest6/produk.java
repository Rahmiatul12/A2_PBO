/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posstest6;




/**
 *
 * @author Hp
 */
public class produk extends Toko implements interfaceToko {
  
    private int harga;
    private boolean Jambuka;
    private boolean Jamtutup;



   public produk(int Id,int Jum, String Barang, int harga){
      super(Id, Jum, Barang);
      this.harga = harga;
   }
    void display(){
        System.out.println("Id Produk     : " + this.Id);
        System.out.println("Nama Produk   : " + this.Barang);
        System.out.println("Jumlah Produk : " + this.Jum);
        System.out.println("Harga Produk  : " + this.harga);
}
public void JamBuka(){
    
        Jambuka = true;
        System.out.println("Bengkel Sudah Di buka..." + Buka);
}

public void JamTutup(){
        Jambuka = false;
        System.out.println("Bengkel Sudah Di Tutup..." + Tutup);
}
    public void ukuran(){
    System.out.println("Barang" + this.Barang+"berukuran M");
}

   public void setharga(int harga){
      this.harga= harga;
   }

   public int Getharga(){
      return harga;
   }

  
}
