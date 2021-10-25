package io.github.henriquefdias.service;

import io.github.henriquefdias.model.Cliente;
import io.github.henriquefdias.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public ClientesService( ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarClientes(Cliente cliente) {
        validarCliente(cliente);
        repository.persistir(cliente);
    }

    public void validarCliente (Cliente cliente) {
        // aplica validações
    }

}
