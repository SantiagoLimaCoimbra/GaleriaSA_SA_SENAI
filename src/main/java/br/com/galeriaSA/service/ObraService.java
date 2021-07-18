package br.com.galeriaSA.service;

import br.com.galeriaSA.model.Obra;

import java.util.List;

public interface ObraService {

    //metodos de consulta
    public List<Obra> findAll();
    public Obra findById(Long id);

    //metodos de erro / alerta
    public Obra findByNomeObra(String nomeObra);
    public String validarObra(Obra obra);

    //metodos de salvar e deletar
    public boolean save(Obra obra);
    public boolean deleteById(Long id);

}
