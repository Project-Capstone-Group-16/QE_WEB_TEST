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

  @LandingPage @User @NormalPositive @TentangKami
  Scenario: User click button tentang kami in website inventron for see content
    Given User is on inventron landing page
    And User click button tentang kami
    Then User will see the content on web "Ayo mulai menyimpan di Inventron" assert "Tentang Kami"

  @LandingPage @User @NormalPositive @TentangKami
  Scenario:  User click button unduh in website inventron for see content
    Given User is on inventron landing page
    And User click button unduh
    Then User will see the content on web "Download Aplikasi Inventron Disini" assert "Button Unduh"