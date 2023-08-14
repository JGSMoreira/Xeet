package net.behaze.xeet.modules.Usuario.enums;

import lombok.Getter;

@Getter
public enum StatusUsuario {
    A("ATIVO"), I("INATIVO"), B("BLOQUEADO");
    
    private final String status;

    private StatusUsuario(final String status) {
        this.status = status;
    }

}
