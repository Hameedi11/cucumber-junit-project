Feature: Amazon account login feature

  User Story:
  Us a user I should be able to login to my Amazon account and main page should be displayed.
  Account as a user

  #@ahmad
  Scenario: login as a user

    Given user is on Amazon home page
    When  user enters username "faramoz360@gmail.com" and password "Hamza1393"
    When  user searches for "EOOUT 40 Pack A5 Kraft Notebooks" in the search box and enters
    And   user scroll down the page and selected' the "search item"
    And   user checks has the correct "EOOUT 40 Pack A5 Kraft Notebooks" selected Or not
