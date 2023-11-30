package hunre.it.employee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;

  @NotEmpty
  private String maNv;

  @NotEmpty
  private String tenNhanVien;

  @NotEmpty
  private String tenPhongBan;

  @NotEmpty
  private String gioiTinh;

  @NotEmpty
  private int tuoi;

}
