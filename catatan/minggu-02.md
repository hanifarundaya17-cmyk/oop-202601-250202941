# Catatan Minggu NN: Class, Object, Encapsulation

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Minggu ini saya membuat class `Aset`, yaitu representasi barang yang bisa dipinjam. Isinya kode, nama, status, dan kondisi, semuanya saya buat private supaya tidak bisa diubah sembarangan dari luar. Waktu objek baru dibuat, statusnya otomatis tersedia dan kondisinya baik. Saya juga menambahkan pengecekan, jadi kalau kode atau nama dikosongkan, program langsung menolaknya. Kode barang tidak saya beri setter karena setelah dibuat seharusnya tidak berubah lagi.

## Keputusan desain
Kode dan nama saya simpan apa adanya, tanpa dipotong spasinya dan tanpa diubah ke huruf besar. Alasannya sederhana: aturan tugas cuma minta keduanya tidak boleh null atau kosong, jadi saya tidak mau menambah aturan sendiri yang tidak diminta. Penjelasan lengkapnya ada di docs/asumsi.md (A-02). Untuk field kode, saya buat final supaya setelah objek jadi, kodenya tidak bisa diganti lagi.

## Kendala
Yang paling bikin bingung di awal itu waktu mau menjalankan tes. Saya ketik `bash scripts/uji.sh` di PowerShell, tapi malah muncul error WSL. Ternyata laptop saya belum punya Linux yang terpasang di WSL. Akhirnya saya pakai `.\scripts\uji.ps1` saja, dan itu jalan.
Lalu saya sempat salah nama enum. Saya kira namanya `KondisiAset`, padahal di file tes namanya `Kondisi`. Baru ketahuan setelah saya baca isi tesnya, jadi langsung saya betulkan.
Satu lagi soal kode barang. Awalnya kodenya saya rapikan dengan trim dan dijadikan huruf besar, tapi di catatan keputusan saya tulis kode disimpan apa adanya. Itu tidak nyambung, jadi kodenya saya ubah. Sekarang trim cuma dipakai untuk mengecek apakah isinya kosong, bukan untuk mengubah isi yang disimpan.

## Penggunaan AI
- Alat yang dipakai: claude.ai
- Bagian yang dibantu AI: bahasa pemrograman javanya
- Prompt utama: ini apa maksud dari bahasa pemrogramanya dan bantu saya betulkan
- Yang saya ubah atau tolak dari saran AI, dan alasannya: bahasa pemrogramanya, saran yang saya ubah adalah tidak ada 
- Satu hal yang saya pahami lebih baik sekarang: enkapsulasi bukan cuma field private dan getter setter, tapi class harus menjaga datanya sendiri supaya tidak pernah berisi nilai yang salah. Makanya pengecekan saya taruh di konstruktor dan setter.
