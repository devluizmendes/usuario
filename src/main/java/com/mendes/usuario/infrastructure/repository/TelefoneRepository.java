package com.mendes.usuario.infrastructure.repository;

import com.luizdev.aprendendo_spring.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Usuario, Long> {
}
