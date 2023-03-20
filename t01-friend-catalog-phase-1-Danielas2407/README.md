## t01-friend-catalog-phase-1

Ucok ingin mengembangkan sebuah program yang akan ia gunakan untuk menyimpan biodata dan kontak rekan-rekannya, mahasiswa Institut Teknologi Del. Informasi yang ingin disimpan: NIM, Nama Lengkap, Program Studi, Username GitHub dan Nomor Telepon. Perlu diketahui bahwa ada beberapa dari rekan Ucok yang tidak memiliki akun GitHub. Selain informasi mengenai akun GitHub, semua informasi lainnya bersifat wajib (mandatory).

Ucok kemudian berencana untuk secara bertahap mengembangkan program tersebut. Pada tahap pertama, tujuan yang ingin dicapai adalah mampu menyimpan satu biodata dan kontak satu rekannya. Program akan meminta, secara berurut, NIM, Nama Lengkap, Program Studi, Username GitHub dan Nomor Telepon. Karena tidak semua rekannya memiliki akun GitHub, maka Ucok mendesain sedemikian rupa sehingga jika diberi masukan ```---``` maka program akan mengartikan bahwa tidak ada data Username GitHub. Untuk mengkorfirmasi akurasi kinerja program, ia kemudian ingin agar program memanpilkan keempat informasi tersebut ke layar dalam satu baris keluaran. Pada keluaran, setiap data dipisahkan dengan tanda hash (#).

### Input

Program akan membaca empat baris masukan secara berturut untuk menerima masukan berupa NIM, Nama Lengkap, Program Studi, Username GitHub dan Nomor Telepon.
```
<NIM>
<Nama Lengkap>
<Program Studi>
<Username GitHub>
<No Telepon>

```

### Output

Program akan memanpilkan keempat informasi yang dimasukkan dalam satu baris keluaran. Pada keluaran, setiap data dipisahkan dengan tanda hash (#).
```
<NIM>#<Nama Lengkap>#<Program Studi>#<Username GitHub>#<No Telepon>

```

### Example 1

Input:
```
12S99212
Wiro Sableng
Sistem Informasi
@wirsab212
0852121212

```

Output:
```
12S99212#Wiro Sableng#Sistem Informasi#@wirsab212#0852121212

```

### Example 2

Input:
```
12S99111
Jaka Sembung
Manajemen Rekayasa
---
0852121111

```

Output:
```
12S99111#Jaka Sembung#Manajemen Rekayasa#---#0852121111

```

### Submission:

1. T01.java
2. T01.fprg
3. changelog.txt

### How to Submit?

Please see https://youtu.be/cU546lAL9g8