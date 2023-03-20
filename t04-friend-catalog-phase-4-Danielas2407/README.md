## Friend Catalog (Phase 4)

Ucok kian termotivasi setelah fase pengembangan ketiga dari Friend Catalog berhasil diselesaikan. Sekalipun solusi yang saat ini ditawarkan sudah baik namun masih menyisakan serangkaian keterbatasan. Salah satu keterbatasan yang dirasa krusial adalah ketidakmampuan untuk menyimpan multiple contact profiles.

Minggu lalu, pada sesi pembelajaran PEMVIS, Ucok mempelajari hal baru, array. Ucok melihat adanya peluang untuk menggunakan array sebagai opsi untuk mengatasi keterbatasan jumlah kontak. Sebagai mahasiswa yang memegang teguh prinsip-prinsip computational thinking, Ucok tak buru-buru berhadapan dengan Flowgorithm. Ia terlebih dahulu merenungkan bentuk persoalan dan struktur penyimpanan data yang diperlukan dengan memanfaatkan array.

Setelah tiga hari tiga malam ia merenung, Ucok kemudian datang dengan bayangan bentuk solusi baru dengan bertumpu pada solusi dari hasil pengembangan fase ketiga. Berikut rinciannya:
1. Solusi akan secara terus menerus membaca masukan contact profile hingga diputuskan untuk berhenti. Struktur masukan contact profile sesuai dengan hasil dari pengembangan fase ketiga. Keputusan untuk berhenti ditandai dengan masukan ```---``` pada saat memasukkan ```NIM```.
2. Setelah selesai membaca seluruh masukan contact profile, solusi akan menampilkan satu per satu contact profile dengan bentuk keluaran seperti yang didefinisikan pada fase ketiga.

### Batasan

1. Kapasitas maksimum contact profile yang dapat disimpan adalah 5 buah. Jika contact profile sudah mencapai kapasitas maksimum maka solusi tidak diperbolehkan untuk menerima contact profile baru.
2. Diperbolehkan untuk tidak menyimpan contact profile atau tidak ada contact profile yang tersimpan.

### Strategi penggunaan array

Seluruh data yang diterima disimpan dalam array. Dengan mengaplikasikan pendekatan dekomposisi Ucok merancang agar setiap atribut atau properti dari contact profile di simpan pada array tersendiri. Oleh sebab itu, data atribut ```NIM``` akan disimpan pada sebuah array, data atribut ```Nama Lengkap``` disimpan dalam array sebuah array lainnya, dan demikian seterusnya untuk atribut-atribut yang lain. Sebuah array akan digunakan secara bersama-sama untuk menampung data dari multiple contact profiles. Artinya, ```NIM``` dari contact profile pertama dengan contact profile kedua dan yang selanjutnya disimpan pada array yang sama. Dengan demikian, nilai pada array di index ke-```i``` dapat dijamin adalah milik contact profile ```i + 1```. Abstraksi dari pendekatan ini diilustrasikan dengan skematik berikut.

![Abstraksi penggunaan array](/images/schematic.png "Abstraksi penggunaan array")

Pendekatan ini menemui tantangan untuk atribut ```Nomor Telepon``` karena untuk satu contact profile diperbolehkan paling banyak tiga buah dan paling sedikit satu buah. Ia berharap pendekatan yang sudah dirancang pada atribut-atribut contact profile dapat diaplikasikan juga pada atribut ```Nomor Telepon```.  Setelah mengabstraksikan persoalan (gambar di atas) dan dipikir-pikir, Ucok kemudian mendapati adanya pola (pattern) dari pendekatan yang sudah ia desain. Ia melihat bahwa karena satu contact profile diizinkan paling banyak memiliki tiga buah ```Nomor Telepon``` (```n = 3```) maka dapat dikembangkan suatu formula untuk memetakan ```Nomor Telepon``` dengan contact profile. Formula untuk memetakan index pertama dari ```Nomor Telepon``` contact profile ke-```i``` adalah ```(i - 1) x n```, sementara untuk memetakan index terakhir adalah ```(i x n) -  1```. Dengan formula ini, maka ```Nomor Telepon``` contact profile kedua (```i = 2```) akan menempati index ke ```(2 - 1) x 3 = 3``` sampai index ```(2 x 3) - 1 = 5```.

### Input

Spesifikasi input mengikuti yang telah didefinisikan pada Tugas 03. Pada Tugas 04, masukan contact profile dapat dilakukan berulang kali hingga diputuskan untuk berhenti. Keputusan untuk berhenti ditandai dengan ```---``` pada saat memasukkan ```NIM```.

Berikut adalah struktur masukan untuk fase ini.
```
---|<NIM>
<Nama Lengkap>
<Program Studi>
<Username GitHub>
<No Telepon>
[<No Telepon>
[<No Telepon>]]
<Nama Panggilan>
<Jenis Kelamin>
<Angkatan>
[---|<NIM>
<Nama Lengkap>
<Program Studi>
<Username GitHub>
<No Telepon>
[<No Telepon>
[<No Telepon>]]
<Nama Panggilan>
<Jenis Kelamin>
<Angkatan>
...]

```

### Output

Solusi akan menampilkan seluruh contact profile yang tersimpan. Pada dasrnya format keluaran yang digunakan adalah format yang telah didefinisikan pada Tugas 03. Berikut adalah struktur format keluaran dari solusi yang diharapkan.
```
|<NIM>#<Nama Lengkap>#<Program Studi>#<Username GitHub>#<No Telepon>[,<No Telepon>[,<No Telepon>]]
[<Sapaan><SPASI>]<Nama Panggilan>
[<NIM>#<Nama Lengkap>#<Program Studi>#<Username GitHub>#<No Telepon>[,<No Telepon>[,<No Telepon>]]
[<Sapaan><SPASI>]<Nama Panggilan> ...]

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
14S21911
Betty Rantau
Teknik Elektro
---
0852121911
---
Betty
P
2020
---

```

Output:
```
12S18212#Wiro Sableng#Sistem Informasi#@wirsab212#0852121212,0852121213
Bang Wiro
21S21111#Jaka Sembung#Manajemen Rekayasa#---#0852121111,0852121112,0852121113
Jaka
14S21911#Betty Rantau#Teknik Elektro#---#0852121911
Betty

```

### Submission:

1. T04.java
2. T04.fprg
3. changelog.txt

### How to Submit?

Please see https://youtu.be/cU546lAL9g8