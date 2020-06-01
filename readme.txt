To run test you need:

1) JAVA 8+;
2)Check chrome browser version.

Chrome->Help-About Google Chrome

3) e.g. If you have Mac and your chrome browser is version 80 you need go to :
-src/main/resources/project.properties
and change property browser to chrome_mac_80

There are 4 different chrome version for linux and mac in this framework

If you have old version of chrome (e.g. 79) you need update it

4) Go to -src right click on TestNG.xml and run tests(In that way to execution you need to install Java IDE like
 IntelliJ IDEA or Eclipse) or open terminal in /src and run "mvn test"

Task 2 :
How you would approach automation testing of responsive websites

The first step I need to prioritize devices, OS
For layout I would use screenshot tests, which compare base image with current image in the device
For functionality tests I would run all tests on high priority devices and high priority test for less priority devices
For edge cases I would test manually, because it will overmuch tests variations





