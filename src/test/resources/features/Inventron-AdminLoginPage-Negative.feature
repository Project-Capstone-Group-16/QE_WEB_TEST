@LoginPageAdminInventronNegative

Feature: Admin Login (Negative)

  @Admin @Negative @Register
  Scenario: Admin doing register and not fill confirm password in website Inventron
    Given Admin is on inventron login page
    And Admin click register menu
    And Admin will see the content on web "Sudah memiliki akun? Masuk" assert "Register"
    And Admin input text field with "Nama Depan"
    And Admin input text field with "Nama Belakang"
    And Admin input text field with "Email Register"
    And Admin input text field with "Telepon"
    And Admin input text field with "Password Regis"
    Then Admin click daftar button
    And Admin will see the content on web "Silahkan masukkan konfirmasi password Anda!" assert "Not Fill Confirm Password"




