How to generate server side Artifacts?

1. Go to target/classes directory from command line.

2. "C:\Program Files\Java\jdk1.7.0_67\bin\wsgen.exe" -cp . -keep com.sample.EmployeeServiceImpl

This will generate artifacts in jaxws directory in target folder.
copy the jaxws directory to src folder.

How to run wsimport command?

Go to the src directory of the project from where you need to import WSDL

execute the following command
"C:\Program Files\Java\jdk1.8.0_25\bin\wsimport.exe" -keep -verbose http://localhost:8080/sample/hello?wsdl
