package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();
    private ArrayList<Integer> rating = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {

        rating.add(R.drawable.star1);
        mImageUrls.add("http://www.asiawebdirect.com/media/images/hotels/2873/664459.jpg");
        mNames.add("The Chedi Club Tanah Gajah");
        mDesc.add("Ubud");
        mImageDet.add("     The Chedi Club di Tanah Gajah terletak dilokasi yang strategis di Desa Tengkulak, dengan satu kamar tidur yang dirancang dengan unik dan kolam renang yang tersebar dibeberapa titik. Tiga villa dengan satu kamar tidur seluas 160 m² menawarkan lebih banyak kenyamanan bagi pengunjung. Pengunjung yang ingin spa, dapat datang ke spa setiap hari dan spa gratis selama 90 menit di ruang perawatan pribadi. Terdapat dua kamar tidur seluas 550 meter persegi yang unik ini menampilkan beberapa lukisan, barang antik, dan artefak terbaik dari koleksi pribadi pemiliknya. Setiap villa memiliki Internet Broadband, iPod dock, televisi layar datar 32 inci, dan sistem hiburan Home Theater." +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Goa Gajah (6-minute walk)\n" +
                "2.  Ubud Monkey Forest (25 menit jalan kaki)\n" +
                "3.  Ubud Traditional Art Market (27 menit jalan kaki)\n" +
                "4.  Ubud Royal Palace (27 menit jalan kaki)\n" +
                "5.  Pura Dalem Ubud (31 menit jalan kaki)\n" +
                "6.  Campuhan Ridge Walk (34 menit jalan kaki)\n" +
                "7.  Tegenungan Waterfall (5.8 km berkendara)\n" +
                "8.  Bali Zoo (7.6 km berkendara)\n" +
                "9.  Bali Marine and Safari Park (10 km berkendara)\n" +
                "10.Tegallalang Rice Terrace (10 km berkendara)\n\n"+
                "Selamat berlibur ..");

        rating.add(R.drawable.star3);
        mImageUrls.add("http://www.asiawebdirect.com/media/images/hotels/3629/641867.jpg");
        mNames.add("Viceroy Bali");
        mDesc.add("Ubud");
        mImageDet.add("     Viceroy Bali menghadirkan akomodasi villa mewah di dataran tinggi yang sejuk dan pusat Kebudayaan Bali, Ubud. Resor bintang lima ini memanfaatkan lingkungan alamnya yang indah, bertengger di lembah hijau yang menghadap ke salah satu sungai legendaris di Bali. Para tamu disambut dengan hangat, tenang, dan pengunjung dapat menikmati masa tinggal yang dekat dengan alam dan jauh dari keriuhan kehidupan modern. Resor ini berjarak 90 menit transfer dari Bandara Internasional Ngurah Rai di Bali selatan, sedangkan pusat Ubud, di mana koleksi landmark yang harus dilihat, galeri seni, museum, dan barisan restoran mewah ditemukan, hanya berjarak 15 menit. Ubud Royal Palace - 37 min walk\n" +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Pasar Traditional Ubud (37 menit jalan kaki)\n" +
                "2.  Ubud Peliatan Balerung Stage  (34 menit jalan kaki)\n" +
                "3.  Pura Desa (36 menit jalan kaki\n" +
                "4.  Pura Taman Saraswati (37 menit jalan kaki)\n" +
                "5.  Pondok Pekak (38 menit jalan kaki)\n" +
                "6.  Puri Lukisan Museum (39 menit jalan kaki)\n" +
                "7.  Komaneka Fine Art Gallery (43 menit jalan kaki)\n" +
                "8.  Pura Dalem Ubud (44 menit jalan kaki)\n" +
                "9.  Ubud Monkey Forest (4.4 km berkendara)\n\n"+
                "Selamat berlibur ..");

        rating.add(R.drawable.star2);
        mImageUrls.add("http://www.asiawebdirect.com/media/images/hotels/42207/664525.jpg");
        mNames.add("The St. Regis Bali Resort");
        mDesc.add("Nusa Dua");
        mImageDet.add("     The St. Regis Bali Resort memiliki pantai yang indah memanjang dari Pantai Geger, tepat di sebelah selatan semenanjung Nusa Dua. Kumpulan suite, villa, dan restorannya yang luar biasa, serta ballroom dan ruang pertemuan canggih membuatnya menjadi resor yang tepat untuk bisnis dan liburan. Kepala pelayan yang terlatih siap membantu Anda dengan hampir semua kebutuhan Anda selama menginap dan menawarkan sentuhan kemewahan asli yang Anda dapatkan di St.Regis. Laguna biru yang luas berfungsi sebagai pusat kegiatan yang dikelilingi oleh villa laguna, masing-masing menawarkan kekayaan seni Bali dan desain yang terinspirasi. Villa-villa ini romantis dan sangat cocok untuk berbulan madu, yang menemukan pemandian bunga yang disiapkan khusus pada saat kedatangan ditambah buah manis, yang dicelupkan ke dalam fondue cokelat.Nusa Dua Beach (14-minute walk)\n" +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Bali Collection Shopping Centre (14 menit jalan kaki)\n" +
                "2.  Pasifika Museum (15 menit jalan kaki)\n" +
                "3.  Bali Nusa Dua Theater (16 menit jalan kaki)\n" +
                "4.  Puja Mandala (19 menit jalan kaki)\n\n"+
                "Selamat berlibur ..");

        rating.add(R.drawable.star2);
        mImageUrls.add("http://www.asiawebdirect.com/media/images/hotels/3636/284669.jpg");
        mNames.add("Kayumanis Jimbaran");
        mDesc.add("Jimbaran");
        mImageDet.add("     Kayumanis Jimbaran Private Estate and Spa menawarkan kemewahan bintang lima melalui koleksi villa kolam renang mewahnya di kawasan resor Pantai Jimbaran yang terkenal. Pasir Teluk Jimbaran yang asli hanya berjarak berjalan kaki singkat dari resor, menyusuri Jalan Yoga Perkanthi, salah satu dari sisi jalan yang tenang dari jalan utama Jimbaran. Kafe makanan laut matahari terbenam yang populer di Pantai Muaya berjarak beberapa menit ke selatan, dan layanan antar-jemput resor 24 jam dapat membawa anda ke area resor pantai yang lebih semarak di Kuta dan Legian dalam waktu 30 menit di utara, dan Bandara Internasional Ngurah Rai hanya berjarak 15 menit transfer dari daerah tetangga Tuban.In Jimbaran Bay\n" +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Pantai Jimbaran (10 menit jalan kaki)\n" +
                "2.  Samasta Lifestyle Village 28 menit jalan kaki)\n" +
                "3.  Uviversitas Udayana (3.9 km berkendara)\n" +
                "4.  Pantai Kuta (7.5 km berkendara)\n" +
                "5.  Waterbom Bali (7.5 km berkendara)\n" +
                "6.  Tanjung Benoa (8 km berkendara)\n" +
                "7.  Beachwalk Shopping Center (8.1 km berkendara)\n" +
                "8.  Legian Beach (8.8 km berkendara)\n" +
                "9.  Pantai Nusa Dua (9.5 km berkedaran)\n" +
                "10.Pantai Double Six (9.9 km berkendara)\n\n"+
                "Selamat berlibur ..");

        rating.add(R.drawable.star3);
        mImageUrls.add("http://www.asiawebdirect.com/media/images/hotels/55010/494431.jpg");
        mNames.add("The Legian");
        mDesc.add("Seminyak");
        mImageDet.add("     The Legian adalah resor mewah all-suite bintang lima yang terletak di bagian paling utara dari kawasan resor pantai di Legian, berbatasan langsung dengan tetangganya Seminyak. Resor ini sebenarnya berbagi Seminyaks Jalan Kayu Aya, yang dipagari dengan area tempat makan paling populer dan pusat perbelanjaan, tempat-tempat seperti Chandi Bali, Ultimo, Trattoria, The Junction dan Seminyak Square. Resor ini berjarak setengah jam perjalanan dari Bandara Internasional Ngurah Rai di Tuban, sementara pemandangan yang lebih hidup dapat ditemukan melalui toko dan jalan-jalan bar di Kuta, dalam 15 menit naik taksi ke selatan dari resor.Seminyak Beach (2-minute walk)\n" +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Eat Street (3 menit jalan kaki)\n" +
                "2.  Pura Petitenget (3 menit jalan kaki)\n" +
                "3.  Seminyak Square (3 menit jalan kaki)\n" +
                "4.  Pura Petitenget (3 menit jalan kaki)\n" +
                "5.  Pantai Gado Gado (6 menit jalan kaki)\n" +
                "6.  Pantai Batu Belig (14 menit jalan kaki)\n" +
                "7.  Double Six Beach (17 menit jalan kaki)\n\n"+
                "Selamat berlibur ..");

        rating.add(R.drawable.star1);
        mImageUrls.add("https://media.expedia.com/hotels/16000000/15380000/15375800/15375720/889640f6_z.jpg");
        mNames.add("The Ungasan Clifftop Resort");
        mDesc.add("Pecatu");
        mImageDet.add("     Bermalam di The Ungasan Clifftop Resort, Pecatu, resor ini berjarak 7 km dari Taman Budaya Garuda Wisnu Kencana dan 7,3 km dari New Kuta Golf. Fasilitas-fasilitas lainnya meliputi layanan cuci kering atau laundri, layanan 24 - jam kedepan, dan penyimpanan bagasi. Antar-jemput ke bandara disediakan dengan biaya tambahan (tersedia 24 jam), dan parkir mandiri gratis tersedia di lokasi.Pandawa Beach (40-minute walk)\n" +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Garuda Wisnu Kencana Cultural Park (42 menit jalan kaki)\n" +
                "2.  New Kuta Golf (5.1 km berkendara)\n" +
                "3.  New Kuta Green Park (5.8 km berkendara)\n" +
                "4.  Pantai Bingin (6 km berkendara)\n\n"+
                "Selamat berlibur ..");

        rating.add(R.drawable.star2);
        mImageUrls.add("http://www.asiawebdirect.com/media/images/hotels/2373/300440.jpg");
        mNames.add("Jamahal Private Resort");
        mDesc.add("Jimbaran");
        mImageDet.add("     Jamahal Private Resort and Spa menawarkan akomodasi villa bintang lima mewah di Jimbaran. Resor vila ini terletak di gang Gang Batu Putih yang terpencil di dekat Jalan Uluwatu utama Jimbaran, hanya dalam waktu 20 menit selatan dari Bandara Internasional Ngurah Rai. Pantai Kuta dan Legian hanya berjarak setengah jam naik taksi ke utara, sedangkan Jimbaran memiliki kafe matahari terbenam yang terkenal di garis pantai Muaya yang berada dalam jarak berjalan kaki dari resor, melewati Jimbaran Corner kompleks restoran dan butik perbelanjaan.Jimbaran Beach - 7 min walk\n" +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Samasta Lifestyle Village (25 menit jalan kaki)\n" +
                "2.  Udayana University (3.6 km berkendara)\n" +
                "3.  Pantai Kuta (7.3 km berkendara)\n" +
                "4.  Waterbom Bali (7.5 km berkendara)\n" +
                "5.  Tanjung Benoa (7.9 km berkendara)\n" +
                "6.  Beachwalk Shopping Center (8 km berkendara)\n" +
                "7.  Pantai Legian (8.7 km berkendara)\n" +
                "8.  Pantai Nusa Dua (9.4 km berkendara)\n" +
                "9.  Balangan (9.9 km berkendara)\n\n"+
                "Selamat berlibur ..");

        rating.add(R.drawable.star2);
        mImageUrls.add("https://media.expedia.com/hotels/14000000/13150000/13144400/13144371/ea089e30_z.jpg");
        mNames.add("Katamama");
        mDesc.add("Seminyak");
        mImageDet.add("     Bermalam di Katamama, anda akan berada di pusat kota Seminyak, hanya beberapa langkah dari Pantai Seminyak dan hanya 10 menit jalan kaki dari Eat Street.Fasilitas-fasilitasnya meliputi koran gratis di lobi, layanan cuci kering / laundri, dan 24 jam resepsionis. Antar-jemput ke bandara disediakan dengan biaya tambahan (tersedia 24 jam), dan parkir valet gratis tersedia di lokasi. Petitenget Temple (4-minute walk)\n" +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Pantai Petitenget (4 menit jalan kaki)\n" +
                "2.  Seminyak Square (8 menit jalan kaki)\n" +
                "3.  Pantai Batu Belig (8 menit jalan kaki)\n" +
                "4.  Eat Street (8 menit jalan kaki)\n" +
                "5.  Pantai Seminyak (8 menit jalan kaki)\n" +
                "6.  Pantai Berawa (17 menit jalan kaki)\n" +
                "7.  Echo Beach (39 menit jalan kaki)\n\n"+
                "Selamat berlibur ..");

        rating.add(R.drawable.star1);
        mImageUrls.add("https://media.expedia.com/hotels/13000000/12240000/12232600/12232583/61bcbf5f_z.jpg");
        mNames.add("Plataran Menjangan Resort and Spa");
        mDesc.add("Pejarakan");
        mImageDet.add("     Dengan bermalam di Plataran Menjangan Resort and Spa di Pejarakan, anda akan berada dalam jarak 15 menit berkendara dari Teluk Menjangan dan Taman Nasional Bali Barat.Fasilitas-fasilitasnya meliputi layanan dry cleaning / binatu, meja depan 24 jam, dan penyimpanan bagasi Antar-jemput ke bandara disediakan dengan biaya tambahan (tersedia 24 jam), dan parkir mandiri gratis tersedia di lokasi.Menjangan Bay - 12 min walk\n" +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Taman Wisata Bali Barat (4.8 km berkendara)\n" +
                "2.  Banyuwedang Hot Spring Water (9.5 km berkendara)\n" +
                "3.  Nature Conservation Forum Putri Menjangan (11.1 km berkendara)\n" +
                "4.  Bio-Rock Pemuteran Bali (17.3 km berkendara)\n" +
                "5.  Reef Seen Turtle Hatchery (17.5 km berkendara)\n" +
                "6.  Pantai Pemuteran (17.5 km berkendara)\n" +
                "7.  Pelabuhan Gilimanuk (20 km berkendara)\n" +
                "8.  Pura Pulaki (20.2 km berkendara)\n" +
                "9.  Atlas Pearl Farm (22.4 km berkendara)\n" +
                "10.Watudodol Beach (31.7 km berkendara)\n\n"+
                "Selamat berlibur ..");

        rating.add(R.drawable.star2);
        mImageUrls.add("http://www.asiawebdirect.com/media/images/hotels/78471/653160.jpg");
        mNames.add("Maya Sanur Resort and Spa");
        mDesc.add("Pejarakan");
        mImageDet.add("     Maya Sanur Resort & Spa, sebuah resor tepi pantai mewah yang terletak di pusat Sanur. Direncanakan sebagai resor bintang lima yang ramah lingkungan, Maya Sanur akan memiliki total 103 kamar, meliputi suite kolam renang tepi pantai yang luas, kamar akses laguna mewah, kamar deluxe view lagoon dan deluxe garden view. Fasilitas lainnya termasuk; tiga restoran bertema, bar pohon, 2 kolam renang besar, kolam renang anak-anak, akses internet gratis (Wi-Fi), spa, pusat kebugaran, studio yoga, perpustakaan, paviliun pernikahan di tepi pantai, ruang rapat dan fungsi. Inisiatif hijau memiliki telah dipromosikan di seluruh proses desain dan sekarang siap untuk implementasi. Sanur Beach - 25 min walk\n" +
                "\n\nDestinasi terdekat:\n\n" +
                "1.  Pantai Karang (7 menit jalan kaki)\n" +
                "2.  Pantai Sindhu (19 menit jalan kaki)\n" +
                "3.  Sanur Night Market (20 menit jalan kaki)\n" +
                "4.  Pantai Mertasari (22 menit jalan kaki)\n" +
                "5.  Bali Beach Golf Course (31 menit jalan kaki)\n" +
                "6.  Royal Thai Consulate (4.8 km berkendara)\n" +
                "7.  Lapangan Puputan Badung (9.5 km berkendara)\n" +
                "8.  Benoa Harbour (9.7 km berkendara)\n" +
                "10.Tanjung Benoa (10.7 km berkendara)\n\n"+
                "Selamat berlibur ..");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, mImageUrls, mDesc, mImageDet,rating);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mImageUrls);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}