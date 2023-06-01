@LandingPageWebsiteInventron

Feature: LandingPage

  @User @NormalPositive @Eksplorasi
  Scenario: User click button eksplorasi in website inventron for see content
    Given User is on inventron landing page
    And User click button eksplorasi
    Then User will see the content on web "Aplikasi Penyimpanan Barang yang Aman dan Terpercaya" assert "Eksplorasi"

  @User @NormalPositive @Mulai
  Scenario: User click button mulai in website inventron for see content
    Given User is on inventron landing page
    And User click button eksplorasi
    Then User will see the content on web "Mengapa Memilih Inventron?" assert "Button Mulai"

  @LandingPage @User @NormalPositive @Kontak
  Scenario: User click button kontak in website inventron for see content
    Given User is on inventron landing page
    And User click button kontak
    Then User will see the content on web "Hubungi Kami" assert "Kontak"