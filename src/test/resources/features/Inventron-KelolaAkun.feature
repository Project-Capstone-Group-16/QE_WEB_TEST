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
    Then Admin click the button "Kelola Akun"
    And Admin will see the content on web "Pengguna" assert "Pengguna"

  @Admin @NormalPositive @KelolaAkunAdmin
  Scenario: Admin will see content on kelola akun admin in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button "Kelola Akun"
    And Admin will see the content on web "Pengguna" assert "Pengguna"
    And Admin click the button pegawai
    And Admin will see the content on web "Pengguna" assert "Pengguna"

  @Admin @NormalPositive @TambahAkunAdmin
  Scenario: Admin will tambah akun admin on kelola akun admin in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button "Kelola Akun"
    And Admin will see the content on web "Pengguna" assert "Pengguna"
    And Admin click the button pegawai
    And Admin will see the content on web "Pengguna" assert "Pengguna"
    Then Admin click "input" data button akun
    And Admin input the image for admin account
    And Admin input text field with "Nama Lengkap"
    And Admin click the jabatan for admin account
    And Admin click the jenis kelamin for admin account
    And Admin click the input field tanggal lahir
    And Admin input text field with "No Hp Pegawai"
    And Admin input text field with "Alamat Pegawai"
    Then Admin click submit "create" button

  @Admin @NormalPositive @EditAkunAdmin
  Scenario: Admin will edit akun admin on kelola akun admin in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button "Kelola Akun"
    And Admin will see the content on web "Pengguna" assert "Pengguna"
    And Admin click the button pegawai
    And Admin will see the content on web "Pengguna" assert "Pengguna"
    Then Admin click "edit" data button akun
    And Admin delete value on text field
    And Admin input the image for admin account
    And Admin input text field with "Nama Lengkap"
    And Admin click the jabatan for admin account
    And Admin click the jenis kelamin for admin account
    And Admin click the input field tanggal lahir
    And Admin input text field with "No Hp Pegawai"
    And Admin input text field with "Alamat Pegawai"
    Then Admin click submit "edit" button


  @Admin @NormalPositive @DeleteAkunAdmin
  Scenario: Admin will delete akun admin on kelola akun admin in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button "Kelola Akun"
    And Admin will see the content on web "Pengguna" assert "Pengguna"
    And Admin click the button pegawai
    And Admin will see the content on web "Pengguna" assert "Pengguna"
    Then Admin click "delete" data button akun

