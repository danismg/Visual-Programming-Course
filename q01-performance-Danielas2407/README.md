## q01-performance

Sebagai mahasiswa yang ingin senantiasa membanggakan orang tua, Ucok selalu berupaya agar selalu memberikan upaya terbaik sekalipun dalam suasana PJJ (Pembelajaran Jarak Jauh). Ucok selalu berlaku jujur dan giat belajar.

Setiap semester, Ucok akan mendapatkan nilai performa-nya untuk setiap mata kuliah yang diikutinya. Performa setiap mata kuliah kemudian berkontribusi langsung pada pencapaian semester yang dikemas dalam satuan IPS (Indeks Prestasi Semester). Pada akhir masa studi, performa Ucok akan dihitung dan dikemas dalam satuan IPK (Indeks Prestasi Kumulatif).

Untuk menghitung performa mata kuliah digunakan formula: ```kredit x nilai angka```. ```kredit``` dikemas dalam satuan sks (satuan kredit semester) sementara ```nilai angka``` menunjukan tingkap pencapaian pada skala ```4.0```. Di Institut Teknologi Del, dan di perguruan tinggi pada umumnya, nilai diberikan dalam bentuk huruf (```nilai huruf```). Selanjutnya, pada saat akan digunakan untuk menghitung performa ```nilai huruf``` akan dikonversi menjadi ```nilai angka```. Konversi yang berlaku di IT Del adalah sebagai berikut:
- ```'A'```  menjadi ```4.0```
- ```'AB'``` menjadi ```3.5```
- ```'B'```  menjadi ```3.0```
- ```'BC'``` menjadi ```2.5```
- ```'C'```  menjadi ```2.0```
- ```'D'```  menjadi ```1.0```
- ```'E'```  menjadi ```0.0```

Dengan demikian, jika pada suatu mata kuliah dengan kredit ```4``` sks diperoleh ```nilai huruf``` ```AB``` maka dapat diperhitungkan performanya adalah ```4 x 3.5``` atau ```14.0```.

Ucok selalu menarget performa tinggi. Di setiap awal semester, Ucok biasanya mengestimasi upaya yang perlu dilakukan untuk setiap mata kuliah sehingga dapat diperkirakan performa yang akan dicapai. Strong point Ucok adalah pada mata kuliah yang berkaitan dengan pemrograman dan analisis. Beranjak dari sana, Ucok kemudian ingin mengembangkan sebuah solusi untuk membantunya dalam menghitung performa setiap mata kuliah yang ditempuhnya.

Solusi yang Ucok harapkan akan menerima sepasang masukan untuk setiap mata kuliah, yakni ```kredit``` dan ```nilai huruf```. Solusi kemudian akan menghitung performa mata kuliah dan menampilkannya dalam satu baris keluaran. Performa ditulis dalam format desimal. Solusi dapat menerima lebih dari sepasang masukan. Meski demikian, solusi akan selalu memproses sepasang demi sepasang. Untuk menghentikan, Ucok akan memberikan ```---``` pada ```kredit``` dan ```nilai huruf```.

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

Solusi kemudian akan menghitung performa mata kuliah dan menampilkannya dalam satu baris keluaran. Untuk menghitung performa mata kuliah digunakan formula: ```kredit x nilai angka```. Performa ditulis dalam format desimal.
```sh
[<Performa>]

```

### Example 1

Input:
```sh
4
A
---
---

```

Output:
```sh
16.0

```

### Example 2

Input:
```sh
4
AB
3
BC
---
---

```

Output:
```sh
14.0
7.5

```

### Example 3

Input:
```sh
---
---

```

Output:
```sh 

```

### Submission:

1. Q01.java
2. Q01.fprg
3. changelog.txt

### How to Submit?

Please see https://youtu.be/cU546lAL9g8