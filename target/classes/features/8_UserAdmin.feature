Feature: User JuaraCoding
	Scenario: halaman tabel status pembayaran peserta/user active,pending,close,subscribe secara keseluruhan terutama management akses role user
		When tabel status pembayaran peserta/user active,pending, dan close
		And tabel pembayaran User Pending
		And tabel pembayaran User Complete
		And tabel pembayaran User Close
		And tabel pembayaran Email Subscriber dari Web Juara coding
		And tabel Data Akses Employee yang dikelola oleh admin
		Then Berhasil pengecekan menu User