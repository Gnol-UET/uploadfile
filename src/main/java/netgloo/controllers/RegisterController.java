package netgloo.controllers;

import netgloo.model.Uploader;
import netgloo.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Longlaptop on 11/29/2016.
 */
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void createUser(@RequestBody Uploader uploader){
        registerService.createUser(uploader);
    }

}
