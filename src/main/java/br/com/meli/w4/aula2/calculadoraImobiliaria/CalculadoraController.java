package br.com.meli.w4.aula2.calculadoraImobiliaria;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class CalculadoraController {

    @PostMapping("area/nomeDaCasa")
    public ResponseEntity<String> areaDaCasa(@RequestBody Casa casa) {
        Double area = casa.getArea();

        return ResponseEntity.ok("A área total da casa é de " + area + "m quadrados.");
    }

    @PostMapping("valor/nomeDaCasa")
    public ResponseEntity<String> valorDaCasa(@RequestBody Casa casa) {
        Double valor = casa.getValor();

        return ResponseEntity.ok("O valor da casa é de " + valor + " reais");
    }

    @PostMapping("maiorComodo/nomeDaCasa")
    public ResponseEntity<String> maiorComodo(@RequestBody Casa casa) {
        Comodo maiorComodo = casa.getMaiorComodo();

        return ResponseEntity.ok("O maior como da casa é: " + maiorComodo.getNome() + ", com " + maiorComodo.getArea() + "m quadrados.");
    }

    @PostMapping("areaComodos/nomeDaCasa")
    public ResponseEntity<Map<String, String>> areaDosComodos(@RequestBody Casa casa) {
        Map<String, String> areasDosComodos = new HashMap<>();
        casa.getComodos().stream().forEach(comodo ->
                areasDosComodos.put(comodo.getNome(), comodo.getArea() + "m quadrados")
        );

        return ResponseEntity.ok(areasDosComodos);
    }
}
