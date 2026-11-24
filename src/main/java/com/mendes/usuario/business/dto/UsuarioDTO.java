package com.mendes.usuario.business.dto;

import lombok.*;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UsuarioDTO {

    private String nome;
    private String email;
    private String senha;
    private List<EnderecoDTO> endereco;
    private List<TelefoneDTO> telefone;

}
