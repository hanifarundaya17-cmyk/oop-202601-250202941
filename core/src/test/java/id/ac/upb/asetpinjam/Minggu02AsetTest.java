package id.ac.upb.asetpinjam.model;

public class Aset {
    private final String kode;
    private String nama;
    private StatusAset status;
    private Kondisi kondisi;

    public Aset(String kode, String nama) {
        this.kode = normalisasiKode(kode);
        this.nama = validasiNama(nama);
        this.status = StatusAset.TERSEDIA;
        this.kondisi = Kondisi.BAIK;
    }

    public String getKode() { return kode; }

    public String getNama() { return nama; }

    public void setNama(String nama) {
        this.nama = validasiNama(nama);
    }

    public StatusAset getStatus() { return status; }

    public void setStatus(StatusAset status) {
        if (status == null) {
            throw new IllegalArgumentException("Status tidak boleh null");
        }
        this.status = status;
    }

    public Kondisi getKondisi() { return kondisi; }

    public void setKondisi(Kondisi kondisi) {
        if (kondisi == null) {
            throw new IllegalArgumentException("Kondisi tidak boleh null");
        }
        this.kondisi = kondisi;
    }

    private static String normalisasiKode(String kode) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode tidak boleh null atau kosong");
        }
        return kode.trim().toUpperCase();
    }

    private static String validasiNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
        }
        return nama.trim();
    }
}