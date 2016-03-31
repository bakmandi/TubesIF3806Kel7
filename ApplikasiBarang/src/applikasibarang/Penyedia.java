package applikasibarang;
import java.util.ArrayList;

public class Penyedia extends Orang{
	private long id;
	private ArrayList<Barang> daftarBarang = new ArrayList();
	private String nama;
	private int jum_bar_p=0;
	
	public Penyedia(String nama, long id){
            super(nama);
            this.id=id;
	}
	
	public void createBarang(Barang b){
            daftarBarang.add(b);
            jum_bar_p++;
	}
        
        public void deleteBarang(int x){
            daftarBarang.remove(x);
            jum_bar_p--;
	}
	
	public void setId(long id){
            this.id=id;
	}
	
	public long getId(){
            return id;
	}
	
	public Barang getBarangPenyedia(int x){
		return daftarBarang.get(x);
	}
	
	public void setNama(String nama){
		super.setNama(nama);
	}
	
	public String getNama(){
		return super.getNama();
	}
	
	public int getJumbarP(){
		return daftarBarang.size();
	}
	
	public String jenisOtoritas(){
		return "Penyedia";
	}
	
	public void Display(){
		int mbl=0,mtr=0,uniden=0;
		System.out.println("=============================");
		System.out.println("Penyedia : "+super.getNama());
		System.out.println("=============================");
		for (int i=0;i<daftarBarang.size();i++){
			System.out.print("Barang ke-"+(i+1)+" : ");
                        System.out.println("ID : "+daftarBarang.get(i).getId());
			System.out.println("Nama : "+daftarBarang.get(i).getNama());
                        System.out.println("Jenis : "+daftarBarang.get(i).getjenis());
                        System.out.println("=============================");
                }
	}
}
