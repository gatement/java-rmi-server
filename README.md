# compile
./mvnw clean package

# run
java -Djava.rmi.server.hostname=192.168.56.101 -Dapp.rmi.registry.port=1099 -Dapp.rmi.server.port=1098 -jar target/rmi.server.jar