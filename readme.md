# Mobile Application Test Automation Framework [MATAF]

## Maven configuration:
Automatic cleaning is performed before any test is run with the maven. This is set in the 'maven-clean-plugin'.

## Test suites
All suites should be added to 'suite' folder.
Default test suite is named 'allTest'.

## Appium server
There is an appium server in the framework. You can choose it by setting the flag _appium.enabled_ on true. You can change the log level by setting in the properties.

If you don't want to use it, you should have an external appium server.

## Logs 
Logs are implemented using the log4J library.
Log results are saved in the _target/logs/app.logs_ file.
Waveforms from new logs are added to the existing file until it is deleted or it exceeds 10MB.

## Project translations
The project translations are handled by the default ResourceBundle library.
Default MassegesBundle are set for England (EN). This setting you can change in pom.xml.

## Command executor
In project you can find utils named 'CmdExecutor'. This utils is used to execute for eg. adb command.
