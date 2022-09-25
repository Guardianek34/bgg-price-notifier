package com.example.bggpricenotifier.consumer.boardgame;

import com.example.bggpricenotifier.consumer.boardgame.model.BoardGame;
import com.example.bggpricenotifier.consumer.boardgame.model.BoardGames;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/boardGame")
public class BoardGameController {

    private final BoardGameService boardGameService;

    @GetMapping("/{id}")
    public ResponseEntity<BoardGame> getBoardGame(@PathVariable("id") long gameID){
        return boardGameService.retrieveMarketStatistics(gameID);
    }

}

