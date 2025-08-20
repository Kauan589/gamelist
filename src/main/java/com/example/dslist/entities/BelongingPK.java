package com.example.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game Game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList GameList;

    public BelongingPK(){
    }

    public BelongingPK(Game game, GameList gameList) {
        Game = game;
        GameList = gameList;
    }

    public Game getGame() {
        return Game;
    }

    public void setGame(Game game) {
        Game = game;
    }

    public GameList getGameList() {
        return GameList;
    }

    public void setGameList(GameList gameList) {
        GameList = gameList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(Game, that.Game) && Objects.equals(GameList, that.GameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Game, GameList);
    }
}
