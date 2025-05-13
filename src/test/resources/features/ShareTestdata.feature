Feature: Sharing test data feature

  Scenario Outline: This Scenario Creates a Random Test data of a User
    Given User is getting created
    When Create a new user with "<firstname>", "<emailid>", "<phoneno>"
    Then Print user with email id "<emailid>" to console
    When Update phone no "<newphoneno>" of a user phone with "<emailid>"
    Then Print user with email id "<emailid>" to console
    Examples: Input data
     | firstname | emailid                   | phoneno    | newphoneno |
     | Sriram    | sriramkukkadapu@gmail.com | 9060109968 | 9963042100 |
#     | Thripura  | bonagiritripura@gmail.com | 9014875399 | 9902367968 |






