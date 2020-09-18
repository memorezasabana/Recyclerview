package com.study.myrecyclerview.myrecyclerview.model;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
            {"Bayu Eko Moektito", "Bayu Skak (nama asli Bayu Eko Moektito; lahir di Malang, Jawa Timur, 13 November 1993; umur 26 tahun) adalah seorang aktor, komedian, sutradara, dan personalia YouTube (YouTuber) berkebangsaan Indonesia. Pada 2009, saat Bayu masih bersekolah di SMK Grafika, ia bersama teman-temannya (Rengga, Deka, Hisyam dan Tofa) membentuk grup komedi bernama SKAK yang merupakan akronim dari Sekumpulan Arek Kesel (Bahasa Indonesia: Sekumpulan Anak Capek)",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a3/Bayu_Skak_2020.png"},
            {"Joshua Suherman", "Joshua Suherman (lahir di Surabaya, Jawa Timur, 3 November 1992; umur 27 tahun) adalah mantan penyanyi cilik Indonesia. Selain bernyanyi, Joshua juga menjadi bintang sinetron, bintang layar lebar, bintang iklan, dan sebagai presenter. Karier Joshua sebagai penyanyi cilik dimulai dalam album Cit Cit Cuit pada tahun 1996, dan kariernya mulai menanjak dengan lagu \"Air\" (yang juga dikenal dengan nama \"Diobok-Obok\")."
                    , "https://cdn0-production-images-kly.akamaized.net/xJ9Am7rjAMogmW1o495LeKwuutQ=/214x956:3373x5168/680x906/filters:quality(75):strip_icc():format(jpeg):watermark(kly-media-production/assets/images/watermarks/fimela/watermark-gray-portrait.png,560,20,0)/kly-media-production/medias/1614935/original/d624f1e735f8f2b8ef9cecacc1403100-011244300_1496677627-Joshua__7_.jpg"},
            {"Brandon Salim", "Brandon Nicholas Salim (lahir di Jakarta, 19 September 1996; umur 23 tahun) adalah seorang aktor, pembawa acara dan gitaris berkebangsaan Indonesia. Brandon memulai kariernya sebagai lead dari band yang dibentuk pada tahun 2008 dengan nama Lights ON. Posisinya sebagai lead guitarist sekaligus pencipta lagu. Ia dapat memainkan berbagai alat musik seperti gitar, drum, dan piano"
                    , "https://cdn0-production-images-kly.akamaized.net/8QmhT1sn5rsjVhOYtGfvj6LqjxM=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1045335/original/066863100_1446729879-20151105-Brandon-Salim-HZ-2.jpg"},
            {"Laura Theux", "Ni Made Laura Theux (lahir di Bali, 28 Maret 1996; umur 24 tahun) merupakan seorang aktris berkebangsaan Indonesia. Ia banyak membintangi FTV dan serial-serial TV. Nama Laura mulai mencuat sejak menjadi Duta Wisata Indonesia untuk Provinsi Bali 2013. Sejak itu ia mulai ditawari bermain di berbagai judul FTV, kemudian merambah ke serial televisi."
                    , "https://media.tabloidbintang.com/files/thumb/laura-theux_sen20180813_7.jpg/745"},
            {"Devina Aureel", "Devina Aureel (lahir di Malang, Jawa Timur, 25 Agustus 1996; umur 24 tahun) merupakan seorang aktris berkebangsaan Indonesia yang mengawali karier sebagai selebritas dunia maya."
                    , "https://cms.akurat.co/images/uploads/images/akurat_20190329103159_45e75U.jpg"},
            {"Anggika Sri Bolsterli", "Anggika Sri Bolsterli (lahir di Jakarta, 21 Juni 1995; umur 25 tahun) adalah seorang aktris berdarah Indonesia-Swiss. Ia pertama kali bermain di sinetron utamanya dalam sinetron Terbang Bersamamu pada tahun 2013. Ia mulai terkenal sejak perannya sebagai Astrid dalam sinetron Putri Duyung."
                    , "https://media.tabloidbintang.com/files/thumb/anggika-bolsterli_sen20180621_11.jpg/745"},
            {"Erick Estrada Gagah Perkasa", "Erick Estrada Gagah Perkasa, yang lebih dikenal sebagai Erick Estrada (lahir di Surakarta, 17 Maret 1989; umur 31 tahun) adalah seorang aktor berkebangsaan Indonesia."
                    , "https://www.dailysia.com/wp-content/uploads/2018/12/Erick-Estrada-660x400.jpg?x99839"},
            {"Tri Yudiman", "Tri Yudiman (dulu dikenal sebagai Tri Budiman) merupakan seorang aktris film dan sinetron berkebangsaan Indonesia. Awal kariernya dimulai sebagai penyanyi dengan merilis album berjudul Kalau Boleh Kumencintaimu pada tahun 1995, tetapi album ini gagal di pasaran. Setelah itu namanya malah mencorong sebagai aktris sinetron."
                    , "https://upload.wikimedia.org/wikipedia/id/e/e8/Tri_Budiman.jpg"},
            {"Richard Oh", "Richard Oh (lahir di Tebingtinggi, Sumatera Utara, 30 Oktober 1959; umur 60 tahun) adalah tokoh sastra dan sastrawan berkebangsaan Indonesia. Dia bersama Takeshi Ichiki merupakan perintis perhelatan Kusala Sastra Khatulistiwa, sebuah ajang penganugerahan bagi sastrawan Indonesia berprestasi. Dia telah memublikasikan karya-karyanya dalam bentuk novel. Namanya juga dikenal sebagai sineas Indonesia, salah satunya adalah film The Lost Suitcase (Koper) yang disutradarainya pada tahun 2006."
                    , "https://upload.wikimedia.org/wikipedia/commons/c/ce/Richard_Oh_-_Did_Someone_Call_Cut%3F_%288061236935%29.jpg"},
            {"Cut Ratu Meyriska", "Cut Ratu Meyriska, yang dikenal dengan nama Cut Meyriska (lahir di Medan, 26 Mei 1993; umur 27 tahun) adalah seorang aktris, model dan penyanyi berkebangsaan Indonesia. Ia dikenal karena perannya sebagai Hellena Karin di Catatan Hati Seorang Istri dan Adriana di Anak Jalanan."
                    , "https://tentangsinopsis.b-cdn.net/wp-content/uploads/2019/05/10-Potret-Cut-Meyriska-Makin-dekat-dengan-Roger-Danuarta-1.jpg"},
    };

    public static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);

            list.add(hero);
        }
        return list;
    }
}
