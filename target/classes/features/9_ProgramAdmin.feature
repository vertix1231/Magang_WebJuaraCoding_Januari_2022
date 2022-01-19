Feature: Program JuaraCoding
	Scenario: halaman tabel detail program boothamp termasuk detail batch angkatan boothcamp dan harga boothcamp
		When tabel program boothcamp edit/tambah/hapus
		And tabel program boothcamp batch angkatan per periode edit/tambah/hapus 
		And tabel program harga boothcamp  edit/tambah/hapus 
		Then Berhasil pengecekan menu program