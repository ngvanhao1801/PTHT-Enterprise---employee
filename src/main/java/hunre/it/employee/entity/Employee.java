package hunre.it.employee.entity;

import jakarta.persistence.*;
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

  private String maNv;

  private String tenNhanVien;

  private String tenPhongBan;

  private String gioiTinh;

  private int tuoi;

}
