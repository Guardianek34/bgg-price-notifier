package com.example.bggpricenotifier.consumer.boardgame;

import com.example.bggpricenotifier.consumer.boardgame.model.BoardGame;
import com.example.bggpricenotifier.consumer.boardgame.model.BoardGames;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BoardGameService {

    private final RestTemplate rest = new RestTemplate();

    public ResponseEntity<BoardGames> retrieveMarketStatistics(long gameID){
        BoardGames object = rest.getForObject(
                "https://api.geekdo.com/xmlapi/boardgame/" + gameID + "?marketplace=1",
                BoardGames.class
        );
        return ResponseEntity.ok(object);
    }
}
