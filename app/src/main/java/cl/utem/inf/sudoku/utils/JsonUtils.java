package cl.utem.inf.sudoku.utils;

import cl.utem.inf.sudoku.api.v1.vo.BoardVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;

public class JsonUtils implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final ObjectMapper MAPPER = new ObjectMapper();
    
    public static String convert(BoardVO vo) 
            throws JsonProcessingException {
        return MAPPER.writeValueAsString(vo);
    }
}
