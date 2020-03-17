/*   	Name 	: Andi Muhammad Ridhal Alfaridzi
	Stambuk : 13020180005
	Class 	: A1 Engineering Informatic
*/

public class Biodata {
	Integer nim;
	String  nama;
	String jurusan;
	String fakultas;

	public Biodata() {
	}

	public Biodata (Integer nim, String nama, String  jurusan, String fakultas){
		this.nim= nim;
		this.nama = nama;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void tampilData() {
		System.out.println("---> Nim = " + nim);
		System.out.println("---> Nama = " + nama);
		System.out.println("---> Jurusan =  " + jurusan);
		System.out.println("---> Fakultas = " + fakultas);
	}
}