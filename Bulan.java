public class Bulan {
    public static void main(String[] args) {
        namaBulan();
    }

    public static void namaBulan() {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April",
            "Mei", "Juni", "Juli", "Agustus",
            "September", "Oktober", "November", "Desember"
        };

        System.out.println("Bulan-bulan dari Januari sampai Desember:");
        for (String bulan : namaBulan) {
            System.out.println("Bulan " + bulan);
        }
    }
}
