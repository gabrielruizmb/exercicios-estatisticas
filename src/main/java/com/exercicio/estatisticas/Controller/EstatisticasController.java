package com.exercicio.estatisticas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstatisticasController {
  @GetMapping("/estatisticas")
  public String Teste(@RequestParam(value = "nome", defaultValue = "SpringBoot") String nome) {
    return String.format("Teste %s", nome);
  }
}
