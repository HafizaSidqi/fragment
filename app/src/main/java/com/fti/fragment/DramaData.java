package com.fti.fragment;

import java.util.ArrayList;

public class DramaData {
    private static String[] title = new String[] {"Mouse", "The Penthouse", "Vincenzo", "Vagabond", "Chikago Typewriter", "Mr. Queen", "True Beauty", "DOTS", "Hotel del Luna", "Kingdom", "Taxi Driver"};

    private static int[] thumbnail = new int[]{R.drawable.mouse, R.drawable.thepenthouse, R.drawable.vincenzo, R.drawable.vagabond, R.drawable.chikagotypewriter,
    R.drawable.mrqueen, R.drawable.truebeauty, R.drawable.dots, R.drawable.hoteldelluna, R.drawable.kingdom, R.drawable.taxidriver};

    private static String[] detail = new String[]{
            "Mouse bercerita tentang Jung Ba Reum (Lee Seung Gi) yang merupakan seorang perwira polisi baru, yang bekerja di sebuah pos polisi. Dia adalah orang yang jujur dan berusaha untuk mencapai keadilan.\n" +
                    "\n" +
                    "Dalam suatu waktu, Ba Reum harus menghadapi seorang pembunuh psikopat, yang membuat seluruh bangsa ketakutan. Hal ini pun membuat kehidupan Jung Ba Reum berubah total setelahnya.\n" +
                    "\n" +
                    "Drama ini pun semakin seru untuk diketahui tentang misteri pembunuhan yang belakangan menghantui publik. Belum lagi momen yang menceritakan dokter Daniel Lee (Jo Jae Yun) yang mencurigai sang putra, Han Seo Joon (Ahn Jae Wook) dan Sung Yo Han (Kwon Ha Woon) sebagai pelaku pembunuhan berantai yang menghantui masyarakat.",
            "The Penthouse mengisahkan intrik perselingkuhan, balas dendam dan pembunuhan penghuni tempat mewah, Hera Palace.\n" +
                    "\n" +
                    "Di season sebelumnya, Oh Yoon Hee bebas dari tuduhan pembunuhan Shim Su Ryeon. Perempuan itu adalah ibu dari Min Seol Ah yang dibunuh Yoon Hee.\n" +
                    "\n" +
                    "Sebab pembunuh Shim Su Ryeon adalah suaminya, Joo Dan Tae. Ia ingin kuasai harta dan menikahi Seo Jin.\n" +
                    "\n" +
                    "Namun, fakta ini belum terungkap. Sehingga Oh Yoon Hee bersama Logan, kakak angkat Min Seol kerja sama temukan pembunuhnya.",
            "Pada usia delapan tahun, Park Joo-hyung (Song Joong-ki) pergi ke Italia setelah diadopsi oleh Don Fabio, kepala keluarga mafia Cassano. Berganti nama menjadi Vincenzo Cassano, dia menjadi pengacara Italia, seorang consigliere untuk mafia, dan salah satu orang terbaik Fabio sampai kematiannya. Setelah Fabio meninggal, Paolo (putra kandung dan pemimpin baru Fabio) mencoba membunuhnya; dia melarikan diri ke Seoul untuk mendapatkan emas tersembunyi di dalam Kompleks Apartemen Geumga-dong. Vincenzo membantu seorang hartawan asal Tiongkok menyembunyikan emasnya di lemari besi yang diamankan mafia di dalam kompleks tersebut, tetapi orang tersebut meninggal. Tanpa ada yang tahu tentang lemari besi itu, dia berencana untuk mengambil emas itu dan menggunakannya sebagai dana pensiunnya setelah meninggalkan Italia dan mafia. Namun, sebuah perusahaan real estate di bawah Babel Group telah secara ilegal mengambil alih kepemilikan gedung tersebut dan Vincenzo harus menggunakan keahliannya untuk merebut kembali gedung tersebut dan memulihkan kekayaannya. Vincenzo terlibat dengan pengacara Hong Cha-young (Jeon Yeo-been), tipe pengacara yang akan melakukan apa saja untuk memenangkan kasus. Vincenzo Cassano jatuh cinta padanya. Dia juga mencapai keadilan sosial dengan caranya sendiri.",
            "Sebuah kecelakaan pesawat misterius menewaskan lebih dari 200 warga sipil termasuk keponakan Cha Dal-gun (Lee Seung-gi).[6] Bertekad untuk mencari tahu kebenaran di balik kecelakaan itu, Cha Dal-gun melakukan penyelidikan yang membawanya ke jaringan korupsi yang rumit. Hidupnya pun terhubung dengan Go Hae-ri (Bae Suzy) yang merupakan seorang agen rahasia untuk Badan Intelijen Nasional (NIS).",
            "Writers that lived under Japanese rule in the 1930's are reincarnated into a bestselling writer who is in a slump, a mysterious ghostwriter and an anti-fan of the bestselling writer",
            "Secara garis besar, Mr. Queen mengisahkan tentang seorang laki-laki di zaman modern yang jiwanya tiba-tiba masuk ke dalam tubuh seorang putri petinggi Dinasti Joseon. Laki-laki itu adalah Jang Bong-hwan (diperankan Choi Jin-hyuk), seorang koki kepresidenan Korea Selatan yang dikenal lihai memasak, tetapi sombong dan kerap bermain perempuan. Suatu saat, Bong-hwan terlibat dalam intrik politik kepresidenan yang membuatnya berurusan dengan pihak kepolisian. Merasa tidak bersalah, ia pun berusaha menghindari polisi dan terlibat dalam sebuah insiden yang membuatnya tidak sadarkan diri. Permasalahan dimulai saat Bong-hwan tersadar. Sebab, saat membuka mata, ia telah berada di dalam tubuh Kim So-yong (Shin Hye-sun). Sejak saat itu, Bong-hwan harus menyesuaikan diri sebagai seorang perempuan meski jiwanya adalah seorang pria.",
            "Drama garapan Kim Sang Hyub ini menceritakan tentang Lim Ju Kyung (Moon Ga Young). Lim Ju Kyung merupakan seorang pelajar SMA yang kurang percaya diri dengan penampilannya. Hingga dirinya bertekad menggunakan riasan atau makeup untuk menyembunyikan wajah asli",
            "Berkisah tentang cinta seorang komandan pasukan yang bekerja sebagai penjaga perdamaian PBB yang bernama Kapten Yoo Shi-Jin diperankan oleh Song Joong-Ki dan juga ada seorang dokter wanita bernama Kang Mo-Yeon yang diperankan oleh Song Hye-Kyo.",
            "Hotel Del Luna yang berlokasi di Seoul, tidak seperti hotel lain: semua tamunya adalah hantu. Jang Man-wol (Lee Ji-eun), yang terjebak di hotel tersebut selama bertahun-tahun, bertemu dengan Goo Chan-seong (Yeo Jin-goo), seorang manajer hotel baru. Bersama-sama mereka akan membuka rahasia kelam yang telah lama terpendam yang membuat Jang Man-wol terjebak di Hotel Del Luna selama 1.300 tahun.",
            "Drama ini mengisahkan tentang putra mahkota dinasti Joseon, Lee Chang (Joo Ji Hoon) yang dituduh melakukan pengkhianatan dalam permainan kekuasaan politik setelah sang raja terjangkit penyakit epidemi mematikan dan berubah menjadi zombi dalam proses pengobatannya. Sang putera mahkota yang curiga atas kesehatan ayahnya yang ditutupi ratu (Kim Hye Jun) dan menteri kerajaan Jo Hak Jo (Ryoo Seung Ryeong), mencoba pergi ke pinggiran negeri untuk mencari dokter terkenal yang memegang kunci misteri penyakit raja dan berusaha menghilangkan tuduhan pengkhianatan terhadapnya didampingi pengawal pribadinya Moo Young (Kim Sang Ho). Di sana, Lee dihadapkan dengan korban epidemi yang telah berubah menjadi zombi. Selama perjalanan tersebut, ia harus menghadapi maut dengan dikejar-kejar zombi dan juga pengawal kerajaan yang mencoba menangkapnya.",
            "Drakor Taxi Driver berkisah tentang Kim Do Ki (Lee Je Hon), seorang lulusan Akademi Angkatan Laut Korea yang ibunya dibunuh ketika dia masih kecil. Kini dia bekerja sebagai sopir taksi untuk sebuah perusahaan yang menawarkan layanan balas dendam"
    };

    public static ArrayList<DramaModel> getListData(){
        DramaModel dramaModel = null;
        ArrayList<DramaModel> list = new ArrayList<>();
        for (int i = 0; i<title.length; i++){
            dramaModel = new DramaModel();
            dramaModel.setPosterDrama(thumbnail[i]);
            dramaModel.setJudulDrama(title[i]);
            dramaModel.setSinopsisDrama(detail[i]);
            list.add(dramaModel);
        }
        return list;
    }
}
