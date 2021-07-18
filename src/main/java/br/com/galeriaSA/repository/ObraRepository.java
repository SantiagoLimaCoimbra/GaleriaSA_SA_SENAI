package br.com.galeriaSA.repository;

import br.com.galeriaSA.model.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObraRepository extends JpaRepository<Obra, Long> {
    public Obra findByNomeObra(String nomeObra);

    public Obra findByIdNotAndNomeObra(Long id, String nomeObra);
}
