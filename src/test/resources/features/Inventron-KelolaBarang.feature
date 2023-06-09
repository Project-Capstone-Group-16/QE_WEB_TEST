@KelolaBarangAdminInventron

Feature: Kelola Barang

  @Admin @NormalPositive @KelolaBarang
  Scenario: Admin will see content on kelola barang in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button "Kelola Barang"
    And Admin will see the content on web "Kelola Barang" assert "Kelola Barang"

  @Admin @NormalPositive @KelolaBarang @AssertItemBarang
  Scenario: Admin will see item on kelola barang in website Inventron
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    And Admin click the button login
    And Admin will see the content on web "Dashboard" assert "Dashboard"
    Then Admin click the button "Kelola Barang"
    And Admin will see the content on web "Kelola Barang" assert "Kelola Barang"
    Then Admin will see the item on web for menu "Kelola Barang"