Feature: Blog JuaraCoding
	Scenario: Masuk halaman Blog dan menampilkan daftar Blog(admin)
		When Menuju form untuk menambah data post blog lalu submit pertambahan tertambah di halaman awal Home
		And Menuju form untuk mengubah data post blog item lalu submit perubahan dari hasil search sortir
		Then Berhasil pengecekan menu blog