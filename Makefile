
all: makever1jar makever2jar

makever1jar:
	javac java/ver1/myjava/Activity.java
	jar cf lib/ver1.jar -C java/ver1 myjava/Activity.class

makever2jar:
	javac -cp java/ver2 java/ver2/myjava/Activity.java 
	javac java/ver2/myjava/Preference.java
	jar cf lib/ver2.jar -C java/ver2 myjava/Activity.class -C java/ver2 myjava/Preference.class
