# compile
./mvnw clean package

# run
java -Djava.rmi.server.hostname=192.168.56.101 -jar rmi.server.jar