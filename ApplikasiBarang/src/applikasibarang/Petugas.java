package applikasibarang;

public class Petugas extends Orang{
	private long id;
	private String nama;
	
	public Petugas(String nama, long id){
		super(nama);
		this.id=id;
	}
	
	public void setNama(String nama){
		super.setNama(nama);
	}
	
	public String getNama(){
		return super.getNama();
	}
	
	public void setId(long id){
		this.id=id;
	}
	
	public long getId(){
		return id;
	}
	
	public String jenisOtoritas(){
		return "Petugas";
	}
}
