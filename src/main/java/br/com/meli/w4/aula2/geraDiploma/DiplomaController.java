package br.com.meli.w4.aula2.geraDiploma;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {

    @PostMapping
    public ResponseEntity<Diploma> geraDiploma(@RequestBody Aluno aluno) {
        Double mediaDasNotas = aluno.calculaMedia();

        String mensagem = "Formação concluída com média " + String.format("%.1f", mediaDasNotas) + "!";
        if (mediaDasNotas > 9) {
            mensagem = "Parabéns!! Você se formou com média" + String.format("%.1f", mediaDasNotas);
        }

        return ResponseEntity.ok(new Diploma(aluno.getNome(), mediaDasNotas, mensagem));
    }
}
