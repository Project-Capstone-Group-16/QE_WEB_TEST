@LoginPageAdminInventron

Feature: Admin Login

  @Admin @NormalPositive @Login
  Scenario: User (Admin) will login in website Inventron as admin
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    Then Admin click the button login
    Then Admin will see the content on web "Dashboard" assert "Dashboard"

  @Admin @NormalPositive @Register
  Scenario: Admin doing register in website Inventron
    Given Admin is on inventron login page
    And Admin click register menu
    And Admin will see the content on web "Sudah memiliki akun? Masuk" assert "Register"
    And Admin input text field with "Nama Depan"
    And Admin input text field with "Nama Belakang"
    And Admin input text field with "Email Register"
    And Admin input text field with "Telepon"
    And Admin input text field with "Password Regis"
    And Admin input text field with "Confirm Pasword Regis"
    Then Admin click daftar button
    Given Admin is on inventron login page
    And Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "Email"
    And Admin input the password on field "Password"
    Then Admin click the button login
#    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button logout


    #gagal di confirm password