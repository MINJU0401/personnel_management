import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "benefits")
@Table(name = "benefits")
public class BenefitsEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "benefit")
  private String benefit;

  @Column(name = "employee_id")
  private Integer employeeId;

  public BenefitsEntity(Integer employeeId, String benefit) {
    this.employeeId = employeeId;
    this.benefit = benefit;
  }
}
