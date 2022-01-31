Feature: Program JuaraCoding
	Scenario: halaman tabel detail program boothamp termasuk detail batch angkatan boothcamp dan harga boothcamp
		When tabel program boothcamp edit/tambah/hapus  berdasarkan sort status
		And Halaman awal boothcamp ke halaman tambah data boothcamp
		And input data tambah program boothcamp dan simpan data
		And kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp
		And search tabel berdasarkan nama lengkap berdasarkan drop down menu
		And menu pengelompokan data berdasarkan semua drop down menu untuk fitur search
		And Halaman data program bootcamp
		And Halaman awal boothcamp ke halaman edit form data boothcamp
		And input data perubahan nama dan status program bootcamp
		And kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp
		Then Berhasil pengecekan menu program boothcamp
		When tabel program boothcamp batch angkatan per periode edit/tambah/hapus
		And Halaman awal boothcamp batch ke halaman tambah data boothcamp batch
		And input data tambah program boothcamp  batch dan simpan data
		And kembali ke halaman awal  program boothcamp batch melalui menu side bar program boothcamp
		And search tabel batch berdasarkan nama lengkap berdasarkan drop down menu
		And menu pengelompokan data berdasarkan menu untuk fitur search batch
		And Halaman data program batch
		And Halaman awal boothcamp batch ke halaman edit data boothcamp batch 
		And input data perubahan program boothcamp batch dan simpan data
		And kembali ke halaman awal  program boothcamp batch melalui menu side bar program boothcamp batch dari perubahan data
		Then Berhasil pengecekan menu program batch
		When tabel harga paket program
		And Dari halaman awal promo harga menuju halaman detail pembayaran
		And dari halaman tabel detail pembayaran ke form tambah metode pembayaran detail lalu simpan form
		And Halaman awal detail metode pembayaran ke halaman edit item detail metode deskripsi pembayaran
		And input data perubahan detail pembayaran dan simpan data lalu cek tabel detail pembayaran
		And halaman harga paket
		Then Berhasil pengecekan menu harga boothcamp