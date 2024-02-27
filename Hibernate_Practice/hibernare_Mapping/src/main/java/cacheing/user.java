package cacheing;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class user 
{
  @Id
  private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
  
}
