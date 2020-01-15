@ECHO OFF

REM :: Build Library JARs From Source and copy to Spearhead project.

ECHO Maven: Creating JAR Targets
mvn clean source:jar install & xcopy .\target\*.jar C:\Projects\SomeJavaProject\lib\HyForge /y

