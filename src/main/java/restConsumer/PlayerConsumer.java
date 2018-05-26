package restConsumer;

import data.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PlayerConsumer {

    private static ConsumerAndErrorChecker consumerAndErrorChecker = new ConsumerAndErrorChecker();

    public Object consume(String id) {
        RestTemplate restTemplate = new RestTemplate();

        String path = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key=B3484665D83910B032C1BAEB652D94A0&steamids="+ id;
        ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(path, Object[].class);

        ResponseEntity<Object[]> responseEntity1 = responseEntity;

        //        Player[] players = consumerAndErrorChecker.get(path, Player[].class);
        System.out.println(responseEntity);
        return responseEntity;
    }
}
