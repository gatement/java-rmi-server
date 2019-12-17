# compile
./mvnw clean package

# run
java -Djava.rmi.server.hostname=192.168.56.101 -Dapp.rmi.server.port=1099 -jar rmi.server.jar