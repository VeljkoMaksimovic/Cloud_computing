# Cloud_computing
**DOCKER** <br>
  *build command*: docker build --tag dumbapi:1.0 . <br>
  *run command*: docker run --publish 8081:8081 --network="host" --detach --name dumbapi dumbapi:1.0 <br>
      - neophodno je da na lokalnoj masini bude pokrenut mySQL server na portu 3306
      - ' --network="host" ' opcija je neophodna da bi se "localhost" adresa iz docker container-a odnosila na host masinu, a ne na container, jer u container-u na portu 3306 nije pokrenut mySQL dok na host-u jeste. U suprotnom puca aplikacija pri pokretanju jer ne moze da ostvari komunikaciju sa bazom.<br>
      API je 8081/hi<br><br>
**DOCKER-COMPOSE** <br>
  Da bi docker-compose up --build radio neophodno je da port 8080 bude slobodan, posto je to jedini expose-ovan port.
  API je 8080/hi<br>
