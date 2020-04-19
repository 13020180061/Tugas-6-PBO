/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 19 April 2020
	Waktu	: 19.11 WITA
*/

public class PolymorphismHewan
{
    public static void main(String[] args) 
    {
        PolymorphismMakhluk tombol;
        PolymorphismMamalia mamalia=new PolymorphismMamalia();
        PolymorphismSapi sapiSumba=new PolymorphismSapi();
        tombol=mamalia;
        tombol.info();      //polymorphism
        tombol=sapiSumba;
        tombol.info();      //polymorphism
    }
}