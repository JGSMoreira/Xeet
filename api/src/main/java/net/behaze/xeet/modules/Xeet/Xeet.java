package net.behaze.xeet.modules.Xeet;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.behaze.xeet.modules.EntityBase.EntityBase;

@Entity
@Table(name = "xeet")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@AttributeOverride(name = "id", column = @Column(name = "id_usuario", columnDefinition = "SERIAL"))
public class Xeet extends EntityBase{

    @Column(name = "xeet_conteudo", length = 210, nullable = false)
    String conteudo;
}
