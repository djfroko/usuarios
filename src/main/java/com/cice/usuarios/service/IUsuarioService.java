package com.cice.usuarios.service;

import com.cice.usuarios.web.dto.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    List<UsuarioDTO> buscarTodos();

    UsuarioDTO buscarPorId (Long id);

    UsuarioDTO crearUsuario(UsuarioDTO usuario);

    UsuarioDTO borrarUsuario (UsuarioDTO usuario);

    UsuarioDTO actualizarUsuario(UsuarioDTO usuario);


}


