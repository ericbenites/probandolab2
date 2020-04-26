package lab2.practicando.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table
public class countries {
    @Id
    @Column(name = "country_id")
    private String country_id;
    @Column(name= "country_name")
    private String country_name;
    @Column(name= "region_id")
    private BigDecimal region_id;
}
