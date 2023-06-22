Feature: Kelola Transaksi

  @Admin @NormalPositive @KelolaTransaksi
  Scenario: Admin will see content on kelola transaksi in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button kelola transaksi
    And Admin will see the content on web "Kelola Transaksi" assert "Kelola Transaksi"