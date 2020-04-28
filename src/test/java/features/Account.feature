Feature: Portal Login

Background:
Given validate the browser
When Browser is triggerd
Then check if browser is started


@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When  user login into application with "jin" and password "1234"
Then Home page is populated
And cards displayed are"true"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When  user login into application with "john" and password "4321"
Then Home page is populated
And cards displayed are "false"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When  user sign up with following details
| jenny | abcd | john@abcd.com | australia | 212121 |
Then Home page is populated
And cards displayed are "false"


@PortalTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When  user login in to application with <Username> and <Password>
Then Home page is populated
And cards displayed are "true"

Examples:
|Username |Password|
|user1 | pass1 |
|user2 | pass2 |
|user3 | pass3 |
|user4 | pass4 |









