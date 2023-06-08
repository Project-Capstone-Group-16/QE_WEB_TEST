@LoginPageAdminInventron

Feature: Admin Login

  @Admin @NormalPositive @Login
  Scenario: User (Admin) will login in website Inventron as admin
    Given Admin is on inventron login page
    Then Admin will see the content on web "Belum punya akun? Daftar" assert "Login"
    And Admin input the email on field "emailLogin"
    And Admin input the password on field "passwordLogin"
    Then Admin click the button login