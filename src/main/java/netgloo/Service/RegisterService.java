package netgloo.service;

import netgloo.model.Uploader;
import netgloo.repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Longlaptop on 11/29/2016.
 */
@Service
public class RegisterService {
    @Autowired
    private RegisterRepo registerRepo;
    public void createUser(Uploader uploader) {
        registerRepo.save(uploader);
    }
}
