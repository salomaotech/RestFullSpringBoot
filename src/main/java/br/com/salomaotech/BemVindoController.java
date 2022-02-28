package br.com.salomaotech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BemVindoController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/bem-vindo")
    public BemVindo bemVindo(@RequestParam(value = "nome", defaultValue = "salomaotech") String nome){
        return new BemVindo(counter.incrementAndGet(), String.format(template, nome));
    }




}
