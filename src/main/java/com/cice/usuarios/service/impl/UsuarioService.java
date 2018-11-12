package com.cice.usuarios.service.impl;

import com.cice.usuarios.data.UsuarioRepository.UsuarioRepository;
import com.cice.usuarios.data.entity.UsuarioEntity;
import com.cice.usuarios.service.IUsuarioService;
import com.cice.usuarios.service.converter.UsuarioConverter;
import com.cice.usuarios.web.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    private UsuarioConverter usuarioConverter;


    public List<UsuarioDTO> buscarTodos(){

        List<UsuarioEntity> usuarioEntityList = usuarioRepository.findAll();
        List<UsuarioDTO> listadoUsuarios = null;

        for(int i = 0; i<usuarioEntityList.size();i++){
            UsuarioEntity entity = usuarioEntityList.get(i);
            UsuarioDTO usuarioDTO = usuarioConverter.convertirDTO(entity);
            listadoUsuarios.add(usuarioDTO);
        }
        return listadoUsuarios;
    }

    public UsuarioDTO buscarPorId(Long id){

        Optional<UsuarioEntity> usuarioEntityID = usuarioRepository.findById(id);

        return null;
    }

    public UsuarioDTO crearUsuario(UsuarioDTO usuario){
        return null;
    }

    public UsuarioDTO borrarUsuario (UsuarioDTO usuario){
        return null;
    }

    public UsuarioDTO actualizarUsuario(UsuarioDTO usuario){
        return null;
    }

}
