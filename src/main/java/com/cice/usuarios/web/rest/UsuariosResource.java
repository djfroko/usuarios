package com.cice.usuarios.web.rest;

import com.cice.usuarios.service.IUsuarioService;
import com.cice.usuarios.web.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/usuarios")

public class UsuariosResource {


    @Autowired
    private IUsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String test(@PathVariable(name = "id") Long id){
        return usuarioService.test(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public UsuarioDTO crearUsuario(@PathVariable(name = "usuario")UsuarioDTO usuarioDTO){
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public UsuarioDTO borrarUsuario(UsuarioDTO usuarioDTO){
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}")
    public UsuarioDTO actualizarUsuario(UsuarioDTO usuarioDTO){
        return null;
    }
}
