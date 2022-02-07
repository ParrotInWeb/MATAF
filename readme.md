# Mobile Application Test Automation Framework [MATAF]

## Maven configuration:
Automatic cleaning is performed before any test is run with the maven. This is set in the 'maven-clean-plugin'.

## Test suites
All suites should be added to 'suite' folder.
Default test suite is named 'allTest'.

## Appium server
There is an appium server in the framework. You can choose it by setting the flag 'appium.enabled' on true. You can change the log level by setting in the properties.

If you don't want to use it, you should have an external appium server.