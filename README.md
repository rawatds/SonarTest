## Steps to use SonarQube in your project

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

#### Steps:
- Download and unzip SonarCube in a folder.
- Start the SonarCube by starting "StartSonar.bat". It will start at port 9000. 
- Visit http://localhost:9000, it will ask for username/password. The default values are admin/admin.
- On login, it will ask to change the password. Lets change it to say, 'password'
- Lets create a new maven project and add the following properties, dependencies and plugins.
```
<properties>
    <sonar.login>admin</sonar.login>
    <sonar.password>password</sonar.password>
    <sonar.host.url>http://localhost:9000</sonar.host.url>
    <maven.compiler.target>1.8</maven.compiler.target>
	<maven.compiler.source>1.8</maven.compiler.source>
<properties>
	<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.13</version>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.sonarsource.scanner.maven</groupId>
				<artifactId>sonar-maven-plugin</artifactId>
				<version>3.7.0.1746</version>
			</plugin>

			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.6</version>
				<executions>
					<execution>
						<id>coverage-initialize</id>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>coverage-report</id>
						<phase>test</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
```
- Now write some Java code and its related testcases to see the coverage.
- Once done, run the following command at command prompt:

```sh
$ mvn clean package sonar:sonar
```
- It will also display the url where we can find the coverage and other reports 
```sh
[INFO] ANALYSIS SUCCESSFUL, you can browse http://localhost:9000/dashboard?id=com.dsr.sonarcube%3Asonartest
```

__Note:__

- You can also use another pom2.xml, where there is no plugin section, but the **&lt;dependency&gt;** section for **sonar-maven-plugin**. In this case, you can run the following command:


```sh
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent  org.jacoco:jacoco-maven-plugin:report package sonar:sonar
```

- Its not advisable to put the SonarQube login credentials in the pom.xml file. Its better to create a token and pass that as a parameter to 'mvn' command.

### License
**Free Software, Hell Yeah!**
