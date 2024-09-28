package cl.utem.inf.sudoku.api.v1;

import cl.utem.inf.sudoku.api.v1.vo.BoardVO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/solver",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE})
public class SolverRest {

    @PostMapping(value = "/9x9", 
            consumes = {MediaType.APPLICATION_JSON_VALUE}, 
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<BoardVO> sudoku9(@RequestBody BoardVO request) {
        
    }

}
