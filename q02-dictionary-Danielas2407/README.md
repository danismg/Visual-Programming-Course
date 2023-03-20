## q02-dictionary (pair)
Ucok mengalami kesulitan dalam mempelajari Bahasa Inggris. Kelemahan Ucok yang paling menghambat adalah dalam perbendaharaan kosa kata (vocabulary). Ucok mendapati salah satu solusi yang dapat diambil untuk membantunya memperbanyak kosa kata dalam Bahasa Inggris adalah dengan menggunakan kamus (dictionary).

Ucok selanjutnya ingin berinovasi untuk mengembangkan sebuah solusi yang di masa mendatang dapat juga digunakan oleh teman-temannya. Sebagai awal mula pengembangan, Ucok menginginkan dua fungsionalitas dasar pada kamus yang akan dikembangkannya, yaitu:
1. mencatat kosa kata dalam Bahasa Inggris, jenis kata, dan artinya dalam Bahasa Indonesia; dan
2. mencari jenis dan arti dari suatu kata dalam Bahasa Inggris.

Ucok selanjutnya merancang serangkaian perintah untuk melakukan fungsionalitas di atas. Perintah akan dimasukan dalam bentuk sebaris input dan diikuti dengan satu atau lebih input lainnya. Solusi akan terus-menerus membaca perintah dari pengguna hingga diperintahkan untuk berhenti. Berikut adalah daftar perintah yang akan diproses oleh solusi:
- Baris perintah ```register``` digunakan untuk menambahkan sebuah informasi kosa kata baru. Baris perintah ini akan diikuti oleh tiga buah masukan lainnya yang merepresentasikan ```kata``` dalam Bahasa Inggris, ```jenis kata``` (misal. kata benda, kata sifat, kata kerja, dsb.), dan ```arti kata``` dalam Bahasa Indonesia.
- Baris perintah ```find``` digunakan untuk mencari arti atau makna dari sebuah kata dalam Bahasa Inggris. Baris perintah ini akan diikuti oleh satu baris masukan lagi berupa ```kata``` yang akan dicari arti atau maknanya. Solusi kemudian akan mencari kecocokan ```kata``` tersebut dan menampilkannya dalam satu baris keluaran.
- Baris perintah ```---``` digunakan untuk mengakhiri solusi.

Dalam upayanya mengembangkan solusi yang efektif dan elegan, Ucok akan menggunakan struktur array. Selain itu, Ucok juga akan mengembangkan solusinya semodular mungkin sehingga Butet, pair-nya, dapat turut berkontribusi.

### Solution Design
Ucok dan Butet akan menyimpan ```kata```, ```jenis kata```, dan ```arti kata``` dalam tiga buah array yang independen antara satu dengan yang lain. Relasi antarketiga array adalah melalui index-nya. Nilai dari elemen dengan index (```i```) pada array ```kata``` berelasi dengan nilai dari elemen dengan index yang sama pada array ```jenis kata``` dan pada array ```arti kata```.

### Limitations
Sebagai permulaan, diasumsikan bahwa kamus hanya akan menyimpan paling banyak 5 kata. Jika jumlah kata telah tercapai, maka kamus akan mengabaikan perintah untuk menambahkan kata baru dengan tidak menyimpan kata baru tersebut.

### Input
Solusi akan secara terus-menerus membaca satu baris perintah yang dimasukan oleh pengguna. Solusi kemudian bereaksi sesuai dengan perintah yang dimasukan. Solusi hanya akan berhenti jika diperintahkan. Terdapat tiga buah perintah, yaitu:
- Baris perintah ```register``` digunakan untuk menambahkan sebuah informasi kosa kata baru. Baris perintah ini akan diikuti oleh tiga buah masukan lainnya yang merepresentasikan ```kata``` dalam Bahasa Inggris, ```jenis kata``` (misal. kata benda, kata sifat, kata kerja, dsb.), dan ```arti kata``` dalam Bahasa Indonesia.
- Baris perintah ```find``` digunakan untuk mencari arti atau makna dari sebuah kata dalam Bahasa Inggris. Baris perintah ini akan diikuti oleh satu baris masukan lagi berupa ```kata``` yang akan dicari arti atau maknanya.
- Baris perintah ```---``` digunakan untuk mengakhiri solusi.

```sh
<register
<kata>
<jenis kata>
<arti kata>|find
<kata>|--->

```

### Output
Solusi hanya akan memberikan satu baris keluaran, yaitu pada saat melakukan pencarian ```kata```. Pada saat melaksanakan perintah lainnya, solusi tidak memberikan keluaran apapun. Jika ```kata``` yang dicari TIDAK ditemukan, maka solusi tidak akan memberikan keluaran apapun. Satu baris keluaran terdiri atas tiga segmen, yaitu ```kata``` dalam Bahasa Inggris, ```jenis kata```, dan ```arti kata``` yang diseparasi dengan simbol ```#```.

```sh
<kata>#<jenis kata>#<arti kata>
```

### Example 1
Input:
```sh
register
able
sifat
dapat; bisa; mampu; sanggup
register
bag
benda
tas
find
sky
find
bag
register
sky
benda
langit; angkasa; cakrawala; dirgantara; awang-awang
find
sky
---

```

Output:
```sh
bag#benda#tas
sky#benda#langit; angkasa; cakrawala; dirgantara; awang-awang

```

### Example 2
Input:
```sh
find
sky
find
bag
---

```

Output:
```sh
```

### Submission:
1. Q02.java
2. Q02.fprg
3. changelog.txt

### How to Submit?
Please see https://youtu.be/cU546lAL9g8

### How to Test Your Work Locally?
Plase see https://youtu.be/2RgW1UHXQ4M