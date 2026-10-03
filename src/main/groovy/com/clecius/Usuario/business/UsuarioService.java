package com.clecius.Usuario.business;


import com.clecius.Usuario.business.converter.UsuarioConverter;
import com.clecius.Usuario.business.dto.UsuarioDTO;
import com.clecius.Usuario.infrastructure.entity.Usuario;
import com.clecius.Usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
    Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
    return usuarioConverter.paraUsuarioDTO(
            usuarioRepository.save(usuario)
    );
}
}
