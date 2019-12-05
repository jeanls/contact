package leal.jean.contact.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "phones")
@Entity
public class Phone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Contact contact;
    @Column(name = "number")
    private String number;
    @Column(name = "phoneType")
    private String phoneType;
}
