package br.com.controledeestoque.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class TestController {

    @GetMapping("/teste")
    public ResponseEntity<String> result() {
        return new ResponseEntity<>("Deu certo viu", HttpStatus.OK);
    }

}
