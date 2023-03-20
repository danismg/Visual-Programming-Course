## t02-friend-catalog-phase-2

Setelah berhasil dalam fase pertama pengembangan Friend Catalog, Ucok, mahasiswa angkatan 2020 ini, ingin memberikan fitur tambahan yakni pembentukan panggilan berdasarkan informasi yang diperoleh. Misal, apakah akan memanggil dengan sapaan “Bang”, “Kak”, atau tanpa sapaan. Untuk dapat merealisasikan fitur ini, Ucok memerlukan data tambahan untuk melengkapi biodata, di antaranya ```Nama Panggilan```, ```Jenis Kelamin```, dan ```Angkatan```. Ketiga data tambahan tersebut bersifat wajib dan pasti dimiliki oleh semua mahasiswa di Institut Teknologi Del.

Untuk mengakomodir fitur baru, Ucok perlu memodifikasi solusi yang telah dihasilkan pada fase sebelumnya. Meski modifikasi tidak dapat dihindari, Ucok ingin sedapat mungkin menghindari perubahan yang tidak perlu. Mempertimbangkan hal tersebut, Ucok kemudian mendesain solusi sedemikian rupa sehingga solusi akan meminta masukan ```Nama Panggilan```, ```Jenis Kelamin```, dan ```Angkatan``` setelah terlebih dahulu menerima lima buah masukan yang didefinisikan pada Tugas 01. Bentuk luaran yang dihasilkan adalah seperti pada Tugas 01 dengan tambahan satu baris luaran lainnya yang menampilkan panggilan yang cocok sesuai dengan masukan yang diberikan. Biodata mahasiswa dengan angkatan lebih tua akan dipanggil dengan sapaan “Bang” sementara untuk mahasiswi dengan angkatan lebih tua akan dipanggil dengan sapaan “Kak”. Untuk mahasiswa dengan tahun angkatan yang sama atau lebih muda tidak diberi sapaan tambahan, hanya ```Nama Panggilan``` saja.

### Input

Solusi akan membaca delapan baris masukan, lima masukan telah didefinisikan pada Tugas 01 ditambah tiga baris masukan tambahan untuk ```Nama Panggilan```, ```Jenis Kelamin```, dan ```Angkatan```. Untuk ```Jenis Kelamin```, terdapat dua kemungkinan masukan yang diperbolehkan, ```L``` untuk jenis kelamin laki-laki dan ```P``` untuk jenis kelamin perempuan.
```
<NIM>
<Nama Lengkap>
<Program Studi>
<Username GitHub>
<No Telepon>
<Nama Panggilan>
<Jenis Kelamin>
<Angkatan>

```

### Output

Solusi akan memanpilkan kedelapan informasi yang di-entry dalam dua baris keluaran. Pada baris keluaran pertama merujuk pada definisi keluaran pada Tugas 01. Untuk baris keluaran kedua, solusi akan menampilkan usulan panggilan (dengan sapaan, jika memenuhi syarat). Luaran nama panggilan, bagi yang memenuhi syarat untuk diberi sapaan akan disematkan pada bagian depan nama panggilan dan dipisahkan dengan spasi (```<SPASI>```).
```
<NIM>#<Nama Lengkap>#<Program Studi>#<Username GitHub>#<No Telepon>
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
Wiro
L
2018

```

Output:
```
12S18212#Wiro Sableng#Sistem Informasi#@wirsab212#0852121212
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
Jaka
L
2021

```

Output:
```
21S21111#Jaka Sembung#Manajemen Rekayasa#---#0852121111
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

1. T02.java
2. T02.fprg
3. changelog.txt

### How to Submit?

Please see https://youtu.be/cU546lAL9g8