## x01a-semester-performance (Re-sit Mid Term Exam)

Ucok selalu termotivasi untuk meraih prestasi tertinggi dalam setiap tahap pendidikan yang dilaluinya. Saat ini Ucok berkuliah di Institut Teknologi Del sebagai mahasiswa Sistem Informasi. Pada jenjang ini, Ucok bercita-cita untuk dapat lulus tepat waktu dengan predikat Cum Laude. Predikat Cum Laude diberkan kepada lulusan dengan Ideks Prestasi Kumulatif (IPK) >= 3.51. Ucok berharap dengan demikian ia dapat membuktikan diri dan membanggakan orang tuanya.

Sebagai mahasiswa yang jujur berintegritas, dan rajin menabung, Ucok senantiasa merencanakan target capaian tinggi. Dengan demikian ia dapat menjadwalkan kegiatan sehari-harinya sehingga target-target yang direncakanan dapat dicapai pada akhir semester. Terget capaian Ucok untuk setiap semester selalu sama, mendapatkan nilai ```A``` di semua mata kuliah tanpa kecuali. Di akhir semester, Ucok kemudian melakukan evaluasi capaiannya, dan mata kuliah mana yang paling melenceng dari target.

Dalam melakukan evaluasi, Ucok hanya fokus pada mata kuliah yang paling jauh dari target dengan simpangan terbesar. Besar-kecilnya simpangan diukur dengan memperhatikan performa per mata kuliah. Untuk menghitung performa mata kuliah digunakan formula ```kredit mata kuliah x nilai angka```. ```kredit mata kuliah``` dikemas dalam satuan sks (satuan kredit semester) sementara ```nilai angka``` menunjukan tingkap pencapaian pada skala ```4.0```. Di Institut Teknologi Del, dan di perguruan tinggi pada umumnya, nilai diberikan dalam bentuk huruf (```nilai huruf```). Selanjutnya, pada saat akan digunakan untuk menghitung performa ```nilai huruf``` akan dikonversi menjadi ```nilai angka```. Konversi yang berlaku di IT Del adalah sebagai berikut:
- ```'A'```  menjadi ```4.0```
- ```'AB'``` menjadi ```3.5```
- ```'B'```  menjadi ```3.0```
- ```'BC'``` menjadi ```2.5```
- ```'C'```  menjadi ```2.0```
- ```'D'```  menjadi ```1.0```
- ```'E'```  menjadi ```0.0```

Dengan demikian, jika pada mata kuliah MK1 dengan kredit ```4``` sks diperoleh ```nilai huruf``` ```AB``` maka dapat diperhitungkan performanya adalah ```4 x 3.5``` atau ```14.0```. Sementara, pada mata kuliah MK2 dengan kredit yang sama diperoleh ```nilai huruf``` ```B``` maka dapat diperhitungkan performanya adalah ```4 x 3``` atau ```12.0```. MK1 dan MK2 melenceng dari target Ucok. Namun, seperti dijabarkan sebelumnya, Ucok hanya fokus pada mata kuliah yang melenceng dari target dengan simpangan terjauh. Untuk mengukur simpangan, dilakukan perhitungan selisih dari performa yang diperoleh dengan performa yang diharapkan. Sebagai contoh, karena MK1 berbeban ```4``` sks maka seharusnya performa yang diharapkan adalah ```16.0``` sehingga simpangannya ```16.0 - 14.0``` sementara untuk MK2 simpangannya ```16.0 - 12.0```. Dengan demikian, mata kuliah dengan simpangan terbesar adalah MK2.

Di Institut Teknologi Del, satu semester terdiri atas beberapa mata kuliah dengan beban studi (sks) yang berbeda-beda. Sebagai contoh, di semester pertama terdapat tujuh mata kuliah dengan beban dari 2 s.d. 4 sks. Berikut ini adalah capaian Ucok pada akhir semester pertamanya di IT Del:
1. Pembentukan Karakter Del ```2``` sks, nilai ```A```
2. Matematika Dasar I ```4``` sks, nilai ```B```
3. Inovasi Digital ```2``` sks, nilai ```A```
4. Bahasa Inggris I ```2``` sks, nilai ```B```
5. Fisika Dasar ```4``` sks, nilai ```B```
6. Dasar Sistem Informasi ```3``` sks, nilai ```AB```
7. Pemrograman Visual ```2``` sks, nilai ```AB```

Untuk setiap mata kuliah, solusi akan menerima tiga baris masukan, yakni ```nama mata kuliah```, ```kredit``` dan ```nilai huruf```. Solusi kemudian akan menghitung performa mata kuliah dan menampilkannya dalam satu baris keluaran. Performa ditulis dalam format desimal dengan one digit precission. Setelah memproses satu rangkaian mata kuliah, solusi akan membaca masukan untuk mata kuliah selanjutnya. Solusi hanya akan berhenti jika diberi masukan ```---``` pada ketiga baris masukan. Solusi kemudian menampilkan mata kuliah dengan simpangan terbesar dalam satu baris keluaran. Jika terdapat lebih dari satu mata kuliah dengan besar simpangan yang sama, maka solusi hanya akan menampilkan mata kuliah yang lebih dahulu dimasukkan. Berikut adalah contoh perhitugnan simpangan:
1. Pembentukan Karakter Del ```2``` sks, nilai ```A```, simpangan ```8.0 - 8.0 --> 0.0```
2. Matematika Dasar I ```4``` sks, nilai ```B```, simpangan ```16.0 - 12.0 --> 4.0```
3. Inovasi Digital ```2``` sks, nilai ```A```, simpangan```8.0 - 8.0 --> 0.0```
4. Bahasa Inggris I ```2``` sks, nilai ```B```, simpangan ```8.0 - 6.0 --> 2.0```
5. Fisika Dasar ```4``` sks, nilai ```B```, simpangan ```16.0 - 12.0 --> 4.0```
6. Dasar Sistem Informasi ```3``` sks, nilai ```AB```, simpangan ```12.0 - 10.5 --> 1.5```
7. Pemrograman Visual ```2``` sks, nilai ```AB```, simpangan ```8.0 - 7.0 --> 1.0```
Dengan demikian, terdapat dua mata kuliah dengan simpangan terbesar, yaitu Matematika Dasar I dan Fisika Dasar. Namun, solusi hanya akan menampilkan Matematika Dasar I karena selain simpangannya terbesar juga disebutkan lebih awal daripada Fisika Dasar.

### Input
Solusi yang Ucok harapkan akan menerima tiga baris masukan untuk setiap mata kuliah, yakni ```nama mata kuliah```, ```kredit``` dan ```nilai huruf```. Solusi dapat menerima lebih dari satu informasi mata kuliah. Untuk menghentikan, Ucok akan memberikan ```---``` pada ```nama mata kuliah```, ```kredit``` dan ```nilai huruf```. Paling sedikit 
```sh
[<Nama Mata Kuliah>
<Kredit>
<Nilai Huruf>
...]
---
---
---

```

### Output
Solusi hanya akan menampilkan satu baris keluaran yang terdiri atas ```nama mata kuliah```, ```kredit```, ```nilai huruf```, dan ```simpangan``` dengan format yang sudah ditentukan. Simpangan ditulis dalam format one digit precission. Perhatikan aturan berikut:
1. Jika tidak ada satupun informasi mata kuliah yang diberikan, maka solusi menampulkan ```---``` untuk setiap segmen keluaran.
2. Jika semua mata kuliah tidak menyimpang dari target, maka solusi solusi menampulkan ```---``` untuk setiap segmen keluaran.

HINT: untuk menulis dalam format presisi, silakan untuk melihat fungsi ```ToFixed(r, i)``` yang dapat diakses di: http://www.flowgorithm.org/documentation/intrinsic-functions.htm

```sh
<Nama Mata Kuliah>#<Kredit>#<Nilai Huruf>#<Simpangan>

```

### Example 1
Input:
```sh
Pembentukan Karakter Del
2
A
Matematika Dasar I
4
B
Inovasi Digital
2
A
Bahasa Inggris I
2
B
Fisika Dasar
4
B
Dasar Sistem Informasi
3
AB
Pemrograman Visual
2
AB
---
---
---

```

Output:
```sh
Matematika Dasar I#4#B#4.0

```

### Example 2
Input:
```sh
---
---
---

```

Output:
```sh
---#---#---#---

```

### Example 3
Input:
```sh
Pembentukan Karakter Del
2
A
Matematika Dasar I
4
A
Inovasi Digital
2
A
Bahasa Inggris I
2
A
Fisika Dasar
4
A
Dasar Sistem Informasi
3
A
Pemrograman Visual
2
A
---
---
---

```

Output:
```sh
---#---#---#---

```

### Submission:
1. X01A.java
2. X01A.fprg
3. changelog.txt

### How to Submit?
Please see https://youtu.be/cU546lAL9g8

### How to Test Your Work Locally?
Plase see https://youtu.be/2RgW1UHXQ4M