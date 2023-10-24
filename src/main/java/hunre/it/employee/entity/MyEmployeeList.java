package hunre.it.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="MyEmployees")
public class MyEmployeeList {

  @Id
  private int id;

  private String maNv;

  private String tenNhanVien;

  private String tenPhongBan;

  private String gioiTinh;

  private int tuoi;

}
