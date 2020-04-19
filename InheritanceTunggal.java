/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 19 April 2020
	Waktu	: 17.47 WITA
*/

public class InheritanceTunggal{
public static void main(String[] args) {
//Membentuk Objek dari kelas Mobil
InheritanceMobil xenia = new InheritanceMobil("Xenia",6,"Hitam",100);
InheritanceMobil avanza = new InheritanceMobil("Avanza",8,"Putih",150);
//Memenggil Method CetakInfo dari masing-masing objek
xenia.cetakInfo();
avanza.cetakInfo();
}
}