public class BangunDatar {
    private double panjang;
    private double lebar;
    private double luas;
    private double keliling;

    public void setPanjang(double p) {
        this.panjang = p;
    }

    public void setLebar(double l) {
        this.lebar = l;
    }

    public double hitungLuas() {
        luas = panjang * lebar;
        return luas;
    }

    public double hitungKeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }

    public void cetakHasil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        bd.setPanjang(5.0);
        bd.setLebar(3.0);
        bd.cetakHasil();
    }
}
