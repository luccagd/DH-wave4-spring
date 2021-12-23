package br.com.meli.w4.aula1.conversorRomanos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/converter")
public class ConversorController {
    private static String[] algarismosRomanos = {"I", "V", "X", "L", "C", "D", "M"};

    private String conversor(int digito, int unidadeDecimal) {
        if (digito == 4) {
            return algarismosRomanos[unidadeDecimal] + algarismosRomanos[unidadeDecimal + 1];
        }

        if (digito == 9) {
            return algarismosRomanos[unidadeDecimal] + algarismosRomanos[unidadeDecimal + 2];
        }

        StringBuilder result = new StringBuilder();

        if (digito >= 5) {
            result.append(algarismosRomanos[unidadeDecimal + 1]);
        }

        for (int i = 0; i < digito % 5; i++) {
            result.append(algarismosRomanos[unidadeDecimal]);
        }

        return result.toString();
    }

    @ResponseBody
    @GetMapping("/{numero}")
    public String converteParaRomanos(@PathVariable int numero) {
        if (numero > 3999 || numero < 1) {
            return "Só é possível converter números menores que 4000 e maiores que 0!";
        }

        int unidadeDecimal = 0;
        StringBuilder resultado = new StringBuilder();
        while (numero > 0) {
            int digito = numero % 10;
            resultado.insert(0, conversor(digito, unidadeDecimal));
            unidadeDecimal += 2;
            numero /= 10;
        }

        return "Conversão para algarismos romanos: " + resultado.toString();
    }
}
