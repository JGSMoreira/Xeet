package net.behaze.xeet.modules.Pessoa;

import java.sql.Date;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.behaze.xeet.modules.EntityBase.EntityBase;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pessoa")
@AttributeOverride(name = "id", column = @Column(name = "id_pessoa", columnDefinition = "SERIAL"))
public class Pessoa extends EntityBase {

    @Column(name = "pessoa_nome", length = 210)
    String nome;
    
    @Column(name = "pessoa_data_nascimento")
    Date dataNascimento;

}
