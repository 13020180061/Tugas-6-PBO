/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 19 April 2020
	Waktu	: 17.41 WITA
*/

public class InheritanceKendaraan {
protected String nama;
protected int kapasitasPenumpang;
protected String warna;
/** Creates a new instance of Kendaraan */
public InheritanceKendaraan() {
}
public InheritanceKendaraan(String _nama,int _penumpang,String _warna) {
setNama(_nama);
setKapasitasPenumpang(_penumpang);
setWarna(_warna);
}
protected void setNama(String _nama){
nama = _nama;
}
protected void setKapasitasPenumpang(int _penumpang){
kapasitasPenumpang = _penumpang;
}
protected void setWarna(String _warna){
warna = _warna;
}
protected String getNama(){
return nama;
}
protected int getKapasitasPenumpang(){
return kapasitasPenumpang;
}
protected String getWarna(){
return warna;
}
}