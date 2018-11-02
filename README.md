# DriverOnboarding

How to run the project:

-via Maven - mvn clean verify test
-via TestNG runner - Create run configuration of TestNG and run the configuration file i.e. DriverOnBoarding.xml


What all things can be configured in TestNG xml file : -

- Configure the browser. Currently Firefox and Chrome are the only supported browsers. For running firefox set the browser as 'firefox' in <parameter name="browser" value="">
- Admin page url,credentials can be set by changing the value in respective parameters ie. baseURL,userName and password
- The test data which consists of driver name, email, phone number, sms token enabled flag and sms token value can be set in parameters name,email,phoneNumber,isSmsTokenEnabled,smsToken. The isSmsTokenEnabled can be true |false.

