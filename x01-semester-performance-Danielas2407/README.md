## x01-semester-performance

Ucok selalu termotivasi untuk meraih prestasi tertinggi dalam setiap tahap pendidikan yang dilaluinya. Saat ini Ucok berkuliah di Institut Teknologi Del sebagai mahasiswa Sistem Informasi. Pada jenjang ini, Ucok bercita-cita untuk dapat lulus tepat waktu dengan predikat Cum Laude. Predikat Cum Laude diberkan kepada lulusan dengan Ideks Prestasi Kumulatif (IPK) >= 3.51. Ucok berharap dengan demikian ia dapat membuktikan diri dan membanggakan orang tuanya.

Sebagai mahasiswa yang jujur berintegritas, dan rajin menabung, Ucok senantiasa merencanakan target-target capaian sebelum semester dimulai. Dengan demikian ia dapat menjadwalkan kegiatan sehari-harinya sehingga target-target yang direncakanan dapat dicapai pada akhir semester. Di setiap awal semester, setelah mengisi KRS (Kartu Rencana Studi), Ucok merancang target nilai yang harus diperolehnya sehingga bisa meraih predikat Cum Laude. Untuk membantunya dalam merancang target-target tersebut, Ucok ingin mengembangkan suatu solusi untuk menghitung performa dalam satu semester. Performa mahasiswa dalam satu semester diukur dan dituangakan dalam Indeks Prestasi Semester (IPS). IPS dan IPK dihitung dalam skala 4.

Untuk menghitung IPS, digunakan formula ```Total performa mata kuliah dalam semester / Total sks dalam semester```. Untuk menghitung performa mata kuliah digunakan formula ```kredit mata kuliah x nilai angka```. ```kredit mata kuliah``` dikemas dalam satuan sks (satuan kredit semester) sementara ```nilai angka``` menunjukan tingkap pencapaian pada skala ```4.0```. Di Institut Teknologi Del, dan di perguruan tinggi pada umumnya, nilai diberikan dalam bentuk huruf (```nilai huruf```). Selanjutnya, pada saat akan digunakan untuk menghitung performa ```nilai huruf``` akan dikonversi menjadi ```nilai angka```. Konversi yang berlaku di IT Del adalah sebagai berikut:
- ```'A'```  menjadi ```4.0```
- ```'AB'``` menjadi ```3.5```
- ```'B'```  menjadi ```3.0```
- ```'BC'``` menjadi ```2.5```
- ```'C'```  menjadi ```2.0```
- ```'D'```  menjadi ```1.0```
- ```'E'```  menjadi ```0.0```

Dengan demikian, jika pada suatu mata kuliah dengan kredit ```4``` sks diperoleh ```nilai huruf``` ```AB``` maka dapat diperhitungkan performanya adalah ```4 x 3.5``` atau ```14.0```.

Di Institut Teknologi Del, satu semester terdiri atas beberapa mata kuliah dengan beban studi (sks) yang berbeda-beda. Sebagai contoh, di semester pertama terdapat tujuh mata kuliah dengan beban dari 2 s.d. 4 sks. Berikut ini adalah rencana pencapaian Ucok untuk semester pertama dengan target IPS 3.50:
1. Pembentukan Karakter Del ```2``` sks, nilai ```A```
2. Matematika Dasar I ```4``` sks, nilai ```AB```
3. Inovasi Digital ```2``` sks, nilai ```A```
4. Bahasa Inggris I ```2``` sks, nilai ```AB```
5. Fisika Dasar ```4``` sks, nilai ```B```
6. Dasar Sistem Informasi ```3``` sks, nilai ```AB```
7. Pemrograman Visual ```2``` sks, nilai ```AB```

Solusi yang Ucok ingin kembangkan akan menerima sepasang masukan untuk setiap mata kuliah, yakni ```kredit``` dan ```nilai huruf```. Solusi kemudian akan menghitung performa mata kuliah dan menampilkannya dalam satu baris keluaran. Performa ditulis dalam format desimal. Solusi dapat menerima lebih dari sepasang masukan. Meski demikian, solusi akan selalu memproses sepasang demi sepasang. Untuk menghentikan, Ucok akan memberikan ```---``` pada ```kredit``` dan ```nilai huruf```. Pada akhir solusi, akan ditampilkan perhitungan IPS dalam format desimal dan total kredit.

### Input

Solusi yang Ucok harapkan akan menerima sepasang masukan untuk setiap mata kuliah, yakni ```kredit``` dan ```nilai huruf```. Solusi dapat menerima lebih dari satu pasang masukan. Meski demikian, solusi akan selalu memproses sepasang demi sepasang. Untuk menghentikan, Ucok akan memberikan ```---``` pada ```kredit``` dan ```nilai huruf```.
```sh
[<Kredit>
<Nilai Huruf>
...]
---
---

```

### Output

Solusi kemudian akan menghitung performa mata kuliah dan menampilkannya dalam satu baris keluaran. Untuk menghitung performa mata kuliah digunakan formula: ```kredit x nilai angka```. Performa ditulis dalam format desimal dengan satu angka presisi. Untuk nilai IPS ditulis dalam format desimal dengan dua angka presisi.
HINT: untuk menulis dalam format presisi, silakan untuk melihat fungsi ```ToFixed(r, i)``` yang dapat diakses di:
http://www.flowgorithm.org/documentation/intrinsic-functions.htm
```sh
[<Performa>]
<IPS>
<Total Kredit>

```

### Example 1

Input:
```sh
2
A
4
AB
2
A
2
B
4
B
3
AB
2
AB
---
---

```

Output:
```sh
8.0
14.0
8.0
6.0
12.0
10.5
7.0
3.45
19

```

### Example 2

Input:
```sh
2
A
3
A
4
A
2
A
3
AB
4
A
---
---

```

Output:
```sh
8.0
12.0
16.0
8.0
10.5
16.0
3.92
18

```


### Submission:

1. X01.java
2. X01.fprg
3. changelog.txt

### How to Submit?

Please see https://youtu.be/cU546lAL9g8