Feature: Verify adactin
Scenario Outline: Verify adactin page
Given user is on the adactin page
When user should login with valid credentials "<userName>" "<password>"
And click login

Examples:
|userName|password|
|itsmani08|maniP@75026|
