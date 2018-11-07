package com.cice.usuarios.data.UsuarioRepository;

import com.cice.usuarios.data.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
