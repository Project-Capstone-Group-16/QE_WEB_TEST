@KelolaAkunAdminInventron

Feature: Kelola Akun

  @Admin @NormalPositive @KelolaAkun
  Scenario: Admin will see content on kelola akun in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button kelola akun
    And Admin will see the content on web "Pengguna" assert "Kelola Akun"
