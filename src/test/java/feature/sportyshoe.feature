Feature: Implement The Capstone Project

  Scenario: Rest API testing on http://localhost:9010/
    Given User send a Get request to get all products available
    Given User sends a Get request to get all register users
    Given User sends a Post Request to send to details
    Given user sends a Put Request to update
    Then user sends a Delete Request to delete
