package netgloo.repository;

import netgloo.model.Uploader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Longlaptop on 11/29/2016.
 */
@Repository
public interface RegisterRepo extends CrudRepository<Uploader,Long>{

}
