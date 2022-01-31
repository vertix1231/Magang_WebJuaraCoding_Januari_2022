Feature: Transaction JuaraCoding
	Scenario: Masuk halaman Transaction dan menampilkan data Transaction terutama detail transaksi(admin)
		When search data table Contact Message berdasarkan sortir data pada  tiap halaman tabel
		And Sorting data berdasarkan kategori yang ada
		And tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve
		And Approve transaction ke user billing
		And Halaman data tabel transaksi
		Then Berhasil pengecekan menu Transaction hasil di tabel user billing