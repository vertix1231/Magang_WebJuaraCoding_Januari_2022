Feature: Home JuaraCoding
	
	Scenario: List testimonial juara coding(admin)
		When Menuju form untuk menambah data profile testimonial lalu submit pertambahan tertambah di halaman awal Home
		And Mengisi data form Testimonial
		And Menuju form untuk mengubah data profile item testimonial lalu submit perubahan dari hasil search sortir
		And Mencari data item testimonial dengan search
		And Halaman data testimonial
		Then Berhasil pengecekan menu home