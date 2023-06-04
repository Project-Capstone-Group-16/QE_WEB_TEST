Feature: Landing Page Website

  @Positive @landingpage
  Scenario: User click button Tentang Kami
    Given User access landing page
    And User click Tentang Kami Menu
    Then User is directed to Tentang Kami Menu

  @Positive @landingpage
  Scenario: User click Button Eksplorasi
    Given User  User access landing page
    And User click eksplorasi menu button
    Then User is directed to the eksplorasi Menu

  @Positive @landingpage
  Scenario: User click Button Mulai
    Given User  User access landing page
    And User click mulai  button
    Then User is directed to the website content

  @Positive @landingpage
  Scenario: User click Button Unduh on navbar
    Given User  User access landing page
    And user click button "unduh"
    Then user is directed to footer of page

  @Negative @landingpage
  Scenario: User click Button Social media on footer
    Given User  User access landing page
    And user click button one of social media button instagram
    Then user is directed to instagram account of inventron-indonesia
