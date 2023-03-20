## Friend Catalog (Phase 5)

Setelah dua minggu vakum dalam mengembangkan Friend Catalog, minggu ini Ucok ingin kembali meneruskan proyeknya dengan menambahkan inteactivity aspect. Interactivity aspect memungkinkan pengguna dari solusi untuk secara aktif mengendalikan alur eksekusi solusi dan memberikan fleksibilitas lebih tinggi dari sebelumnya. Sungguh fitur yang menarik jika dapat diimplementasikan. Sebagai awal mula penerapan interactivity, Ucok akan mengimplementasikan fitur pencarian kontak berdasarkan nomor telepon.

Berikut adalah fungsionalitas yang akan dimiliki oleh solusi setelah pengembangan fase ini:
1. Fitur untuk menampilkan semua kontak yang ada dan tersimpan dalam solusi.
2. Fitur penambahan kontak. Fitur ini telah dipenuhi pada pengembangan sebelumnya dengan menggunakan array sebagai media penyimpanan. Perbedaannya, pada fase sebelumnya pengguna akan diminta memasukan kontak sekaligus, sementara pada fase ini pengguna harus mendaftarkan kontak satu per satu. Setelah mendaftarkan sebuah kontak, pengguna harus mengulang proses dari awal untuk menambah kontak berikutnya.
3. Pencarian kontak dengan menggunakan nomor telepon, sebuah fitur baru. Pencarian akan memberi keluaran yang mendeskripsikan kontak yang berafiliasi dengan sebuah nomor telepon yang diberikan.

Kemudian, untuk merangkai interactivity, Ucok menyusun menu pada solusi untuk menentukan fitur apa yang akan dilakukan oleh solusi sesuai dengan pilihan pengguna terhadap menu yang disediakan. Berikut adalah susunan menu yang akan diaplikasikan:
- Menu ```1``` untuk menampilkan semua kontak yang tersimpan dalam solusi.
- Menu ```2``` untuk menambah sebuah kontak baru.
- Menu ```3``` untuk mencari kontak berdasarkan nomor telepon.
Selain ketiga menu di atas, Ucok juga menyediakan menu untuk keluar dari solusi yang diidentifikasi dengan "---". Solusi akan secara terus menerus membaca masukan pengguna hingga pengguna memutuskan untuk mengakhiri penggunaan solusi dengan memberi masukan ```---```.

Pada pertemuan sebelumnya, Ucok telah mempelajari konsep Solution Modularity dan memandang hal tersebut menguntungkan karena menurunkan kompleksitas dan memudahkan dalam pemeliharaan di masa mendatang. Ucok memutuskan agar solusi direalisasikan dalam unit-unit yang reusable. Unit-unit dimaksud adalah berupa fungsi-fungsi (functions), di antaranya:
1. Fungsi untuk menampilkan semua kontak yang tersimpan.
2. Fungsi untuk menambahkan kontak baru ke dalam daftar kontak.
3. Fungsi untuk mencari kontak yang berafiliasi dengan sebuah nomor telepon.

Perlu diperhatikan bahwa pengembangan kali ini adalah improvement dari pengembangan sebelumnya, karena itu semua formatting mengikuti aturan pada fase-fase pengembangan sebelumnya.

### Batasan
1. Kapasitas maksimum contact profile yang dapat disimpan adalah 5 buah. Jika contact profile sudah mencapai kapasitas maksimum maka solusi tidak diperbolehkan untuk menerima contact profile baru dan jika ada upaya untuk menambah maka solusi akan mengabaikannya kemudian kembali ke pemilihan menu.
2. Diperbolehkan untuk tidak menyimpan contact profile atau tidak ada contact profile yang tersimpan.

### Input
Spesifikasi input mengikuti yang telah didefinisikan pada Tugas 04. Pada fase pengembangan ini, masukan kontak dapat hanya dapat dilakukan sekali. Untuk menambahkan kontak baru, pengguna harus memulainya dari pemilihan menu, demikian seterusnya hingga batas maksimum jumlah kontak terpenuhi. Jika jumlah maksimum kontak sudah terpenuhi maka upaya penambahan kontak baru akan diabaikan dan pengguna akan dikembalikan ke tahap pemilihan menu.ukkan ```NIM```.

Pengguna akan diminta untuk memilih salah satu menu.
```
---|1|2|3

```
Kemungkinan pilihan berdasarkan masukan pengguna:
- Jika pengguna memilih menu ```---``` maka solusi akan berhenti seketika.
- Jika pengguna memilih menu ```1``` maka solusi akan menampilkan semua kontak yang tersimpan.
- Jika pengguna memilih menu ```2``` maka solusi akan meminta pengguna untuk memasukan informasi satu kontak baru dengan format sebagai berikut.
```
<NIM>
<Nama Lengkap>
<Program Studi>
<Username GitHub>
<No Telepon>
[<No Telepon>
[<No Telepon>]]
<Nama Panggilan>
<Jenis Kelamin>
<Angkatan>

```
- Jika pengguna memilih menu ```3``` maka solusi akan meminta pengguna untuk memasukan nomor telepon yang ingin dicari informasi kontak yang terafiliasi dengan nomor telepon tersebut. Berikut adalah format masukan yang digunakan.
```
<No Telepon>
```

### Output
Solusi akan menampilkan keluaran sesuai dengan fungsionalitas yang dipilih oleh pengguna.
- Untuk menu ```---``` tidak diberikan keluaran apapun.
- Untuk menu ```1``` solusi akan menampilkan seluruh kontak yang tersimpan dengan format yang dijabarkan pada fase pengembangan sebelumnya. Jika pada saat tersebut tidak terdapat satupun kontak yang yang tersimpan, maka tidak diberikan keluaran apapun.
- Untuk menu ```2``` solusi tidak diberikan keluaran apapun.
- Untuk menu ```3``` solusi akan menampilan satu kontak yang terafiliasi dengan nomor telepon yang diberikan. Dormat yang digunakan sama dengan yang dijabarkan pada fase sebelumnya. Jika tidak ditemukan satupun kontak yang terafiliasi dengan nomor telepon, maka tidak diberikan keluaran apapun.

### Example 1
Input:
```
1
2
12S18212
Wiro Sableng
Sistem Informasi
@wirsab212
0852121212
0852121213
---
Wiro
L
2018
2
21S21111
Jaka Sembung
Manajemen Rekayasa
---
0852121111
0852121112
0852121113
Jaka
L
2021
1
3
0852121111
3
0852121111
3
0852121213
---

```

Output:
```
12S18212#Wiro Sableng#Sistem Informasi#@wirsab212#0852121212,0852121213
Bang Wiro
21S21111#Jaka Sembung#Manajemen Rekayasa#---#0852121111,0852121112,0852121113
Jaka
21S21111#Jaka Sembung#Manajemen Rekayasa#---#0852121111,0852121112,0852121113
Jaka
21S21111#Jaka Sembung#Manajemen Rekayasa#---#0852121111,0852121112,0852121113
Jaka
12S18212#Wiro Sableng#Sistem Informasi#@wirsab212#0852121212,0852121213
Bang Wiro

```

### Submission:
1. T05.java
2. T05.fprg
3. changelog.txt

### How to Submit?
Please see https://youtu.be/cU546lAL9g8