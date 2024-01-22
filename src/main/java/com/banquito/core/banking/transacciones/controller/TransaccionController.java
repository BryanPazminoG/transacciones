package com.banquito.core.banking.transacciones.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banquito.core.banking.transacciones.domain.Transaccion;
import com.banquito.core.banking.transacciones.service.TransaccionService;

@RestController
@RequestMapping("/transacciones")
public class TransaccionController {

    private final TransaccionService transaccionService;

    public TransaccionController(TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    @GetMapping("/listar")
    public List<Transaccion> buscarTodas(){
        return transaccionService.listarTodo();
    }

}
