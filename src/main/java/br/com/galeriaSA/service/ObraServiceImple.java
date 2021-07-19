package br.com.galeriaSA.service;

import br.com.galeriaSA.model.Obra;
import br.com.galeriaSA.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObraServiceImple implements ObraService{

    @Autowired
    ObraRepository obraRepository;

    @Override
    public List<Obra> findAll() {
        return obraRepository.findAll(Sort.by("nomeObra"));
    }

    @Override
    public Obra findById(Long id) {
        return obraRepository.findById(id).get();
    }

    @Override
    public Obra findByNomeObra(String nomeObra){
        return obraRepository.findByNomeObra(nomeObra);
    }

    @Override
    public boolean save(Obra obra){
        try {
            if (obra != null){
                obraRepository.save(obra);
                return true;
            } else {
                return false;
            }
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String validarObra(Obra obra) {
        String erro = null;
        Obra o;

        if (obra.getId() == null) { //nova obra
            o = obraRepository.findByNomeObra(obra.getNomeObra());
            if (o != null) {
                erro = "Nome da obra já existente!";
            }

        } else { //obra existente

            o = obraRepository.findByIdNotAndNomeObra(obra.getId(), obra.getNomeObra());
            if (o != null) {
                erro = "Nome da obra já existente!";
            }
        }
        return erro;
    }

    public boolean deleteById(Long id){
        try {
            obraRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
