package net.behaze.xeet.modules.Media;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.behaze.xeet.modules.EntityBase.EntityBase;
import net.behaze.xeet.modules.Xeet.Xeet;

@Entity
@Table(name = "media")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@AttributeOverride(name = "id", column = @Column(name = "id_media", columnDefinition = "SERIAL"))
public class Media extends EntityBase {

    @Column(name = "media", nullable = true, columnDefinition = "bytea")
    private byte[] media;

    @Column(name = "media_tipo", length = 210, nullable = false)
    private String tipo;

    @Column(name = "media_nome", length = 210, nullable = true)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "media_xeet_fk", foreignKey = @ForeignKey(name = "fk_media_xeet"))
    private Xeet xeet;
    
}
