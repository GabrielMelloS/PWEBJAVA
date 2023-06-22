package com.aulapweb.demo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {
    
    private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
    static{
        LISTA_CONTATOS.add(new Contato("1", "Isabel", "015-5555-5555"));
        LISTA_CONTATOS.add(new Contato("2", "Gabriel", "016-6666-6666"));
        LISTA_CONTATOS.add(new Contato("3", "Daniel", "017-7777-7777"));
        LISTA_CONTATOS.add(new Contato("4", "Rafael", "018-8888-8888"));
    }
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contatos")
    public ModelAndView listar(){
        ModelAndView mV = new ModelAndView("listar");
        mV.addObject("contatos", LISTA_CONTATOS);

        return mV;
    }

    @GetMapping("/contatos/novo")
    public ModelAndView novo(){
        ModelAndView mV = new ModelAndView("formulario");
        mV.addObject("contato", new Contato());

        return mV;
    }

    @PostMapping
    public String cadastrar(Contato contato) {
        String id = UUID.randomUUID().toString();
        contato.setId(id);
        LISTA_CONTATOS.add(contato);
        return "redirect:/contatos";
    }
}
