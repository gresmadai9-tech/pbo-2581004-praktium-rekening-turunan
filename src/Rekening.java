
public class Rekening {
    private String nomor;
    private String pemilik;
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }

        saldo += jumlah;
        return true;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }

        saldo -= jumlah;
        return true;
    }

    protected static String formatRupiah(int jumlah) {
        return String.format("Rp%,d", jumlah).replace(',', '.');
    }

    public void cetakInfo() {
        System.out.printf("%s | %-6s | %12s%n",
                nomor, pemilik, formatRupiah(saldo));
    }
}