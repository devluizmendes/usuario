package com.mendes.usuario.business;

import com.mendes.usuario.business.converter.UsuarioConverter;
import com.mendes.usuario.business.dto.UsuarioDTO;
import com.mendes.usuario.infrastructure.entity.Usuario;
import com.mendes.usuario.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }


}
