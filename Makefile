compile:
	mkdir -p bin/
	javac -cp lib/junit.jar src/rwalwynv/**/*.java -d bin/

test: compile
	 java -cp .:./lib/junit.jar:./lib/hamcrest.jar:./bin org.junit.runner.JUnitCore rwalwynv.button.ButtonTest rwalwynv.lightbulb.LightbulbTest rwalwynv.pushdownbutton.PushDownButtonTest rwalwynv.tablelamp.LampTest

run: compile
	java -cp .:./lib/junit.jar:./lib/hamcrest.jar:./bin rwalwynv.button.ButtonMain 
	java -cp .:./lib/junit.jar:./lib/hamcrest.jar:./bin rwalwynv.tablelamp.LampMain
clean:
	rm -rf bin/
