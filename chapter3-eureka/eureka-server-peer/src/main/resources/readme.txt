

1. edit your computer's  hosts
    if your env is linux   /etc/hosts
    else if youe env is windows  c:\Windows\System32\hosts
    -----------------------------------------------------
    127.0.0.1 peer1
    127.0.0.1 peer2
    -----------------------------------------------------

2.mvn install

3.java -jar eureka-server-peer-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
  java -jar eureka-server-peer-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

4.127.0.0.1:1111/  or 127.0.0.1:1111/
