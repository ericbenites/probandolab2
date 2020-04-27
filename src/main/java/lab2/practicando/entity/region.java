package lab2.practicando.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "regions")
public class region {
    @Id
    @Column(nullable = false)
    private BigDecimal region_id;
    private String region_name;

    public BigDecimal getRegion_id() {
        return region_id;
    }

    public void setRegion_id(BigDecimal region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
}
