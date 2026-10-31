# steamProject

Spring Boot 2.0 (Java 8) starter that calls the Steam Web API with `RestTemplate`. On startup it requests `ISteamUser/GetPlayerSummaries` for one hard-coded Steam ID and prints the response. `data/Player` and `data/Game` are model classes, and `ConsumerAndErrorChecker` retries a request up to 5 times when the response is not 200.

## Run
```bash
./mvnw spring-boot:run
```

Use your own Steam Web API key. Set `steam.apikey` in `src/main/resources/application.properties` and the `key=` parameter in `restConsumer/PlayerConsumer.java`, and do not reuse the committed key.
