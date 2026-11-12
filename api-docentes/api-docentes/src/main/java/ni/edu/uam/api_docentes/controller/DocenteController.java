package ni.edu.uam.api_docentes.controller;

import ni.edu.uam.api_docentes.repository.DocenteRepository;

public class DocenteController {

    private final DocenteRepository repository;

    public  DocenteController(DocenteRepository repository) {
        this.repository = repository;
    }

}
