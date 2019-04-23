Feature: Header

  Scenario: Home page is displayed adidas page
    Given 'Adidas home' page is loaded
    And Click in menu on 'Mens' page
    And Click in first item on 'Futbol' page
    And Click on Modal item 'Carrito' page
    And Click on Delete item of 'Carrito' page
    Then Verify "$1,329.00" Price is displayed in cart
    Then Verify quantity value is ": 1" from cart modal
