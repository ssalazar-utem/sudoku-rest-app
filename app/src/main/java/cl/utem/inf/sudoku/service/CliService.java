package cl.utem.inf.sudoku.service;

import cl.utem.inf.sudoku.api.v1.vo.BoardVO;
import cl.utem.inf.sudoku.exceptions.BadProcessException;
import cl.utem.inf.sudoku.exceptions.ValidationException;
import cl.utem.inf.sudoku.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

@Service
public class CliService implements Serializable {

    public BoardVO solve(BoardVO request) {

        // debería tener un tablero
        if (request == null) {
            throw new ValidationException("Se necesita un tablero para proceder");
        }

        // @todo validar el tablero
        try {
            final String json = JsonUtils.convert(request);
            File input = File.createTempFile("board_", ".json");
            FileUtils.write(input, json, StandardCharsets.UTF_8);
            
            // 
        } catch (JsonProcessingException jpe) {
            throw new BadProcessException("No fue posible convertir a un objeto JSON válido", jpe);
        } catch (IOException ioe) {
            throw new BadProcessException("No hay espacio suficiente para crear el archivo en el servidor", ioe);
        } catch (Exception e) {
            throw new BadProcessException();
        }
    }
}
