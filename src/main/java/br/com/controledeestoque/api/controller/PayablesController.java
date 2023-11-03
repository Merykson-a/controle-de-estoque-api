package br.com.controledeestoque.api.controller;

import br.com.controledeestoque.api.io.payable.PayableCreateRequest;
import br.com.controledeestoque.api.io.payable.PayableListItemResponse;
import br.com.controledeestoque.api.io.payable.PayableMapper;
import br.com.controledeestoque.domain.service.payable.PayableService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/payables", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class PayablesController {

    private final PayableService payableService;
    private final PayableMapper payableMapper;

    @GetMapping
    public ResponseEntity<List<PayableListItemResponse>> getAll() {
        List<PayableListItemResponse> payables = payableMapper.getSimplifiedListByEntities(payableService.getAll());
        return new ResponseEntity<>(payables, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody PayableCreateRequest request) {
        payableService.create(request);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
