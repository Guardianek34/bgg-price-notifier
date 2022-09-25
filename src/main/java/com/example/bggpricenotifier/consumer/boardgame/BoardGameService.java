package com.example.bggpricenotifier.consumer.boardgame;

import com.example.bggpricenotifier.consumer.boardgame.model.BoardGame;
import com.example.bggpricenotifier.consumer.boardgame.model.BoardGames;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BoardGameService {

    private final RestTemplate rest = new RestTemplate();

    public ResponseEntity<BoardGame> retrieveMarketStatistics(long gameID){
        ResponseEntity<BoardGame> response = rest.getForEntity(
                "https://api.geekdo.com/xmlapi/boardgame/" + gameID + "?marketplace=1",
                BoardGame.class, gameID);

        System.out.println(response.getBody());

        return response;
    }
}
