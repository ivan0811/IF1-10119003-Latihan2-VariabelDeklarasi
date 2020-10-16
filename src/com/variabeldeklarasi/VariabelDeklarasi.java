package com.variabeldeklarasi;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untuk menampilkan deklarasi variabel dari berbagai macam tipe data
 */
public class VariabelDeklarasi {

    public static void main(String[] args) {
        //Deklarasi Variabel
        int nilaiInt;
        final double PHI = 3.14;
        boolean nilaiLogika;
        char nilaiKarakter;

        //Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';

        //menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai\t\t= "+nilaiInt);
        System.out.println("Isi variabel PHI\t\t= "+PHI);
        System.out.println("Isi variabel boolean\t= "+nilaiLogika);
        System.out.println("Isi variabel Karakter\t= "+nilaiKarakter);
    }
}
