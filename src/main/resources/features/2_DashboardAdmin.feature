Feature: Dashboard Web Juara Coding

  Scenario: Menampilkan halaman awal dashboard JuaraCoding dan menjalankan fungsinya(admin)
    When cek home admin
    When cek learning admin
    When cek blog admin
    When cek contact massage admin
    When cek transaction admin
    When cek user admin
    When cek program admin
    When cek galeri admin
    When cek setting admin
    Then Berhasil pengecekan dashboard balik ke halaman dashboard
