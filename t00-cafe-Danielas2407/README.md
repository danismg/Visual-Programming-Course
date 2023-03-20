## t00-cafe

Cafe Ujung Jalan memberikan layanan WiFi gratis bagi para pelanggannya. Syarat untuk dapat memperoleh akses WiFi gratis adalah membeli minuman yang disediakan. Selain minuman, juga disediakan berbagai varian makanan bintang lima dengan harga kaki lima. Untuk mempermudah pekerjaan chef, anda diminta untuk mengembangkan sebuah program yang akan digunakan bagi pelanggan cafe untuk membeli minuman dan makanan yang disediakan.

Cafe menyediakan dua menu minuman, yaitu:
1. Teh Hangat; dan
2. Es Kelapa Muda.

Untuk menu makanan yang disediakan, antara lain:
1. Bakso Tenis;
2. Sate Padang; dan
3. Udang Bakar.

### Input

Program akan membaca dua baris masukan secara berturut. Masukan pertama berupa opsi minuman yang dipilih, sementara masukan kedua adalah opsi makanan yang dipilih. Opsi merujuk pada menu yang disediakan. Perlu diingat bahwa pemesanan makanan bersifat opsional (tidak wajib). Opsi pilihan ditulis dalam nilai numerik sesuai dengan menu. Jika tidak ingin memesan makanan, pengguna dapat memasukan ```0```.
```
<Opsi Minuman>
<Opsi Makanan>

```

### Output

Program akan memanpilkan satu baris luaran. Luaran terdiri atas nama minuman dan nama makanan yang dipilih yang ditulis dengan separator hash (```#```). Jika tidak memilih makanan maka digantikan dengan teks ```---```
```
<Nama Minuman>#<Nama Makanan>

```

### Example 1

Input:
```
2
1

```

Output:
```
Es Kelapa Muda#Bakso Tenis

```

### Example 2

Input:
```
1
0

---

Output:
```
Teh Hangat#---

```

### Submission:

1. T00.java
2. T00.fprg
3. changelog.txt

### How to Submit?

Please see https://youtu.be/cU546lAL9g8