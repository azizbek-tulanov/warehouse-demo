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
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Timestamp date;
    @ManyToOne
    private Supplier supplier;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Currency currency;
    private String factureNumber;
    @Column(nullable = false,unique = true)
    private String code;
}
