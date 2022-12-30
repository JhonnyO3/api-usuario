package com.example.demonstrativo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
public class SwaggerController {



    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Você nao possui permissoes para este recurso!"),
            @ApiResponse(code = 545, message = "Erro estranho"),
            @ApiResponse(code = 200, message = "Tudo ok ")
    })
    @ApiOperation(value = "Outra mensagem")
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get() {
        return "GET REALIZADO";
    }

    @GetMapping("/get/{parametro}")
    public String getParam(@RequestParam("parametro") String parametro) {
        return parametro;
    }
}
