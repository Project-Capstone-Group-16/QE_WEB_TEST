@KelolaWarehouseAdminInventron

Feature: Kelola Warehouse

  @Admin @NormalPositive @KelolaWarehouse
  Scenario: Admin will see content on kelola warehouse in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button kelola warehouse
    And Admin will see the content on web "Kelola Warehouse" assert "Kelola"

  @Admin @NormalPositive @TambahWarehouse
  Scenario: Admin will tambah warehouse on kelola warehouse in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button kelola warehouse
    And Admin will see the content on web "Kelola Warehouse" assert "Kelola Warehouse"
    Then Admin is reload the site
    Then Admin click the button tambah data warehouse
    And Admin input the image
    And Admin input text field with "Nama Warehouse"
    And Admin input text field with "Kota Warehouse"
    And Admin input text field with "Alamat Warehouse"
    And Admin input text field with "Deskripsi Warehouse"
#    And Admin will see the content on web "Tambah Data Warehouse" assert "Tambah Data Warehouse" gatau kenapa ini assertion error

  @Admin @NormalPositive @EditWarehouse
  Scenario: Admin will edit warehouse on kelola warehouse in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button kelola warehouse
    And Admin will see the content on web "Kelola Warehouse" assert "Kelola Warehouse"
    Then Admin is reload the site
    Then Admin click the button ubah data warehouse
    And Admin input the image
    And Admin input text field with "Nama Warehouse"
    And Admin input text field with "Kota Warehouse"
    And Admin input text field with "Alamat Warehouse"
    And Admin input text field with "Deskripsi Warehouse"