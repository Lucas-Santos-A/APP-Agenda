package io.github.LucasSantosA.agendaapi.model.repository;


import io.github.LucasSantosA.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
