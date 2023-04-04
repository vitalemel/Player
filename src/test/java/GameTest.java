import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void testWhenFirstPlayerStronger() {
        Game game = new Game();
        Player player1 = new Player(1, "Вася", "200");
        Player player2 = new Player(2, "Петя", 170);
        game.register(player1);
        game.register(player2);
        int actual = game.round("Вася", "Петя");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenSecondPlayerStronger() {
        Game game = new Game();
        Player player1 = new Player(1, "Вася", "200");
        Player player2 = new Player(2, "Петя", 220);
        game.register(player1);
        game.register(player2);
        int actual = game.round("Вася", "Петя");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenPlayerStrengthEqual() {
        Game game = new Game();
        Player player1 = new Player(1, "Вася", "200");
        Player player2 = new Player(2, "Петя", 200);
        game.register(player1);
        game.register(player2);
        int actual = game.round("Вася", "Петя");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenSecondPlayerNotRegistered() {
        Game game = new Game();
        Player player1 = new Player(1, "Вася", "200");
        Player player2 = new Player(2, "Коля", 220);
        game.register(player1);
        game.register(player2);
        int actual = game.round("Вася", "Коля");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenFirstPlayerNotRegistered() {
        Game game = new Game();
        Player player1 = new Player(1, "Коля", "250");
        Player player2 = new Player(2, "Петя", 220);
        game.register(player1);
        game.register(player2);
        int actual = game.round("Коля", "Петя");
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenBothPlayersNotRegistered() {
        Game game = new Game();
        Player player1 = new Player(1, "Оля", "150");
        Player player2 = new Player(2, "Катя", 170);
        game.register(player1);
        game.register(player2);
        int actual = game.round("Катя", "Оля");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}