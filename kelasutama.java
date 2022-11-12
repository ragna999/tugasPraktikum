public class kelasutama {
    
    public static void main(String[]args){
        bangunndatar bangunndatar = new bangunndatar();
        lingkaran lingkaran = new lingkaran (5);
        segitiga segitiga = new segitiga (8, 5);
        persegi persegi = new persegi (10);

        bangunndatar.luas();
        System.out.println("===============================");
        System.out.println("Luas Lingkaran     : " + lingkaran.luas());
        System.out.println("Luas Segitiga      : " + segitiga.luas());
        System.out.println("Luas Persegi       : " + persegi.luas());
        System.out.println("===================================");

        bangunndatar.keliling();
        System.out.println("===============================");
        System.out.println("Keliling Lingkaran     : " + lingkaran.keliling());
        System.out.println("Keliling Persegi       : " + persegi.keliling());
        System.out.println("===================================");
    }
}