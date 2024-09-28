package cl.utem.inf.sudoku.api.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BoardVO {

    @JsonProperty("board")
    private List<List<Integer>> board = null;

    public List<List<Integer>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Integer>> board) {
        this.board = board;
    }
}
