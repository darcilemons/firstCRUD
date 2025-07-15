package dev.casj.firstCRUD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controlador para uma API Rest
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas") //pega as informações
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

}
