package net.behaze.xeet.modules.Usuario;

import org.hibernate.annotations.SQLDelete;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.behaze.xeet.modules.EntityBase.EntityBase;
import net.behaze.xeet.modules.Pessoa.Pessoa;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "usuario")
@AttributeOverride(name = "id", column = @Column(name = "id_usuario", columnDefinition = "SERIAL"))
@SQLDelete(sql = "UPDATE usuario SET excluido = true WHERE id_usuario = ?")
public class Usuario extends EntityBase {
    
    @Column(name = "usuario_nome", length = 210, nullable = false)
    private String username;

    @Column(name = "usuario_email", length = 210, nullable = false)
    private String email;

    @Column(name = "usuario_senha", length = 210, nullable = false)
    private String password;

    @Column(name = "usuario_status", length = 1, nullable = false)
    private String status;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pessoa", foreignKey = @ForeignKey(name = "fk_usuario_pessoa"))
    private Pessoa pessoa;
}
