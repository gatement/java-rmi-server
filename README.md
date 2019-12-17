# compile
./mvnw clean package

# run
java -Djava.rmi.server.hostname=192.168.56.101 -Dapp.rmi.registry.port=1099 -Dapp.rmi.server.port=1098 -jar target/rmi.server.jar

# tcp ports
* RMI Registry port, used to fetch registry info, default 1099
* RMI Server port, used to do the RPC, default random port