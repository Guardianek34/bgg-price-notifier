package com.example.bggpricenotifier.consumer.boardgame;

import com.example.bggpricenotifier.consumer.boardgame.model.boardgame.BoardGames;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BoardGameService {

    private final RestTemplate rest = new RestTemplate();

    public ResponseEntity<BoardGames> retrieveMarketStatistics(long gameID){
        BoardGames object = rest.getForObject(
                "https://boardgamegeek.com/xmlapi2/thing?type=boardgame&marketplace=1&id=167791&versions=1",
                BoardGames.class
        );
        return ResponseEntity.ok(object);
    }
}
