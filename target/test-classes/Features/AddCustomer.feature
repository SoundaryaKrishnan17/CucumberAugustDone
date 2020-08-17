#Author: your.email@your.domain.com
@regression
Feature: Creating a new customer

Background:
    And User click on add customer button 
 
 
 Scenario: Add customer
    When User filling up all the details
    And User click on submit button
    Then User will be displayed customer ID is generated

@smoke @regression
  Scenario: Add customer with 1dim list
    When User filling up all the details with one dim list
      | core | selenium | cs@gmail.com | chan | 935678934 |
    And User click on submit button
    Then User will be displayed customer ID is generated

  Scenario: Add customer with 1dim map
    When User filling up all the details with one dim map
      | Fname   | soundarya           |
      | lname   | krishnan            |
      | mail    | soundarya@gamil.com |
      | address | hosur               |
      | phno    | 9629583043 |
    And User click on submit button
    Then User will be displayed customer ID is generated

  Scenario: Add customer with 2dim list
    When User filling up all the details with two dim list
      | core      | selenium    | cs@gmail.com | chan       |  935578934 |
      | soundarya | krishnan    | sk@gmail.com | hos        | 9357878934 |
      | ramya     | naveenathan | rn@gmail.com | thirunveli | 9356774934 |
      | chinu     | usha        | cu@gmail.com | thirupathi | 9326578934 |
    And User click on submit button
    Then User will be displayed customer ID is generated

  Scenario: Add customer with 2dim map
    When User filling up all the details with two dim map
      | FirstN    | LastN       | mail         | Addr       | phno       |  
      | core      | selenium    | cs@gmail.com | chan       |  935578934 |  
      | soundarya | krishnan    | sk@gmail.com | hos        | 9357878934 |  
      | ramya     | naveenathan | rn@gmail.com | thirunveli | 9356774934 |  
      | chinu     | usha        | cu@gmail.com | thirupathi | 9326578934 |  
    And User click on submit button
    Then User will be displayed customer ID is generated


    Scenario Outline:
		    When User filling up all the details with "<FirstN>","<LastN>","<mail>","<Addr>","<phno>"
		     And User click on submit button
		    Then User will be displayed customer ID is generated
		    
		    Examples: 
		      | FirstN    | LastN       | mail         | Addr       | phno       |  
		      | core      | selenium    | cs@gmail.com | chan       |  935578934 |  
		      | soundarya | krishnan    | sk@gmail.com | hos        | 9357878934 |  
		      | ramya     | naveenathan | rn@gmail.com | thirunveli | 9356774934 |  
		      | chinu     | usha        | cu@gmail.com | thirupathi | 9326578934 |  
		    
