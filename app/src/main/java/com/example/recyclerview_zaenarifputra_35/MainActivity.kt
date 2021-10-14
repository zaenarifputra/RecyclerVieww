package com.example.recyclerview_zaenarifputra_35

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pahlawanList = listOf<Pahlawan>(
            Pahlawan(
                R.drawable.sokarno,
                "Soekarno",
                "President 1 Indonesia\n" +
                        "Kelahiran: 6 Juni 1901, Peneleh, Surabaya\n" +
                        "Meninggal: 21 Juni 1970, Rumah Sakit Pusat Angkatan Darat Gatot Soebroto, Jakarta\n" +
                        "Masa kepresidenan: 18 Agustus 1945 – 12 Maret 1967"
            ),
            Pahlawan(
                R.drawable.rakartini,
                "R.A.Kartini",
                "Menyetarakan Kaum Perempuan\n" +
                        "Kelahiran: 21 April 1879, Jepara\n" +
                        "Meninggal: 17 September 1904, Kabupaten Rembang\n" +
                        "Nama lengkap: Raden Ajeng Kartini Djojo Adhiningrat\n" +
                        "Pasangan: Raden Adipati Joyodiningrat (m. 1903–1904)\n" +
                        "Pendidikan: Europeesche Lagere School"
            ),
            Pahlawan(
                R.drawable.mohhatta,
                "Dr.H.Mohammad Hatta",
                "Wakil President 1 Indonesia\n" +
                        "Kelahiran: 12 Agustus 1902, Bukittinggi\n" +
                        "Meninggal: 14 Maret 1980, Dr. Cipto Mangunkusumo Hospital\n" +
                        "Pasangan: Siti Rahmiati Hatta (m. 1945–1980)\n" +
                        "Anak: Halida Hatta, Meutia Hatta, Gemala Hatta\n" +
                        "Jabatan sebelumnya: Minister for Foreign Affairs of Indonesia (1949–1950)"
            ),
            Pahlawan(
                R.drawable.cutnya,
                "Tjoet Nja' Dhien",
                "Pejuang Gigih dari Aceh\n" +
                        "Kelahiran: 1848, Lamteh, Peukan Bada, Aceh Besar\n" +
                        "Meninggal: 6 November 1908, Sumedang\n" +
                        "Kebangsaan: Kerajaan Belanda\n" +
                        "Tempat pemakaman: Makam Cut Nyak Dien, Sumedang\n" +
                        "Orang tua: Teuku Nanta Seutia\n" +
                        "Pasangan: Teuku Umar (m. 1880–1899), Teuku Ibrahim Lam Nga (m. 1862–1878)\n" +
                        "Anak: Cut Gambang"
            ),
            Pahlawan(
                R.drawable.kihajar,
                "Ki Hadjar Dewantara",
                "Pendiri Perguruan Taman Siswa\n" +
                        "Kelahiran: 2 Mei 1889, Kadipaten Paku Alaman, Yogyakarta\n" +
                        "Meninggal: 26 April 1959, Yogyakarta\n" +
                        "Nama lengkap: Raden Mas Soewardi Soerjaningrat\n" +
                        "Pasangan: Nyi Sutartinah (m. ?–1959)\n" +
                        "Pendidikan: School tot Opleiding van Indische Artsen, Europeesche Lagere School\n" +
                        "Anak: Bambang Sokawati Dewantara, Ratih Tarbiyah,"
            ),
            Pahlawan(
                R.drawable.patimura,
                "Kapitan Pattimura",
                "Merupakan Pahlawan dari Maluku\n" +
                        "Kelahiran: 8 Juni 1783, Haria\n" +
                        "Meninggal: 16 Desember 1817, Kota Ambon\n" +
                        "Nama lengkap: Thomas Matulessy" +
                        "Kebangsaan: Indonesia\n" +
                        "Penghargaan: National Hero of Indonesia\n" +
                        "Orang tua: Frans Matulessia, Fransina Tilahoi\n" +
                        "Saudara kandung: Yohannes Matulessy"
            ),
            Pahlawan(
                R.drawable.sudirman,
                "Jendral Soedirman",
                "Sebagai Panglima Besar Tentara Nasional Indonesia Pertama\n" +
                        "Kelahiran: 24 Januari 1916, Kabupaten Purbalingga\n" +
                        "Meninggal: 29 Januari 1950, Magelang\n" +
                        "Nama lengkap: Raden Soedirman\n" +
                        "Tempat pemakaman: Taman Makam Pahlawan Nasional Kusuma Negara, Yogyakarta\n" +
                        "Pasangan: Alfiah (m. 1936–1950)\n" +
                        "Anak: Muhammad Teguh Bambang Tjahjadi, Ahmad Tidarwono"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_pahlawan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PahlawanAdapter(this,pahlawanList){
            val intent = Intent(this, DetailPahlawanActivity:: class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}