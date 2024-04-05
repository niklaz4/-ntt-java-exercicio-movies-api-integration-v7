package com.example.academiacx;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;

import java.io.IOException;
import java.security.interfaces.EdECKey;

public class EnderecoService {

    private RestOperations restTemplate;

    public EnderecoDTO buscarPorCep(String cep){
        String url =  "https://viacep.com.br/ws/" + cep + "/json/";
        ResponseEntity<EnderecoDTO> response = restTemplate.getForEntity(url, EnderecoDTO.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            throw new RuntimeException("Falha ao buscar CEP: Status code " + response.getStatusCodeValue());
        }
    }
}
