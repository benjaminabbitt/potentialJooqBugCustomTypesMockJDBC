potentialJooqBugCustomTypesMockJDBC
===================================

Demonstration of bug referenced:
http://stackoverflow.com/questions/22205655/jooq-custom-type-with-mockresult-throwing-datatypeexception
https://github.com/jOOQ/jOOQ/commit/ce8ad8d9305182a35a3d353c6056067fb7ef555d

To reproduce:

Install Vagrant (http://www.vagrantup.com/downloads.html)

$vagrant up
$gradlew flywayMigrate
$gradlew generateJooq

You can create eclipse project files by $gradlew eclipse. 
