package uz.pdp.vazifa_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Timestamp date;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Currency currency;
    private String factureNumber;
    @Column(nullable = false,unique = true)
    private String code;
    @ManyToOne
    private Client client;
}
