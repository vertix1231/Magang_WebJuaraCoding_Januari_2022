Feature: Gallery JuaraCoding
	Scenario: tabel galeri  edit/tambah/hapus dan megambil content item terutama url galerinya(admin)
		When input data tambah gallery dan simpan data
		And mengetahui detail dari gallery untuk mengambil content detail dari search galeri
		Then Berhasil pengecekan menu galeri