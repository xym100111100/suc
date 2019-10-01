package rebue.suc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rebue.suc.jo.SucUserJo;

public interface SucUserDao extends JpaRepository<SucUserJo, java.lang.Long> {
}
