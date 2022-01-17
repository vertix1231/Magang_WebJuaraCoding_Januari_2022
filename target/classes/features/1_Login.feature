Feature: Form Sign In

  Scenario: Menampilkan form sign in dan menjalankan fungsinya
  	Given User masuk ke website Admin JuaraCoding
		When User input username dan password
		Then User klik button Login
