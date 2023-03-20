## t03-friend-catalog-phase-3

Setelah berhasil pada fase pertama dan kedua pengembangan Friend Catalog, Ucok, semakin termotivasi untuk terus menambah fitur. Kali ini, fitur yang akan ditambahkan adalah multiple contact number. Fitur ini memungkinkan sebuah biodata untuk memiliki lebih dari satu nomor telepon. Untuk membatasi, jumlah nomor telepon yang dapat disimpan adalah paling sedikit satu nomor dan paling banyak tiga nomor telepon. Sungguh fitur yang sangat menarik, bukan?

Untuk mengakomodir fitur baru, Ucok perlu memodifikasi solusi yang telah dihasilkan pada fase sebelumnya (Phase 2). Meski modifikasi tidak dapat dihindari, Ucok ingin sedapat mungkin menghindari perubahan yang tidak perlu. Mempertimbangkan hal tersebut, Ucok kemudian mendesain solusi sedemikian rupa sehingga ```Nomor Telepon``` akan dibaca sekaligus (sesuai dengan ```Nomor Telepon``` yang dimiliki). ```Nomor Telepon``` kedua dan ketiga bersifat opsional (tidak wajib).

Jika jumlah ```Nomor Telepon``` yang disimpan belum melampaui batas maksimum sementara semua nomor telepon yang ada ```Nomor Telepon``` telah didaftarkan, maka dapat beri masukan ```---``` untuk menghentikan pemasukan ```Nomor Telepon``` dan melanjutkan ke masukan berikutnya, Nama Panggilan, dan seterusnya.

Bentuk luaran yang dihasilkan adalah pengembangan dari Tugas 02 dengan penyesuaian pada bagian ```Nomor Telepon```. Untuk biodata dengan jumlah ```Nomor Telepon``` lebih dari satu akan ditulis sekaligus dengan pemisah tanda koma (```,```).

### Input

Solusi akan membaca paling sedikit sembilan baris masukan dan paling banyak sepuluh baris masukan. Silakan untuk merujuk pada Tugas 01 dan Tugas 02 untuk melihat struktur dasar dari masukan.

Perlu diingat ketika jumlah ```Nomor Telepon``` yang disimpan belum melampaui batas maksimum sementara semua nomor telepon yang ada ```Nomor Telepon``` telah didaftarkan, maka dapat beri masukan ```---``` untuk menghentikan pemasukan ```Nomor Telepon``` dan melanjutkan ke masukan berikutnya, Nama Panggilan, dan seterusnya.

Berikut adalah struktur masukan untuk fase ini.
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

### Output

Solusi akan memanpilkan informasi yang di-entry dalam dua baris keluaran (lihat Tugas 02). Perbedaan terjadi pada biodata dengan nomor telepon lebih dari satu. Pada situasi ini, nomor-nomor telepon ditulis sekaligus dengan tanda koma (```,```) sebagai pemisah.
```
<NIM>#<Nama Lengkap>#<Program Studi>#<Username GitHub>#<No Telepon>[,<No Telepon>[,<No Telepon>]]
[<Sapaan><SPASI>]<Nama Panggilan>

```

### Example 1

Input:
```
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

```

Output:
```
12S18212#Wiro Sableng#Sistem Informasi#@wirsab212#0852121212,0852121213
Bang Wiro

```

### Example 2

Input:
```
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

```

Output:
```
21S21111#Jaka Sembung#Manajemen Rekayasa#---#0852121111,0852121112,0852121113
Jaka

```

### Example 2

Input:
```
14S21911
Betty Rantau
Teknik Elektro
---
0852121911
---
Betty
P
2020

```

Output:
```
14S21911#Betty Rantau#Teknik Elektro#---#0852121911
Betty

```

### Submission:

1. T03.java
2. T03.fprg
3. changelog.txt

### How to Submit?

Please see https://youtu.be/cU546lAL9g8